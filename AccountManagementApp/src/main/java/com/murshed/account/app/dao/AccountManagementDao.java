package com.murshed.account.app.dao;

/**
 *  This application I used Spring Boot inbuilt SQL database for demo application.
 *  application.properties file can be used for entreprise database connection in production level.
 *  
 *   @author Murshed 
 */


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.murshed.account.app.entities.Account;

@Repository
public interface AccountManagementDao extends CrudRepository<Account, Integer> {

}
