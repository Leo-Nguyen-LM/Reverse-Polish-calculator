package calculator;

/** multiplcation class.
 *
 * @author Leo Nguyen
 *
 */
public class Times {

  private float input1;
  private float input2;

  /** multiply constructor. 
   *
   * @param input1 The first operand 
   * 
   * @param input2 The second operand
   */
  public Times(float input1, float input2) {
    this.input1 = input1;
    this.input2 = input2;
  }

  /**
   * Addition operation.
   *
   * @return The sum as a float
   */
  public float times() {
    return this.input1 * this.input2;
  }
}
