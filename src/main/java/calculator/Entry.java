package calculator;


/**
 * Entry class used to store values into a stack.
 * 
 * @author Leo Nguyen
 *
 */

public class Entry {
  
  //creating fields for Entry.
  private float number;
  private Symbol other;
  private String str;
  private Type type;
  
  /**
   * The constructor to create a new Entry for the data type float.
   * @param value the float data to be used to calculate for the entry data.
   */
  
  public Entry(float value) {
    this.number = value;
    this.type = Type.NUMBER;
  }
  
  /**
   * The constructor to create a new Entry for the ENUM data type Symbols.
   * @param other - used to determine the type of operation or BODMAS usage.
   */
  
  public Entry(Symbol other) {
    this.other = other;
    
    if (other.equals(Symbol.INVALID)) {
      this.type = Type.INVALID; 
    } else {
      this.type = Type.SYMBOL;
    }
  }
  
  /**
   * The constructor to create a new entry for the string attribute.
   * @param str - Used for determining different strings from inputs
   */
  
  public Entry(String str) {
    this.str = str;
    this.type = Type.STRING;
  }
  
  /**
   * This getter gets the type for the input string (Number, Symbol, string, invalid).
   * @return the type of value
   */
  
  public Type getType() {
    
    return this.type;
  }
  
  /**
   * This getter gets the String stored in Entry returning it.
   * @return the type of string returned
   */
  
  public String getString() throws BadTypeException {
    if (this.str == null) {
      throw new BadTypeException("No string found");
    } else {
      return this.str;
    }
  }
  
  /**
   * This getter gets the type of Symbol and returns it.
   * @return the type of Symbol returned
   */
  public Symbol getSymbol() throws BadTypeException {
    if (this.other == null) {
      throw new BadTypeException("No Symbol found");
    }
    return this.other;
  }
  
  /**
   * This getter returns the number stored in entry.
   * @return number
   */
  public float getValue() throws BadTypeException {
    if (Type.NUMBER != type) {
      throw new BadTypeException("No number found");
    }
    return this.number;
  }
  
}