package com.capgemini.BankAppSpring.Repository;

import com.capgemini.BankAppSpring.Beans.Account;
import com.capgemini.BankAppSpring.Exceptions.InvalidAccountNumberException;

public interface Repository {
	
	public Account save(Account account);
	
	public Account findAccount(int accountNumber) throws InvalidAccountNumberException;

}
