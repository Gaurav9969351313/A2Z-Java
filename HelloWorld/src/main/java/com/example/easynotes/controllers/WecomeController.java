package com.example.easynotes.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WecomeController {

	@Value("${application.message:Hello World}")
	private String helloMessage;
	
	@GetMapping("/")
	public String welcome(Map model) {
		
		model.put("message", helloMessage);
		
		return "welcome";
	}
}