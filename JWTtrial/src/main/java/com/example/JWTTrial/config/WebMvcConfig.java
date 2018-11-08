package com.example.JWTTrial.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class WebMvcConfig {
	 private final long MAX_AGE_SECS = 3600;

	    @Autowired
		public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins("*")
	                .allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE")
	                .maxAge(MAX_AGE_SECS);
	    }
}
