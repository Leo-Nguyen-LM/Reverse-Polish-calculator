package calculator;



/**
 * Class to revpolish encapsulation.
 *
 * @author Leo Nguyen
 *
 */
public class CalcModel {
  private final Calculator revPolish;
  private final Calculator standardCalc;
  private float mem;
  private String answer;

  /**
   * so far this calcualtor will give the result of a revpolish answer.
   */
  public CalcModel() {
    this.revPolish = new RevPolishCalc();
    this.standardCalc = new StandardCalc();
    this.mem = 0;
  }

  /**
   * Get last answer the calculator has returned.
   *
   * @return mem The last result as a float
   */
  public float getMemory() {
    return this.mem;
  }

  /**
   * String of value of calculation.
   *
   * @return string representation of memory
   */
  public String toString(float mem) {
    return String.valueOf(mem);
  }

  /**
   * The top method which calls the relevant evaluate method.
   *
   * @param expr  The String to be evaluated
   *
   * @param infix Is this an infix expression as Boolean
   *
   * @return the result of the calculation as a float
   *
   * @throws InvalidExpressionException If the calculation is invalid throw this
   *                                    exception and the error message
   */
  public final float evaluate(String expr, boolean infix) throws InvalidExpressionException {
    float result = 0;
    if (!infix) {
      result = this.revPolish.evaluate(expr);
      mem = result;
      System.out.println(result);
      return result;
    } else {
      result = this.standardCalc.evaluate(expr);
      mem = result;
      System.out.println(result);
      return result;
    }
  }

  /**
   * Returns if the calculation is in Polish.
   *
   * @param input The String representation of the calculation
   * 
   * @return False if Polish, true when Infix
   */
  public Boolean isPolish(String input) {
    if (input == null || input == "") {
      return false;
    }
    return !(Character.isDigit(input.charAt(input.length() - 1)) 
        || input.charAt(input.length() - 1) == ')');
  }

  /**
   * Getter for the answer of the calculation.
   *
   * @return answer The result of the calculation as a String
   */
  public String getValue() {
    return answer;
  }
}
