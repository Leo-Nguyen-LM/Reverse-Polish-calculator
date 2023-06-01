package calculator;

import java.util.EmptyStackException;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testNumStack {

  //1) Test one checks if Numstack exist
  @Test
  public void testStackExist(){
    try {
      Class.forName("calculator.NumStack");
    }catch(ClassNotFoundException e) { //checks if class exist.
       Assert.fail("Entry yet to be implemented");
    }
  }
        
    //Do not need to test if functions or variables exist as is 
    //facade of Stack only need to test if they work but replication of previous.
    
  
  //2) Test if push function does anything at all
  @Test
  public void TestPushAdds() {
    NumStack TestStack = new NumStack();
    TestStack.push(3);
    TestStack.push(4);
  }
  
  //3) Assuming push function actually works pop function should return the correct 
  //value if not then push function incorrectly implemented or pop
  
  @Test
  public void TestPopReturns() {
      NumStack TestStack = new NumStack();
      TestStack.push(3);
      Assertions.assertTrue(TestStack.pop() == 3);
      //Assertions.assertTrue(TestStack.size == 1);
  }
  
  //4) Test if pop function correctly works by popping multiple pushed items.
  @Test
  public void TestPopReturnsMultiple() {
      NumStack TestStack = new NumStack();
      TestStack.push(3);
      TestStack.push(4);
    //Assertions.assertTrue(TestStack.size == 2);
      Assertions.assertTrue(TestStack.pop() == 4);
      Assertions.assertTrue(TestStack.pop() == 3);
    //Assertions.assertTrue(TestStack.size == 0);
  }
  
  //5) Now I test if error exception is thrown properly for pop
  @Test
  public void getPopException() {
    NumStack TestStack = new NumStack();
    
    EmptyStackException Exception = Assertions.assertThrows(EmptyStackException.class, () -> {
      TestStack.pop();
    });
    Assertions.assertEquals(null, Exception.getMessage());
  }
  
  //6) Now finally I test if the IsEmpty is correctly implemented by testing with empty stack
  public void EmptyStackTest() {
    NumStack TestStack = new NumStack();
    Assertions.assertTrue(TestStack.isEmpty() == true);
  }
  
  //7) to make sure empty is correct adding item to stack should change to false
  public void NotEmptyStackTest() {
      NumStack TestStack = new NumStack();
      TestStack.push(3);
      Assertions.assertTrue(TestStack.isEmpty() == false);
    }
}



