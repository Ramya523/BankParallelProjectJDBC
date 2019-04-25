package com.cg.bank.utility;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException()
	{
		System.out.println("Insufficient amount in your account");
	}
}
