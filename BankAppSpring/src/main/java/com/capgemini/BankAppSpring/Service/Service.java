package com.capgemini.BankAppSpring.Service;

import com.capgemini.BankAppSpring.Beans.Account;
import com.capgemini.BankAppSpring.Exceptions.InsufficientBalanceException;
import com.capgemini.BankAppSpring.Exceptions.InsufficientOpeningBalance;
import com.capgemini.BankAppSpring.Exceptions.InvalidAccountNumberException;

public interface Service {
	
	public Account createAccount(int accountNumber, String name, int amount) throws InvalidAccountNumberException, Exception;
	
	public Account depositAccount(int accountNumber, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance;
	
	public Account withdrawAmount(int accountNumber, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance, InsufficientBalanceException;
	
	public Account fundTransfer(int accountNumberFrom, int accountNumberTo, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance, InsufficientBalanceException;

}
