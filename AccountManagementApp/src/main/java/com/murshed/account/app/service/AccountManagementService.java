package com.murshed.account.app.service;

/** Service layer which implements controller methods and use hibernate to acces database
 * 
 * @author Murshed
 */


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murshed.account.app.dao.AccountManagementDao;
import com.murshed.account.app.entities.Account;

@Service
public class AccountManagementService {

	@Autowired
	private AccountManagementDao accountManagementDao; 
	
		

	public Account addAccount(Account account) {
			return accountManagementDao.save(account);
	}


	public Optional<Account> getAccountById(Integer accountId) {
			return accountManagementDao.findById(accountId);
	}


	public Iterable<Account> getAllAccounts() {
		return accountManagementDao.findAll();
	}


	public void deleteAccount(Integer accountId) {
		accountManagementDao.deleteById(accountId);
		
	}

	
	
	
	
}

	
	



	
	
	

