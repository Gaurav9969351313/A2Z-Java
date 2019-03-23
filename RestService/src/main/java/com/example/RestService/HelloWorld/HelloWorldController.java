package com.example.RestService.HelloWorld;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class HelloWorldController {
	
	//@RequestMapping(method=RequestMethod.GET, path="helloworld")
	@GetMapping(path="helloworld")
	public String helloWorld() {
		return "Shree Swami Samartha";
	}
	
	@GetMapping(path="helloworldbean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Shree Swami Samartha Bean");
	}
	
	@GetMapping(path="helloworldbean/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name ) {
		throw new RuntimeException("Contact Support Error Happened");
		//return new HelloWorldBean(String.format("Shree Swami Samartha Bean, %s", name));
	}
}
