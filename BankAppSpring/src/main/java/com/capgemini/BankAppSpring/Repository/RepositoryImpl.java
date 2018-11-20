package com.capgemini.BankAppSpring.Repository;

import java.util.HashMap;

import com.capgemini.BankAppSpring.Beans.Account;
import com.capgemini.BankAppSpring.Exceptions.InvalidAccountNumberException;

public class RepositoryImpl implements Repository{
	private HashMap<Integer,Account> accountList;

	public RepositoryImpl(HashMap<Integer,Account> accountList) {
		this.accountList = accountList;
	}

	public Account save(Account account) {
		accountList.put(account.getAccountNumber(),account);
		return account;
	}

	public Account findAccount(int accountNumber) throws InvalidAccountNumberException {
		Account acc = null;
		for(Integer ac : accountList.keySet()) {
			if(ac == accountNumber) {
				acc = accountList.get(ac);
//				System.out.println(acc);
			}
		}
		if(acc == null) {
			throw new InvalidAccountNumberException("Account does not exist!");
		}
		return acc;
	}

}
