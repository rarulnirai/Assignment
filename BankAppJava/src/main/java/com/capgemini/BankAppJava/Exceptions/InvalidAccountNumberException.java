package com.capgemini.BankAppJava.Exceptions;

public class InvalidAccountNumberException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidAccountNumberException(String message) {
		super(message);
	}

}
