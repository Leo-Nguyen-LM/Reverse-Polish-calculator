package calculator;

/**
 * ENUMS where used to holds all the different systems for the calculator.
 * 
 * @author Leo Nguyen
 *
 */

public enum Symbol {
  /**
   * Inputing the left bracket symbol for the calculator.
   */
  LEFT_BRACKET("("),
  /**
   * Inputing the right bracket symbol for the calculator.
   */
  RIGHT_BRACKET(")"),
  /**
   * Inputing the times symbol for the calculator.
   */
  TIMES("*"),
  /**
   * Inputing the divide symbol for the calculator.
   */
  DIVIDE("/"),
  /**
   * Inputing the plus symbol for the calculator.
   */
  PLUS("+"),
  /**
   * Inputing the minus symbol for the calculator.
   */
  MINUS("-"),
  /**
   * Inputing the invalid symbol for the calculator.
   */
  INVALID("?");
  
  /**
   * String for Symbol.
   */
  String symbolString;
  /**
   * This String is for the simplistic version of the corresponding symbol.
   * @param SymbolString simplistic string for symbols.
   * @return toString  returns simplistic string saved in SymbolString.
   */

  private Symbol(String string) {
    this.symbolString = string;
  }
  /**
   * The To String for the symbols.
   */
  
  @Override
  public String toString() {
    return symbolString;
  }
}