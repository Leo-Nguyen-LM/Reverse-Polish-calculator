package calculator;

import java.util.EmptyStackException;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testStrStack {

      //1) Test one checks if Strstack exist
      @Test
      public void testStackExist(){
        try {
          Class.forName("calculator.StrStack");
        }catch(ClassNotFoundException e) { //checks if class exist.
           Assert.fail("Entry yet to be implemented");
        }
      }
        //Do not need to test if functions or variables exist as is 
        //facade of Stack only need to test if they work but replication of previous.
        
      
      //2) Test if push function does anything at all (duplicate of num stack except different types added)
      @Test
      public void TestPushAdds() {
        StrStack TestStack = new StrStack();
        TestStack.push("hello");
        TestStack.push("Help");
      }
      
      //3) Assuming push function actually works pop function should return the correct 
      //value if not then push function incorrectly implemented or pop (same implementation as num stack 
      //except for the value change.
      
      @Test
      public void TestPopReturns() {
          StrStack TestStack = new StrStack();
          TestStack.push("hello");
          Assertions.assertTrue(TestStack.pop() == "hello");
          //Assertions.assertTrue(TestStack.size == 1);
      }
      
      //4) Test if pop function correctly works by popping multiple pushed items.
      //duplcate of num stack test but different return symbol.
      @Test
      public void TestPopReturnsMultiple() {
        StrStack TestStack = new StrStack();
          TestStack.push("helo");
          TestStack.push("help");
        //Assertions.assertTrue(TestStack.size == 2);
          Assertions.assertTrue(TestStack.pop() == "help");
          Assertions.assertTrue(TestStack.pop() == "helo");
        //Assertions.assertTrue(TestStack.size == 0);
      }
      
      //5) Now I test if error exception is thrown properly for pop
      //when popped if empty or erroronous input then should return invalid
      //duplcate of num stack except value change and output.)
      @Test
      public void getPopException() {
        StrStack TestStack = new StrStack();
        
        EmptyStackException Exception = Assertions.assertThrows(EmptyStackException.class, () -> {
          TestStack.pop();
        });
        Assertions.assertEquals(null, Exception.getMessage());
        //Assertions.assertEquals(TestStack.pop(), "null");
        //attempted to get equal for return value does.
      }
      
      //6) Now finally I test if the IsEmpty is correctly implemented by testing with empty stack
      //same as numstack.
      public void EmptyStackTest() {
        StrStack TestStack = new StrStack();
        Assertions.assertTrue(TestStack.isEmpty() == true);
      }
      
      //7) to make sure empty is correct adding item to stack should change to false
      //(same as numstack except change of values.
      public void NotEmptyStackTest() {
        StrStack TestStack = new StrStack();
          TestStack.push("hello");
          Assertions.assertTrue(TestStack.isEmpty() == false);
        }
}
