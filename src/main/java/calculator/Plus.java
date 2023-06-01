package calculator;

/**
 * plus class.
 *
 * @author Leo Nguyen
 *
 */
public class Plus {

  private float input1;
  private float input2;

  /** The constructor for the plus operand. 
   *
   * @param input1 The first operand. 
   *
   * @param input2 The second operand. 
   */
  public Plus(float input1, float input2) {
    this.input1 = input1;
    this.input2 = input2;
  }

  /**
   * Addition operation.
   *
   * @return The sum as a float
   */
  public float plus() {
    return input1 + input2;
  }
}
