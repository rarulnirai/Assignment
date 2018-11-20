package com.capgemini.BankAppSpring.Service;

import com.capgemini.BankAppSpring.Beans.Account;
import com.capgemini.BankAppSpring.Exceptions.InsufficientBalanceException;
import com.capgemini.BankAppSpring.Exceptions.InsufficientOpeningBalance;
import com.capgemini.BankAppSpring.Exceptions.InvalidAccountNumberException;
import com.capgemini.BankAppSpring.Repository.Repository;

public class ServiceImpl implements Service{
	private Repository repos;

	public ServiceImpl(Repository repos) {
		super();
		this.repos = repos;
	}

	public Account createAccount(int accountNumber, String name, int amount) throws Exception {
		String acountStr = String.valueOf(accountNumber);
		if(acountStr == null || acountStr.length() < 4 || acountStr.equals(""))
		{
			throw new InvalidAccountNumberException("Please ensure that valid account number is entered");
		}
		if(name == null || name == "")
		{
			throw new Exception("Please enter a name");
		}
		if(amount < 0)
		{
			throw new InsufficientOpeningBalance("Insufficient ammount for opening account!");
		}
		Account acc = new Account(accountNumber, name, amount);
		repos.save(acc);
		return acc;
	}

	public Account depositAccount(int accountNumber, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance {
		String acountStr = String.valueOf(accountNumber);
		if(acountStr == null || acountStr.length() < 4 || acountStr.equals(""))
		{
			throw new InvalidAccountNumberException("Please ensure that valid account number is entered");
		}
		if(value < 0) {
			throw new InsufficientOpeningBalance("Amount cannot be lesser than 0!");
		}
		Account acc = repos.findAccount(accountNumber);
		acc.setAmount(acc.getAmount() + value);
		return acc;
	}

	public Account withdrawAmount(int accountNumber, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance, InsufficientBalanceException {
		String acountStr = String.valueOf(accountNumber);
		if(acountStr == null || acountStr.length() < 4 || acountStr.equals(""))
		{
			throw new InvalidAccountNumberException("Please ensure that valid account number is entered");
		}
		if(value < 0) {
			throw new InsufficientOpeningBalance("Amount cannot be lesser than 0!");
		}
		Account acc = repos.findAccount(accountNumber);
		if(acc.getAmount() < value) {
			throw new InsufficientBalanceException("Insufficient Balance to do withdrawal");
		}
		acc.setAmount(acc.getAmount() - value);
		return acc;
	}

	public Account fundTransfer(int accountNumberFrom,int accountNumberTo, int value) throws InvalidAccountNumberException, InsufficientOpeningBalance, InsufficientBalanceException {
		String acountFromStr = String.valueOf(accountNumberFrom);
		String acountToStr = String.valueOf(accountNumberTo);
		if(acountFromStr == null || acountFromStr.length() < 4 || acountFromStr.equals("")) {
			throw new InvalidAccountNumberException("Please ensure that Sender's account number is valid");
		}
		if(acountToStr == null || acountToStr.length() < 4 || acountToStr.equals("")) {
			throw new InvalidAccountNumberException("Please ensure that recepient's account number is valid");
		}
		if(value < 0) {
			throw new InsufficientOpeningBalance("Amount cannot be lesser than 0!");
		}
		Account accFrom = repos.findAccount(accountNumberFrom);
		Account accTo = repos.findAccount(accountNumberTo);
		if(accFrom.getAmount() < value) {
			throw new InsufficientBalanceException("Insufficient Balance to do transfer");
		}
		accFrom.setAmount(accFrom.getAmount() - value);
		accTo.setAmount(accTo.getAmount() + value);
		return accFrom;
	}

}
