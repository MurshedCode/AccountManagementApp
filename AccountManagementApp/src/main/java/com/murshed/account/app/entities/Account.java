package com.murshed.account.app.entities;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.EntityListeners;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

	@Entity
	@Table(name = "account")
	@EntityListeners (AuditingEntityListener.class )
	public class Account {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)  
		@Column(name ="account_id")
		@NotBlank
		private Integer accountId;
		
		@NotBlank
		@Column(name ="first_Name")
		private String firstName;
		
		@NotBlank
		@Column(name ="second_Name")
		private String secondName;
		
		@NotBlank
		@Column(name ="account_number")
		private Integer accountNumber;

		public Integer getAccountId() {
			return accountId;
		}

		public void setAccountId(Integer accountId) {
			this.accountId = accountId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSecondName() {
			return secondName;
		}

		public void setSecondName(String secondName) {
			this.secondName = secondName;
		}

		public Integer getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(Integer accountNumber) {
			this.accountNumber = accountNumber;
		}

	}

	
	
	
	
	
	
	


