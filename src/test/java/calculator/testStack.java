package calculator;
import java.util.EmptyStackException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testStack {

  @Test
  public void testStackExist(){
    try {
      Class.forName("calculator.Stack");
    }catch(ClassNotFoundException e) { //checks if class exist.
      Assert.fail("Entry yet to be implemented");
    }
  }
  
  @Test
  public void testconstructorsExist(){
    Assertions.assertDoesNotThrow(() -> {  //Test for Stack creation
      new Stack(); 
    });
  }
  
  @Test
  public void TestSizeExist() {
    Stack TestStack = new Stack();
    Assertions.assertTrue(TestStack.size() == 0);
  }
  

  @Test
  public void TestPushExist() {
    Stack TestStack = new Stack();
    Assertions.assertDoesNotThrow(() -> { //Test if push exist
      TestStack.push(new Entry((float)3.0));
    });
  }
  
  
  @Test
  public void TestPushAdds() {
    Stack TestStack = new Stack();
    TestStack.push(new Entry((float) 3.0));
    Assertions.assertTrue(TestStack.size() == 1);
    TestStack.push(new Entry((float) 4.0));
    Assertions.assertTrue(TestStack.size() == 2);
  }
  
  
  @Test
  public void TestTopExist() {  
    Stack TestStack = new Stack();
    TestStack.push(new Entry((float) 3.0));
    Assertions.assertTrue(TestStack.top().getClass().equals(Entry.class));
  }
  
  @Test
  public void TestTopWorks() throws BadTypeException {
    Stack TestStack = new Stack();
    TestStack.push(new Entry((float) 3.0));
    TestStack.push(new Entry((float) 4.0));
    Assertions.assertTrue(TestStack.top().getValue() == 4.0);
  }
  
  
  @Test
  public void getTopException() {
    Stack TestStack = new Stack();
    
    EmptyStackException Exception = Assertions.assertThrows(EmptyStackException.class, () -> {
      TestStack.top();
    });
    Assertions.assertEquals(null, Exception.getMessage());
  }
  
  
  @Test
  public void TestPopExist() {
    Stack TestStack = new Stack();
    TestStack.push(new Entry((float) 3.0));
    Assertions.assertTrue(TestStack.pop().getClass().equals(Entry.class));
  }
  
  @Test
  public void TestPopWorks() {
    Stack TestStack = new Stack();
    TestStack.push(new Entry((float) 3.0));
    TestStack.pop();
    Assertions.assertTrue(TestStack.size() == 0);
  }
  
  
  @Test
  public void getPopException() {
    Stack TestStack = new Stack();
    
    EmptyStackException Exception = Assertions.assertThrows(EmptyStackException.class, () -> {
      TestStack.pop();
    });
    Assertions.assertEquals(null, Exception.getMessage());
  }
  
  @Test
  public void TestMultipleAddRemove() throws BadTypeException {
    Stack TestStack = new Stack();
    Assertions.assertTrue(TestStack.size() == 0);
    TestStack.push(new Entry((float) 3.0));
    Assertions.assertTrue(TestStack.size() == 1);
    TestStack.push(new Entry((float) 5.0));
    TestStack.push(new Entry((float) 7.0));
    Assertions.assertTrue(TestStack.size() == 3);
    Assertions.assertTrue(TestStack.pop().getValue() == 7);
    Assertions.assertTrue(TestStack.size() == 2);
  }
  
  @Test
  public void TestTopMultiple() throws BadTypeException {
    Stack TestStack = new Stack();
    TestStack.push(new Entry((float) 5.0));
    TestStack.push(new Entry((float) 6.0));
    TestStack.push(new Entry((float) 8.0));
    Assertions.assertTrue(TestStack.top().getValue() == 8.0);
    TestStack.pop();
    Assertions.assertTrue(TestStack.top().getValue() == 6.0);
  }
 

}
