package com.example.easynotes;

import org.springframework.boot.SpringApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcApplication {
//	private static final Logger logger = LoggerFactory.getLogger(SpringBootJdbcApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
//		logger.debug("--Application Started--");
	}
}
