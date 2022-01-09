# EmployeeManager-SpringDataJPA-SpringDataREST
  This application is build using Spring Boot and it's an employee manager application which performs all the CRUD operations.
  
  
## 1)Technologies/Libraries used
- IDE: Eclipse 
- Server: Apache Tomcat v9.0
- Database: MySQL v8.0.27
- Testing the routes: Postman  v8.7.0
- Dependencies: MySQL Driver, Spring Web, Spring Data JPA, Spring Data REST and Spring Boot DevTools
 By using Spring Data JPA and Spring Data REST we eliminated a lot of boilerplate code.
	
	
## 2) Features
  The application performs the next operations/requests at the following routes:
	
| HTTP method      |                                  | CRUD Action |
| -----------------|----------------------            | ----- |
| GET              | /magic-api/employees                  | Read a list of customers|
| GET              | /magic-api/employees/{employeeId}	    | Read a single customer |
| POST             | /magic-api/employees                  | Create a new customer |
| PUT              | /magic-api/employees/{employeeId}          	    | Update an existing customer |
| DELETE           | /magic-api/employees/{employeeId}    | Delete an existing customer |
