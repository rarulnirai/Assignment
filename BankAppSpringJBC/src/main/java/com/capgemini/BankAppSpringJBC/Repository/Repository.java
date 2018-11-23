package com.capgemini.BankAppSpringJBC.Repository;

import com.capgemini.BankAppSpringJBC.Beans.Account;
import com.capgemini.BankAppSpringJBC.Exceptions.InvalidAccountNumberException;

public interface Repository {
	
	public Account save(Account account);
	
	public Account findAccount(int accountNumber) throws InvalidAccountNumberException;

}
