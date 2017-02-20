package org.tektutor;

import java.util.Stack;

public class RPNCalculator {

	private Stack<Double> numberStack = new Stack<Double>();
	private double firstNumber,secondNumber,result;

	private void retrieveOperands() {
		secondNumber = numberStack.pop();
		firstNumber = numberStack.pop();
	}

	boolean isMathOperator ( String rpnToken ) {
		String mathOperators = "+-*/";	
		return mathOperators.contains( rpnToken );
	}

	public double evaluate ( String rpnMathExpression ) {
		String rpnTokens[] = rpnMathExpression.split(" ");

		MathOperator mathOperator =  null;

		for ( String rpnToken : rpnTokens ) {

			if ( isMathOperator( rpnToken ) ) {
				mathOperator = MathFactory.getInstance(rpnToken);
				retrieveOperands();
				result = mathOperator.compute ( firstNumber, secondNumber );
				numberStack.push(result);
			}
			else 
				numberStack.push( Double.parseDouble(rpnToken) );
		}
	
		return numberStack.pop();
	}
}
