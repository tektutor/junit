package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

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

}
