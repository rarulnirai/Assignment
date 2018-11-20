package com.capgemini.BankAppJava.Service;

import com.capgemini.BankAppJava.Beans.Account;
import com.capgemini.BankAppJava.Exceptions.InsufficientBalanceException;
import com.capgemini.BankAppJava.Exceptions.InsufficientOpeningBalance;
import com.capgemini.BankAppJava.Exceptions.InvalidAccountNumberException;

public interface Service {
	
	public Account createAccount(int accountNumber, String name, int amount) throws InvalidAccountNumberException, Exception;
	
	public Account depositAccount(int accountNumber, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance;
	
	public Account withdrawAmount(int accountNumber, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance, InsufficientBalanceException;
	
	public Account fundTransfer(int accountNumberFrom, int accountNumberTo, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance, InsufficientBalanceException;

}
