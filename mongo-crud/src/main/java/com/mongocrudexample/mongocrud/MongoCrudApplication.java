package com.mongocrudexample.mongocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoCrudApplication {

	/*
	 http://localhost:5001/pets/
	 
	 POST http://localhost:8080/pets
	 {"name" : "Liam", "species" : "cat", "breed" : "tabby"}
	 
	 PUT http://localhost:8080/pets/5aecef5b6d55754834124df3
	 {"name" : "Liam", "species" : "cat", "breed" : "siamese"}
	 
	 DELETE http://localhost:8080/pets/5aecef5b6d55754834124df3
	 
	 http://localhost:5001/pets/5c95cca5ff642c22008c5f79
	 * */
	
	public static void main(String[] args) {
		SpringApplication.run(MongoCrudApplication.class, args);
	}

}
