package calculator;

import java.util.EmptyStackException;

/**
 * Stack designed for string input such as () / +- etc.
 * @author Leo Nguyen
 *
 */
public class StrStack {
  private final Stack strStack;

  /** 
   * constructor declares empty stack. for string items.
   */
  public StrStack() {
    this.strStack = new Stack();

  }

  /** 
   * returns if stack is empty or not.
   *
   * @return boolean false if stack is not empty
   */
  public final boolean isEmpty() {
    return 0 == this.strStack.size();
  }
  
  
  /** 
   * pushes string on stack.
   *
   * @param str String adding to stack.
   */
  public final void push(final String str) {
    this.strStack.push(new Entry(str));
  }

  /**
   * removes item from stack and returns it (top item).
   *
   * @return String representation of the item on top of stack
   * 
   * @throws EmptyStackException if empty
   */
  public final String pop() throws EmptyStackException {
    try {
      return this.strStack.pop().getString();
    } catch (BadTypeException e) { //this can never happen
      return "null";
    }
  }

}
