package calculator;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * this class handels the entry values for the stack.
 * @author Leo Nguyen
 *
 */

public class Stack {
  private ArrayList<Entry> entries = new ArrayList<Entry>();
  
  //This variable adds as a pointer adjusted by the pop and push.
  private int size = 0; 
  
  /**
   * implementation of the stack with entry objects.
   */
  public Stack() {
    super();
  }
  
  
  /**
   * Adds the entry onto the stack incrementing the pointer (size).
   * 
   * @param entry - The entry is stored onto the stack.
   */
  
  public void push(Entry entry) {
    entries.add(entry);
    size++;
  }
  
  
  /**
   * This function uses size to get the last item put into the stack.
   * 
   * @return Last item put into the stack (top of stack)
   */
  
  public Entry top() throws EmptyStackException {
    if (size() == 0) {
      throw new EmptyStackException();
    } else {
      return entries.get(size() - 1); //looks at top of stack (last item put into stack)
    }
  }
  
  /**
   * This returns the Size of the stack.
   * @return This function is a getter for size.
   *
   */
  
  public int size() {
    return this.size;
  }
  
  
  /**
   * Using the array and size the function returns the top of the stack 
   * removing the item from the stack.
   * @return Removes the top item in stack and returns the entry
   */
  
  
  public Entry pop() throws EmptyStackException {
    if (size == 0) {
      throw new EmptyStackException();
    } else {
      size = size - 1;
      Entry item = entries.get(size);
      entries.remove(size);
      return item;
    }
  }
  
  
  
  
}

