package com.murshed.account.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.murshed.account.app.controller.AccountManagementController;
import com.murshed.account.app.entities.Account;
import com.murshed.account.app.service.AccountManagementService;

@RunWith(SpringRunner.class)
@WebMvcTest( value = AccountManagementController.class, secure = false)
public class AccountManagementControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private AccountManagementService accountManagementService;
	
	
	
	@Test
	public void testaddAccounts() throws Exception {
		
		Account mockAccount = new Account();
		mockAccount.setAccountId(1);
		mockAccount.setFirstName("John");
		mockAccount.setSecondName("Smith");
		mockAccount.setAccountNumber(1234);
		
		
		
		
		fail("Not yet implemented");
	}
	
	
	
	@Test
	public void testAddAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccountById() {
		fail("Not yet implemented");
	}

	

	@Test
	public void testDeleteAccount() {
		fail("Not yet implemented");
	}

	
	

}
