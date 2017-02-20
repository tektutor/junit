package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SavingsAccountTest {

	@Test
	public void testWithrawWhenBalanceIs5000()
		throws InsufficientBalanceException {
	
		SavingsAccount account = new SavingsAccount();		

		//Partial mocking or spying
		SavingsAccount accountSpy = spy ( account );  

		//Stubbing
		doReturn(5000.00).when(accountSpy).getBalance();	

		double actualBalance = accountSpy.withdraw (2000.00); 
		double expectedBalance = 3000.00;

		assertEquals ( expectedBalance, actualBalance, 0.0001 );

		verify( accountSpy ).getBalance();
	}

	@Test(expected=InsufficientBalanceException.class)
	public void testWithrawWhenBalanceIsInsufficient() 
		throws InsufficientBalanceException {
	
		SavingsAccount account = new SavingsAccount();		

		//Partial mocking or spying
		SavingsAccount accountSpy = spy ( account );  

		//Stubbing
		doReturn(5000.00).when(accountSpy).getBalance();	

		double actualBalance = accountSpy.withdraw (12000.00); 

		verify( accountSpy ).getBalance();
	}
}
