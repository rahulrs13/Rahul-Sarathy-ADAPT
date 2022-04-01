package com.jpa;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.filter.Filter;

@RestController
public class controller {

	card c = new card();
	
	@GetMapping("/card/{num}")
	public String validation(@PathVariable("num") long num) {
		return c.cardValidation(num);
	}
}
