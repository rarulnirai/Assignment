package com.capgemini.BankAppSpringJBC.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {
	
	@Bean
	public Account account1() {
		return new Account(12345, "Arul", 2000);
	}
	
	@Bean
	public Account account2() {
		return new Account(54321, "Riya", 2000);
	}

}
