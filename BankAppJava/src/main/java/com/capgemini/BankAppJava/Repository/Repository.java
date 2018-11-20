package com.capgemini.BankAppJava.Repository;

import com.capgemini.BankAppJava.Beans.Account;
import com.capgemini.BankAppJava.Exceptions.InvalidAccountNumberException;

public interface Repository {
	
	public Account save(Account account);
	
	public Account findAccount(int accountNumber) throws InvalidAccountNumberException;

}
