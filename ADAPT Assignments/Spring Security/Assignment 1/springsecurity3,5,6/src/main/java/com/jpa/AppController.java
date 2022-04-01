package com.jpa;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


	@GetMapping("/")
	public String getWelcome(){
		return "Welcome";
	}
	
	@GetMapping("/admin")
	public String getAdmin(){
		return "Welcome Admin";
	}
	
	@GetMapping("/user")
	public String getUser(){
		return "Welcome user";
	}
}
