package com.jpa;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {

	@PostMapping("/user")
	public String validate(@RequestBody user us) {
		
		if(us.getUsername().equals("Rahul") && us.getPassword().equals("Rocky123")) {
			return new String ("Valid user");
		}
		else {
	
		return new String ("Invalid User");
		}
	}
}
