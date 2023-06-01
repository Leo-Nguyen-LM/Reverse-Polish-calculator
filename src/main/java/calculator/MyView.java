package calculator;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * This class is used for the logical aspects to interact
 * with the main GUI.
 * @author Leo Nguyen
 *
 */
public class MyView extends Application implements ViewInterface {
  // Button is an Observable JavaFX object.
  private String expression;
  private String answer;

  @FXML
  private TextField resultBox;
  @FXML
  private TextField inputBox;
  @FXML
  private Button mainButton;
  @FXML
  private RadioButton infixButton;
  @FXML
  private RadioButton reversePolishButton;
  
  private Observer mainObserver;
  public boolean isInfix = false;
  
  private static volatile MyView instance = null;

  @FXML
  void initialize() {
    instance = this;
  }
  
  /**
   * launches the GUI.
   * @return GUI
   */
  public static synchronized MyView getInstance() {
    if (instance == null) {
      new Thread(() -> Application.launch(MyView.class)).start();
      // Wait until the instance is ready since initialize has executed.
      while (instance == null) {// empty body
      }
    }

    return instance;
  }
  // End of special block
  /////////////////////////////////////////////////////////////////////////////////

  @Override
  public void start(Stage primaryStage) throws IOException {
    Parent root = FXMLLoader.load(this.getClass().getClassLoader().getResource("MyView.fxml"));
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }


  /**
   * adds observer to view main button.
   * @param f observer viewing button.
   */
  public void mainObserver(Observer f) {
    this.mainObserver = f;
  }
  
  @Override
  public void setAnswer(String str) {
    this.answer = str;
  }

  /**
   * enables all buttons.
   */
  public void menu() {
    mainButton.setDisable(false);
  }

  @Override
  public String getExpression() {
    return inputBox.getText();
  }

  @Override
  public boolean getSetting() {
    return this.isInfix;
  }
  
  @FXML
  void isPressed(ActionEvent event) {
    String input = inputBox.getText();
    this.expression = input;
    if (this.expression == "" || this.expression == null) {
      resultBox.setText("No input in input Box found");
      
    } else if (infixButton.isSelected() != true && reversePolishButton.isSelected() != true) {
      resultBox.setText("Select infix or rev Polish");
    } else {
      mainObserver.notifyObservers();
      resultBox.setText(this.answer);
    }
  }
  
  @FXML
  void settingisPressed(ActionEvent event) {
    if (infixButton.isSelected()) {
      this.isInfix = true;
    } else if (reversePolishButton.isSelected()) {
      this.isInfix = false;
    } 
  }

  @Override
  public void runMenu() {
    mainButton.setDisable(false);
    infixButton.setDisable(false);
    reversePolishButton.setDisable(false);
  }
  
  

}
