package com.murshed.account.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Optional;
import java.util.function.IntPredicate;

import org.apache.tomcat.util.http.parser.MediaType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	public void testaddAccount() throws Exception {
		
		Account mockAccount = new Account();
		mockAccount.setAccountId(1);
		mockAccount.setFirstName("John");
		mockAccount.setSecondName("Smith");
		mockAccount.setAccountNumber(1234);
		
		
		String inpuInJson = this.mapToJson(mockAccount);
		String URI = " /api/accounts/create";
		
		Mockito.when(accountManagementService.addAccount(Mockito.any(Account.class))).thenReturn(mockAccount);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post(URI)
				.accept(MediaType.APPLICATION_JSON).content(inpuInJson)
				.contentType(MediaType.APPLICATION_JSON);
				
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		
		String outputInJson = response.getContentAsString();
		
		assertThat(outputInJson).isEqualTo(inpuInJson);
		assertEquals(HttpStatus.OK.value(), response.getStatus());
		
	}
	
	
	@Test
	public void testGetAccountById() throws Exception {
		
		Account mockAccount = new  Account();
		mockAccount.setAccountId(1);
		mockAccount.setFirstName("John");
		mockAccount.setSecondName("Smith");
		mockAccount.setAccountNumber(1234);
		
		Mockito.when(accountManagementService.getAccountById(Mockito.anyInt())).thenReturn(mockAccount);
		
		String URI = "/api/accounts/account/accountId/1";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI)
				.accept(MediaType.APPLICATION_JSON);
	
	
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String espectedJson = this.mapToJson(mockAccount);
		String outputInJson = result.getResponse().getContentAsString();
		
		assertThat(outputInJson).isEqualTo(espectedJson);
		
	}

	
	
	
	
	
	
	

	/**
	 * Maps an object into JSON string   * @param object
	 * 
	 */
	
	private String mapToJson(Object object ) throws JsonProcessingException	{
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}

	
	

}
