package calculator;

import java.util.EmptyStackException;

/**
 * facade of stack for numeric values for reverse polish.
 * @author Leo Nguyen
 *
 */
public class NumStack {
  public final Stack numStack;
  //size = 0; (used to for test for pop and push)
  
  
  
  /**
   * facade of the stack for numerical items.
   */
  public NumStack() {
    this.numStack = new Stack();
  }
  
  /**
   *  removes and returns the item on the top of the stack.
   * @return the top item on the stack
   * @throws EmptyStackException if the stack is empty throw error
   */
  public final float pop() throws EmptyStackException {
    try {
      //size -= 1; (used to for test for pop and push)
      return this.numStack.pop().getValue();
    } catch (BadTypeException e) {
      return -1;
    }
  }
      
  /**
   * function checks if the stack is empty or not.
   * @return boolean if it is empty
   */
  public final boolean isEmpty() {
    return (0 == this.numStack.size());
  }
  
  /**
   * push function to add item onto the stack.
   * @param item adds to numstack
   */
  
  public final void push(final float item) {
    //size ++; (used to for test for pop and push)
    this.numStack.push(new Entry(item));
  }
}
