package calculator;


/**
 * Bad exception error for no type found.
 * 
 * @author Leo Nguyen
 */


public class BadTypeException extends Exception {

  private static final long serialVersionUID = 8103455150489603354L;
  
  /**
   * Bad Type Exception error for Entry class.
   * 
   * @param errorMessage returns the selected error message.
   */
  public BadTypeException(String errorMessage) {
    super(errorMessage);
  }
}
