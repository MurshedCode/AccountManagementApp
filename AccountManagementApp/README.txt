
********Account Management APP

***********************************************************************


Framework Tools and platforms:
**********************************************

Application developed using SprongBoot 2.0.4.RELEASE with REST Api and Crud repository.

The database inbuilt with SpringBoot project Apache Derby.

Similar for other entreprise database using database url at application.properties file


The Test Driven Development approach has been used initially tested the controller class. JUnit test frameork used in Eclipse. Mockito frameowrk for mock data has been used.

The Spring MVC design pattern used with Tomcat application server embedded 


The code and project commited Git at url: 	https://github.com/MurshedCode/AccountManagementApp.git





TEST CASES
********************************************

AccountManagementControllerTest.java


testAddAccount()  -  Test for add new account to the database - implemented in application

testGetAccountById()  -  implemented in application




testGetAllAccounts()  - Test for list of all accounts

Can be implemented at later stage

testDeleteAccount()

Can be implemented at later stage


***********************************************************************	


Similarly the other classes can be tested too being time resources provided. The rest of classes are


AccountManagementDao.java  -- The data access object layer could be tested using Mockito 


AccountManagementService.java  -- 
