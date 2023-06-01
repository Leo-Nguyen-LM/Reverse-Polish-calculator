package calculator;


/**
 * InvalidExpressionException error for no invalid input found.
 * 
 * @author Leo Nguyen
 */


public class InvalidExpressionException extends Exception {

  private static final long serialVersionUID = 1L;

  /**
   * InvalidExpressionException for CalcController class.
   * 
   * @param errorMessage returns the selected error message.
   */
  public InvalidExpressionException(String errorMessage) {
    super(errorMessage);
  }
}
