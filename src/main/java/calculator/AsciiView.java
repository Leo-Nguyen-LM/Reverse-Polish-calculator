package calculator;

import java.util.Scanner;

/**
 * A terminal based version of the working
 * calculator.
 * @author Leo Nguyen.
 *
 */
public class AsciiView implements ViewInterface {

  private String expression;
  private String answer;
  private Observer mainObserver;
  
  /**
   * constructor for implenting AsciiView.
   */
  public AsciiView() {
    super();
  }
  
  /**
   * uses the ViewInterface for implementation.
   * running the calculator on the terminal
   */
  public void runMenu() {
    System.out.println("Calculator terminal view");
    System.out.println("________________________");
    
    boolean run = true;
    
    while (run == true) {
      System.out.println("Enter expression: ");
      Scanner input = new Scanner(System.in);
      this.expression = input.nextLine().trim();
      if (expression == "" || expression == null) {
        run = false;
        input.close();
        break;
      } else {
        mainObserver.notifyObservers();
        System.out.println("solution: " + answer);
        input.close();
      }
    }
  }

  @Override
  public void setAnswer(String str) {
    this.answer = str;
    
  }

  @Override
  public String getExpression() {
    return this.expression;
  }
  
  //still need to do
  
  /**
   * gets if is infix.
   */
  public boolean getSetting() {
    return false;
  }
  
  /**
   * Adding main observer.
   */
  public void mainObserver(Observer f) {
    this.mainObserver = f;
  }
}
