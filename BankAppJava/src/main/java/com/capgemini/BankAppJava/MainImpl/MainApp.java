package com.capgemini.BankAppJava.MainImpl;

import java.util.HashMap;

import com.capgemini.BankAppJava.Beans.Account;
import com.capgemini.BankAppJava.Repository.Repository;
import com.capgemini.BankAppJava.Repository.RepositoryImpl;
import com.capgemini.BankAppJava.Service.Service;
import com.capgemini.BankAppJava.Service.ServiceImpl;

public class MainApp {

	public static void main(String[] args) throws Exception {
		HashMap<Integer,Account> accountList = new HashMap<Integer,Account>();
		Repository repo = new RepositoryImpl(accountList);
		Service service = new ServiceImpl(repo);
		
		System.out.println(service.createAccount(12345, "Arul", 2000));
		System.out.println(service.createAccount(54321, "Riya", 1000));
		System.out.println(service.depositAccount(12345, 1000));
		System.out.println(service.withdrawAmount(54321, 10));
		System.out.println(service.fundTransfer(12345, 54321, 900));
	}

}
