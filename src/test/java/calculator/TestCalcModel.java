package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestCalcModel {
	
	
	
	
	//1 )Test if CalcModel exist
	  @Test
	  public void testCalcModelExist(){
	    try {
	      Class.forName("calculator.CalcModel");
	    }catch(ClassNotFoundException e) {
	      Assert.fail("CalcModel yet to be implemented");
	    }
	  }
	  
	  
	//2)testing Get memory
	  @Test
	  public void getMemoryTest() {
		  CalcModel model= new CalcModel();
		  Assert.assertTrue(model.getMemory() == 0);
		  //fake evalute 
		  //model.mem = 6;
		  //Assert.assertTrue(model.getMemory() == 6);   made mem public for testing purposes
	  }
	  
	  
	  //3) testing tostring getter - could not get test to work so did not use in implementations
	  @Test
	  public void testtoString() {
		  CalcModel model = new CalcModel();
		  System.out.println(model.toString());
		  Assert.assertTrue(model.toString() == "0");
		  //fake evalute 
		  //model.mem = 3246;
		  //Assert.assertTrue(model.getMemory() == "3246");   made mem public for testing purposes
	  }
	 
	  //4) testing rev polish for evaluate (faking result)
	  @Test
	  public void testevaluate() throws InvalidExpressionException {// 8)added unhandled after.
		  CalcModel model = new CalcModel();
		  Assert.assertTrue(model.evaluate("6 6 +", false) == (float)12);//had to set as false after later implentations
	  }
	  
	  //5) Testing for if is polish or not as errors arrived from Controller.
	  @Test
	  public void TestIspolish() {
		  CalcModel model = new CalcModel();
		  boolean polish = model.isPolish("3 3 +");
		  Assert.assertTrue(polish == true);
		  polish = model.isPolish("3 5 /");
		  Assert.assertTrue(polish == true);
		  polish = model.isPolish("");
		  Assert.assertTrue(polish == false);
		  
	  }
	  
	  
	  //6) added getvalue for returning value of answer
	  @Test
	  public void TestGetValue() throws InvalidExpressionException { //8) added unhandled after -added same time as 4
		  CalcModel model = new CalcModel();
		  model.evaluate("6 6 +", false); 
		  Assert.assertTrue(model.getValue() == null);//could not get t work properly. so did not use this method.
		  
	  }
	  
	  
	  
	  
	  //7) testing rev polish for evaluate (getting real result)
	  @Test
	  public void testevaluateReal() throws InvalidExpressionException {// 8)added unhandled after. - added same time as adding 4 
		  CalcModel model = new CalcModel();
		  Assert.assertTrue(model.evaluate("6 6 +", false) == (float)12);
		  Assert.assertTrue(model.evaluate("6 6 *", false) == (float)36);
		  Assert.assertTrue(model.evaluate("24 12 -", false) == (float)12);
	  }
	  
	  //8) testing standard Calc for evaluation (getting real result)
	  @Test
	  public void testStandardCalceval() throws InvalidExpressionException {
		  CalcModel model = new CalcModel();
		  Assert.assertTrue(model.evaluate("6 + 6", true) == (float)12);
		  Assert.assertTrue(model.evaluate("6 * 6", true) == (float)36);
		  Assert.assertTrue(model.evaluate("24 - 12", true) == (float)12);
	  }
	  

}
