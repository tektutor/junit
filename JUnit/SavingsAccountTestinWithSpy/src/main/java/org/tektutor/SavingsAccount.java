package org.tektutor;

public class SavingsAccount {

	public double getBalance() {
		System.out.println ("Assume some database interaction happens here");
		return 80000.00;
	}

	public double withdraw ( double amountToBeWithdrawn ) 
		throws InsufficientBalanceException {

		double balance = getBalance();		

		if ( balance < amountToBeWithdrawn ) 
			throw new InsufficientBalanceException();
		
		balance = balance - amountToBeWithdrawn;
		return balance;
	}

}
