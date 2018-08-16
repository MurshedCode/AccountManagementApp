package com.murshed.account.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.murshed.account.app.entities.Account;
import com.murshed.account.app.service.AccountManagementService;

@SpringBootApplication
public class AccountManagementApp {

	public static void main(String[] args) {
ConfigurableApplicationContext applicationContext = SpringApplication.run(AccountManagementApp.class, args);
		
		AccountManagementService accountManagementService	= applicationContext.getBean("accountManagementService", AccountManagementService.class);
	
		Account account = new Account();
		account.setFirstName("Murshed");
		account.setSecondName("Smith");
		account.setAccountId(1234);
		
		accountManagementService.addAccount(account);
		
		
		
		
	}
}
