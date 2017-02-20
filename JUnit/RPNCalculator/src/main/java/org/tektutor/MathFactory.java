package org.tektutor;

import java.util.HashMap;

public class MathFactory {
	private static HashMap<String,String> mathOperatorToClassNameMap
			= new HashMap<String,String>(); 

	static {
		mathOperatorToClassNameMap.put("+", "org.tektutor.Addition");
		mathOperatorToClassNameMap.put("-", "org.tektutor.Subtraction");
		mathOperatorToClassNameMap.put("*", "org.tektutor.Multiplication");
		mathOperatorToClassNameMap.put("/", "org.tektutor.Division");
	}

	public static MathOperator getInstance(String mathOperator) {
	
		MathOperator mathOperation = null;

		try {
		mathOperation = (MathOperator) Class.forName ( 
			mathOperatorToClassNameMap.get( mathOperator ) ).newInstance();
		}
		catch ( Exception exception) {

		}

		return mathOperation;
	}

}
