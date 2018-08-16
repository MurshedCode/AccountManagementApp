package com.murshed.account.app.controller;

/**
 * Business logic with methods mapping uri and implements in service class
 * @author Murshed
 * 
 */

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murshed.account.app.entities.Account;
import com.murshed.account.app.service.AccountManagementService;

@RestController
@RequestMapping(value = "/api/accounts" )
public class AccountManagementController {
	
	@Autowired
	private AccountManagementService accountManagementService;
	
		
	@PostMapping(value = "/create")
	public Account addAccount(@RequestBody Account account) {
		return accountManagementService.addAccount(account);
	}
	
	
	@GetMapping(value = "/account/{accountId}")
	public Optional<Account> getAccountById(@PathVariable(value = "accountId") Integer accountId){
		return accountManagementService.getAccountById(accountId);
	}

	
	@GetMapping(value ="/account/allaccounts")
	public Iterable<Account> getAllAccounts(){
		return accountManagementService.getAllAccounts();
		
	}
	
		
	@DeleteMapping (value = "/account/{accountId}")
	public void deleteAccount(@PathVariable(value = "accountId") Integer accountId){
		accountManagementService.deleteAccount(accountId);
		
	}

}
