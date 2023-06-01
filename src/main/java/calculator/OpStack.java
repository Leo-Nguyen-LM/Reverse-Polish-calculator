package calculator;

import java.util.EmptyStackException;

/**
 * Facade above the Stack for symbols.
 * @author Leo Nguyen
 * 
 */
public class OpStack {

  private final Stack opstack;

  /**
   * Constructor creating empty stack to be used.
   */
  public OpStack() {
    this.opstack = new Stack();
  }

  /**
   * checks if stack is empty.
   * @return boolean True when there is an empty Stack.
   */
  public final boolean isEmpty() {
    return (0 == this.opstack.size());
  }

  /**
   * returns item top of stack and removes from stack.
   *
   * @return type symbol.
   *
   * @throws EmptyStackException Can not pop from an empty Stack.
   */
  public final Symbol pop() throws EmptyStackException {
    try {
      return this.opstack.pop().getSymbol();
    } catch (BadTypeException e) {
      return Symbol.INVALID;
    }
  }

  /**
   * pushes symbol on opstack.
   *
   * @param symbol Enum
   */
  public final void push(final Symbol symbol) {
    this.opstack.push(new Entry(symbol));
  }
}
