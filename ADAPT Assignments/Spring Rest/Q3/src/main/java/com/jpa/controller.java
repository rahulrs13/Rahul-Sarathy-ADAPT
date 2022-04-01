package com.jpa;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	repo r = new repo();
	
	@GetMapping("/adres")
	public List<address> getadr(){
		return r.getaddress();

	}

	@GetMapping("/zip/{zipcode}")
	public address zipcode(@PathVariable("zipcode") long zipcode) {
		return r.getzip(zipcode);
	}
		
	
}
