package calculator;


import java.util.Objects;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class testEntry {
  @Test
  public void testEntryExist(){
    try {
      Class.forName("calculator.Entry");
    }catch(ClassNotFoundException e) {
      Assert.fail("Entry yet to be implemented");
    }
  }
  
  @Test
  public void testConstructors() {
    Assertions.assertDoesNotThrow(() -> {  //Test for Entry constructor for float.
      new Entry((float) 3.0); 
    });
    Assertions.assertDoesNotThrow(() -> { //Test for Entry constructor for Symbol.
      new Entry(Symbol.PLUS);
    });
    Assertions.assertDoesNotThrow(() -> { //Test for Entry constructor for String
      new Entry("Test");
    });
  }
  
  
  @Test 
  public void testSymbolConstructor() { //Test if invalid symbol added then Type is also invalid
    Entry TestEntry = new Entry(Symbol.INVALID);
    Assertions.assertTrue(TestEntry.getType() == Type.INVALID);
  }
  
  @Test
  public void getTypeTest() throws BadTypeException {
    Entry TestEntry = new Entry((float) 3.0);
    Assertions.assertTrue(TestEntry.getType().getClass().equals(Type.class));
  }
  
  
  @Test
  public void getStringTest() throws BadTypeException{
    Entry TestEntry = new Entry("Test");
    Assertions.assertTrue(TestEntry.getString().getClass().equals(String.class));  
  }
  
  
  @Test
  public void getStringException() {
    Entry TestEntry = new Entry((float) 3.0);
    
    BadTypeException Exception = Assertions.assertThrows(BadTypeException.class, () -> {
      TestEntry.getString();
    });
    Assertions.assertEquals("No string found", Exception.getMessage());
  }
  
  @Test
  public void getSymbolTest() throws BadTypeException {
    Entry TestEntry = new Entry(Symbol.PLUS);
    Assertions.assertTrue(TestEntry.getSymbol().getClass().equals(Symbol.class));
    Assertions.assertFalse(Objects.isNull(TestEntry.getSymbol()));
    
  }
  
  @Test
  public void getSymbolException() {
    Entry TestEntry = new Entry((float) 3.0);
    
    BadTypeException Exception = Assertions.assertThrows(BadTypeException.class, () -> {
      TestEntry.getSymbol();
    });
    Assertions.assertEquals("No Symbol found", Exception.getMessage());
  }
  
  
  @Test
  public void getValueTest() throws BadTypeException {
    Entry TestEntry = new Entry((float) 3.0);
    Assertions.assertEquals(TestEntry.getValue(), (3.0));
  }
  
  @Test
  public void SameEntryTest() throws BadTypeException {
    Entry FirstTestEntry = new Entry((float)3.0);
    Entry SecondTestEntry = new Entry((float)3.0);
    Assertions.assertTrue(FirstTestEntry.getType().equals(SecondTestEntry.getType()));
    Assertions.assertTrue(FirstTestEntry.getValue()==SecondTestEntry.getValue());
  }
  
  @Test
  public void DifferentEntryTest() {
    Entry FirstTestEntry = new Entry((float)3.0);
    Entry SecondTestEntry = new Entry((float)4.0);
    Assertions.assertFalse(FirstTestEntry.equals(SecondTestEntry));
  }
 
}
