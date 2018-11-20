package com.capgemini.BankAppSpring.Exceptions;

public class InsufficientOpeningBalance extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientOpeningBalance(String message) {
		super(message);
	}

}
