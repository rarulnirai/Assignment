package com.capgemini.BankAppSpringJBC.Service;

import com.capgemini.BankAppSpringJBC.Beans.Account;
import com.capgemini.BankAppSpringJBC.Exceptions.InsufficientBalanceException;
import com.capgemini.BankAppSpringJBC.Exceptions.InsufficientOpeningBalance;
import com.capgemini.BankAppSpringJBC.Exceptions.InvalidAccountNumberException;

public interface Service {
	
	public Account createAccount(int accountNumber, String name, int amount) throws InvalidAccountNumberException, Exception;
	
	public Account depositAccount(int accountNumber, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance;
	
	public Account withdrawAmount(int accountNumber, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance, InsufficientBalanceException;
	
	public Account fundTransfer(int accountNumberFrom, int accountNumberTo, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance, InsufficientBalanceException;

}
