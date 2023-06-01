package calculator;

/**
 * The logic for the gui stored as an interface.
 * @author Leo Nguyen.
 *
 */
public interface ViewInterface {
 
  /**
   * sets the answer to a specific string.
   * 
   * @param str sets the answer as a string format
   */
  public void setAnswer(String str);
  
  /**
   * getter to return expression.
   * @return returns the set expression.
   */
  public String getExpression();
  
  /**
   * gets if infix.
   * @return if is infix
   */
  public boolean getSetting();
  
  /**
   * runs main program.
   */
  public void runMenu();
  
  /**
   * opens main observer to watch buttons.
   * @param f observer watching.
   */
  void mainObserver(Observer f);
}