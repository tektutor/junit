package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class RPNCalculatorTest {

	@Test
	public void testSimpleAddition() {
		RPNCalculator rpnCalculator = new RPNCalculator();	

		double actualResult = rpnCalculator.evaluate("10 5 +");
		double expectedResult = 15.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );

		actualResult = rpnCalculator.evaluate("150 50 +");
		expectedResult = 200.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

	@Test
	public void testSimpleSubtraction() {
		RPNCalculator rpnCalculator = new RPNCalculator();	

		double actualResult = rpnCalculator.evaluate("10.0 5.0 -");
		double expectedResult = 5.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

	@Ignore
	@Test
	public void testSimpleMultiplication() {
		RPNCalculator rpnCalculator = new RPNCalculator();	

		double actualResult = rpnCalculator.evaluate("10.0 5.0 *");
		double expectedResult = 50.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

	@Test
	public void testSimpleDivision() {
		RPNCalculator rpnCalculator = new RPNCalculator();	

		double actualResult = rpnCalculator.evaluate("10.0 5.0 /");
		double expectedResult = 2.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

	@Test
	public void testComplexRPNExpression() {
		RPNCalculator rpnCalculator = new RPNCalculator();	

		double actualResult = rpnCalculator.evaluate("10.0 15.0 + 100.0 20.0 / +");
		double expectedResult = 30.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

}
