package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestStandardCalc {
	
	//1) Test if standard Calc Exist
	@Test
	void testStandardCalc() {
	    try {
		      Class.forName("calculator.StandardCalc");
		    }catch(ClassNotFoundException e) {
		      Assert.fail("StandardCalc yet to be implemented");
		    }
	}
	
	
	//@Test
	//2)getting the bodmas of the calculation.
	//public void pemdasTest() {
	//	StandardCalc calc = new StandardCalc();
	//	Assert.assertEquals(calc.pemdas(Symbol.MINUS), 1);
	//	Assert.assertEquals(calc.pemdas(Symbol.PLUS), 1);
	//	Assert.assertEquals(calc.pemdas(Symbol.DIVIDE), 2);   4) had to comment out as no longer works after making pemdas private.
	//	Assert.assertEquals(calc.pemdas(Symbol.TIMES), 2);
	//	Assert.assertEquals(calc.pemdas(Symbol.LEFT_BRACKET), 3);
	//}
	
	//@SuppressWarnings("deprecation")
	//3) Test if values are correctly changed into rev polish
	//@Test
	//void testEvaluateRight() {
	//	StandardCalc calc = new StandardCalc();
	//	Assert.assertEquals(calc.evaluate("9 + 10"), "9 10 +");
	//	Assert.assertEquals(calc.evaluate("15 * 6"), "15 6 *");  5) no longer works as changed to rev polish calc in class
	//	Assert.assertEquals(calc.evaluate("9 / 16"), "9 16 /");
	//}
	
	
	//5) gets the answer by passing through revpolish
	@Test
	public void Answers() throws InvalidExpressionException {
		StandardCalc calc = new StandardCalc();
		Assert.assertEquals(calc.evaluate("9 + 10"), (float)19,1e-15);
		Assert.assertEquals(calc.evaluate("10 * 6"), (float)60,1e-15);
	}
	
	//6) checks of the value is null.
	@Test
	public void testNullInvalidExpression() {
		StandardCalc calc = new StandardCalc();
		  InvalidExpressionException Exception = Assertions.assertThrows(InvalidExpressionException.class, () -> {
		        calc.evaluate("");
		      });
	  }
	
	
	//7) checks if expressino is valid
	@Test
	public void testInvalidExpression() {
		StandardCalc calc = new StandardCalc();
		  InvalidExpressionException Exception = Assertions.assertThrows(InvalidExpressionException.class, () -> {
		        calc.evaluate("342 435 +");
		      });
	  }

}