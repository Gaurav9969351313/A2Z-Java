package com.example.RestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {
	
	/* http://localhost:8080/authenticate 
	  {
		"username":"in28minutes",
		"password":"dummy"
	  }
	  
	  Authorization : Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU1Mzg0NTAzNywiaWF0IjoxNTUzMjQwMjM3fQ.zqpEp2joCAO5aYJFxEQAlnmywJip03rqGwvcSemoKLoEC-Hp8wJ55OSBei8XgxHH0rOfUwddDaNcKd949xFj3g
	  Origin : http://localhost:4200
	  
	  Postman interceptor download and in postman click on satelite or chatri interceptor slide munu must be on
	 
	  password is hased by BCryptPasswordEncoder Algorithm
	 */
	

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
