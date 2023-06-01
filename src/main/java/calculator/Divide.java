package calculator;


/**
 * Divide class.
 * 
 *
 * @author Leo Nguyen
 *
 */
public class Divide {

  private float input1;
  private float input2;

  /**
   * Constructor for divide.
   *
   * @param input1 First Operand
   *
   * @param input2 Second Operand
   */
  public Divide(float input1, float input2) {
    this.input1 = input1;
    this.input2 = input2;
  }

  /**
   * Division operation.
   *
   * @return The result of the division calculation
   */
  public float divide() throws InvalidExpressionException {
    if (input1 == 0) {
      throw new InvalidExpressionException("Zero Division"); // Do not divide by zero 
    }
    return input2 / input1;
  }
}
