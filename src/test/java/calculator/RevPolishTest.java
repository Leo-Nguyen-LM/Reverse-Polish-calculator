package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RevPolishTest {

	  //1) Test one checks if RevPolsih exist
	  @Test
	  public void testRevPolishExist(){
	    try {
	      Class.forName("calculator.RevPolishCalc");
	    }catch(ClassNotFoundException e) { //checks if class exist.
	       Assert.fail("RevPolsih yet to be implemented");
	    }
	  }
	  
	  //2) now I test if results correlate for revpolish 
	  @Test
	  public void testEvaluate() throws InvalidExpressionException { //3) added as would not work after adding exception
		  RevPolishCalc revpolish = new RevPolishCalc();
		  Assertions.assertEquals(revpolish.evaluate("1 1 +"), (float)2);
		  Assertions.assertEquals(revpolish.evaluate("1 1 -"), (float)0);
		  Assertions.assertEquals(revpolish.evaluate("2 2 *"), (float)4);
		  Assertions.assertEquals(revpolish.evaluate("4 2 /"), (float)2);
	  }
	  
	  
	  //4) Testing if throws error for zero exception
	  @Test
	  public void testInvalidExpression() {
		  RevPolishCalc revpolish = new RevPolishCalc();
		  InvalidExpressionException Exception = Assertions.assertThrows(InvalidExpressionException.class, () -> {
		        revpolish.evaluate("4 0 /");
		      });
		  
	  }
	  
	  //4) Testing if throws error for null exception
	  @Test
	  public void testNullInvalidExpression() {
		  RevPolishCalc revpolish = new RevPolishCalc();
		  InvalidExpressionException Exception = Assertions.assertThrows(InvalidExpressionException.class, () -> {
		        revpolish.evaluate("");
		      });
	  }
	  
	  //5) Testing for max value error.
	  @Test
	  public void testMaxInvalidExpression() {
		  RevPolishCalc revpolish = new RevPolishCalc();
		  InvalidExpressionException Exception = Assertions.assertThrows(InvalidExpressionException.class, () -> {
		        revpolish.evaluate(" 340282346638528860000000000000000000000000000 1 +");
		      });
	  }
	  
	  
	  //5) Testing for min value error.
	  @Test
	  public void testminInvalidExpression() {
		  RevPolishCalc revpolish = new RevPolishCalc();
		  InvalidExpressionException Exception = Assertions.assertThrows(InvalidExpressionException.class, () -> {
		        revpolish.evaluate(" -340282346638528860000000000000000000000000000 1 -");
		      });
	  }
	  
	  
	  //6) Testing multiple calcuations
	  @Test
	  public void testmultiple() throws InvalidExpressionException {
		  RevPolishCalc revpolish = new RevPolishCalc();
		  float answer = revpolish.evaluate("2 2 +");
		  answer += revpolish.evaluate("1 1 -");
		  answer += revpolish.evaluate("6 6 *");
		  Assertions.assertEquals(answer, (float)40);
	  }
	 

}
