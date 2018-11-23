package com.capgemini.BankAppSpringJBC.MainImpl;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.BankAppSpringJBC.Beans.Account;
import com.capgemini.BankAppSpringJBC.Beans.AccountConfig;
import com.capgemini.BankAppSpringJBC.Service.Service;
import com.capgemini.BankAppSpringJBC.Service.ServiceImpl;
import com.capgemini.BankAppSpringJBC.Service.ServiceImplConfig;

public class MainApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(ServiceImplConfig.class);
		
		Service service = context.getBean(ServiceImpl.class);
		System.out.println("Creating account:\n" + service.createAccount(12345, "Arul", 2000));
		System.out.println(service.createAccount(54321, "Riya", 3000));
		System.out.println("\nDeposit summary:\n" + service.depositAccount(12345, 1000));
		System.out.println("\nWithdrawal summary:\n" + service.withdrawAmount(54321, 500));
		System.out.println("\nAfter FundTransfer:\n" + service.fundTransfer(12345, 54321, 500));

	}

}
