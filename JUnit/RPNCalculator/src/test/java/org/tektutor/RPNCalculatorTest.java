package org.tektutor;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class RPNCalculatorTest {
	private RPNCalculator rpnCalculator = null;	

	
	@BeforeClass
	public static void oneTimeInitialization() {
		System.out.println ("One time initialization");
	}

	@Before
	public void beforeMethod() {
		rpnCalculator = new RPNCalculator();
		System.out.println ( "Before method");
	}
	
	@After
	public void afterMethod() {
		rpnCalculator = null;
		System.out.println ( "After method");
	}

	@AfterClass
	public static void oneTimeCleanup() {
		System.out.println ("One time cleanup");
	}

	@Test
	public void testSimpleAddition() {

		double actualResult = rpnCalculator.evaluate("10 5 +");
		double expectedResult = 15.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );

		actualResult = rpnCalculator.evaluate("150 50 +");
		expectedResult = 200.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

	@Test
	public void testSimpleSubtraction() {

		double actualResult = rpnCalculator.evaluate("10.0 5.0 -");
		double expectedResult = 5.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

	@Ignore
	@Test
	public void testSimpleMultiplication() {

		double actualResult = rpnCalculator.evaluate("10.0 5.0 *");
		double expectedResult = 50.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

	@Test
	public void testSimpleDivision() {

		double actualResult = rpnCalculator.evaluate("10.0 5.0 /");
		double expectedResult = 2.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

	@Test
	public void testComplexRPNExpression() {

		double actualResult = rpnCalculator.evaluate("10.0 15.0 + 100.0 20.0 / +");
		double expectedResult = 30.0;	
		assertEquals ( expectedResult, actualResult, 0.00001 );
	}

}
