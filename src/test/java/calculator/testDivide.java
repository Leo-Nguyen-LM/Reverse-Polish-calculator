package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testDivide {

	  //1) Test one checks if Divide exist
	  @Test
	  public void testDivideExist(){
	    try {
	      Class.forName("calculator.Divide");
	    }catch(ClassNotFoundException e) { //checks if class exist.
	       Assert.fail("Plus yet to be implemented");
	    }
	  }
	    
	  
	  //2) Test if Divide works. Testing both the constructor and the functionality at the same time

	  @Test
	  public void TestDivide() throws InvalidExpressionException {//4) added invalidExpressionException 
		  Divide divide= new Divide(3, 3);
		  Assertions.assertEquals(divide.divide(), 1);
	  }
	  //3) adds divide exception (had to throw error for test 2 as class would no longer work)
	  public void testZero() {
		  Divide divide = new Divide(4,0);
		  InvalidExpressionException Exception = Assertions.assertThrows(InvalidExpressionException.class, () -> {
		        divide.divide();
		      });
	  }
}
