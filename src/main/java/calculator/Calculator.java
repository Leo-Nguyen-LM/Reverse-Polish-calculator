package calculator;

/**
 * interface to encapsulte 
 * evaluate.
 * 
 * @author Leo Nguyen
 *
 */
@FunctionalInterface
public interface Calculator {

  /**
   *define interface. 
   * @param str string calcualtion input.
   * @throws InvalidExpressionException when logic or math error.
   */
  public float evaluate(String str) throws InvalidExpressionException;

}
