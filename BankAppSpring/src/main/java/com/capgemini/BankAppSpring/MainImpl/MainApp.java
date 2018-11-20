package com.capgemini.BankAppSpring.MainImpl;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.BankAppSpring.Beans.Account;
import com.capgemini.BankAppSpring.Service.Service;

public class MainApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Service service = (Service) context.getBean("service");
		Account a = (Account) context.getBean("account");
		Account b = (Account) context.getBean("account1");
		
		
		System.out.println("Creating account for customer A:\n" + service.createAccount(a.getAccountNumber(),a.getName(),a.getAmount()));
		System.out.println("Creating account for customer B:\n" + service.createAccount(b.getAccountNumber(),b.getName(),b.getAmount()));
		System.out.println();
		System.out.println("Deposit summary:\n" + service.depositAccount(a.getAccountNumber(), 3000));
		System.out.println("Deposit summary:\n" + service.depositAccount(b.getAccountNumber(), 200));
		System.out.println();
		System.out.println("Withdrawal summary:\n" + service.withdrawAmount(b.getAccountNumber(), 500));
		System.out.println("\nFundTransfer:\n" + service.fundTransfer(a.getAccountNumber(), b.getAccountNumber(), 2500));
	}

}
