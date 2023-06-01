package calculator;

/**
 * Creates model and view
 * adding an observer to be updating changes made.
 * @author Leo Nguyen
 *
 */
public class CalcController {
 
  private CalcModel model;
  private ViewInterface view;
  
  /**
   * Constructor for CalcController. Assigning 
   * CalcModel and CalcView.
   */
  public CalcController(ViewInterface view, CalcModel model) { //CalcModel model
    this.view = view;
    this.model = model;
    view.mainObserver(this::calculate);
  }
  
  /**
   * Used to notify when calculation is required.
   */
  private void calculate() {
    String input = view.getExpression();
    String answer = null;
    
    if (this.view.getSetting() == true) {
      try {
        answer = model.evaluate(input, true) + "";
        view.setAnswer(answer);
      } catch (InvalidExpressionException e) {
        answer = "ERROR";
      }
    } else {
      try {
        answer = model.evaluate(input, false) + "";
        view.setAnswer(answer);
      } catch (InvalidExpressionException e) {
        answer = "ERROR";
      }
    }

  }
  
  /**
   * is used to notify when a change of expression
   * type is indicated.
   */
  public boolean expressionType() {
    return this.view.getSetting();
  }
  
}
