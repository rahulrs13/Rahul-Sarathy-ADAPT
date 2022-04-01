package com.jpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/")
	public String view() {
		return "Welcome Rahul!";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Welcome User";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin";
}
}