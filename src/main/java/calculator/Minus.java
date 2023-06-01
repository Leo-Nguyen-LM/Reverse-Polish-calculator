package calculator;

/** minus class. 
 *
 * @author Leo Nguyen
 *
 */
public class Minus {
  
  private float input1;
  private float input2;
  
  /** Minus operation. 
   *
   * @param input1 The first operand 
   *
   * @param input2 The second operand 
   */
  public Minus(float input1, float input2) {
    this.input2 = input2;
    this.input1 = input1;
  }
  
  /** Performs the calculation. 
   *
   * @return Result of the calculation as float 
   */
  public float minus() {
    return input1 - input2;
  }
}
