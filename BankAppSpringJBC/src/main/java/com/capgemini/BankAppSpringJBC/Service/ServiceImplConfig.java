package com.capgemini.BankAppSpringJBC.Service;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.BankAppSpringJBC.Beans.Account;
import com.capgemini.BankAppSpringJBC.Repository.RepositoryImpl;

@Configuration
public class ServiceImplConfig {

	@Bean
	public Service serviceImpl() {
		HashMap<Integer, Account> accountList = new HashMap<Integer, Account>();
		return new ServiceImpl(new RepositoryImpl(accountList));
	}
}
