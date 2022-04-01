package com.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	private service serv;

	@GetMapping("/cus")
	public List<customer> get(){
		return serv.get();
	}
	
	@PostMapping("/cus")
	public void addord(@RequestBody customer order) {
		serv.add(order);
	}
	
	@PutMapping("/cus/{id}")
	public void update(@RequestBody customer cust,@PathVariable int id) {
	         serv.update(cust, id);
	}
	
	@DeleteMapping("/cus")
	public void delete(customer q) {
		this.serv.delete(q);
	}
}
