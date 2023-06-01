package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTimes {

	  //1) Test one checks if Times exist
	  @Test
	  public void testTimesExist(){
	    try {
	      Class.forName("calculator.Times");
	    }catch(ClassNotFoundException e) { //checks if class exist.
	       Assert.fail("Plus yet to be implemented");
	    }
	  }
	    
	  
	  //2) Test if Times works. Testing both the constructor and the functionality at the same time
	  @Test
	  public void TestTimes() {
		  Times times = new Times(3, 3);
		  Assertions.assertEquals(times.times(), 9);
	  }

}
