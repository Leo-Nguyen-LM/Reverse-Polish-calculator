package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestMinus {

	  //1) Test one checks if Minus exist
	  @Test
	  public void testMinusExist(){
	    try {
	      Class.forName("calculator.Minus");
	    }catch(ClassNotFoundException e) { //checks if class exist.
	       Assert.fail("Plus yet to be implemented");
	    }
	  }
	    
	  
	  //2) Test if Minus works. Testing both the constructor and the functionality at the same time
	  @Test
	  public void TestPlus() {
		  Minus minus = new Minus(3, 3);
		  Assertions.assertEquals(minus.minus(), 0);
	  }
}
