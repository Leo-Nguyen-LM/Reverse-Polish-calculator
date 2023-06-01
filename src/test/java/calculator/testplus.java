package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testplus {

	  //1) Test one checks if Plus exist
	  @Test
	  public void testPlusExist(){
	    try {
	      Class.forName("calculator.Plus");
	    }catch(ClassNotFoundException e) { //checks if class exist.
	       Assert.fail("Plus yet to be implemented");
	    }
	  }
	    
	  
	  //2) Test if plus works. Testing both the constructor and the functionality at the same time
	  @Test
	  public void TestPlus() {
		  Plus plus = new Plus(3, 3);
		  Assertions.assertEquals(plus.plus(), 6);
	  }
}
