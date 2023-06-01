package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testSymbolEnum {
  
  @Test
  public void testToString() {
    assertEquals("+", Symbol.PLUS.toString());
    assertEquals("-", Symbol.MINUS.toString());
  }

}