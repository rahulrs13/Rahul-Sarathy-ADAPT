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
	service serv;
	
	@GetMapping("/pro")
	public List<product> getall(){
		return this.serv.get();
	}
	
	@PostMapping("/pro")
	public void add(@RequestBody product pro) {
		serv.add(pro);
	}
	@PutMapping("/pro/{id}")
	public void update(@RequestBody product prom,@PathVariable int id) {
            serv.update(prom, id);		
	}
	
	@DeleteMapping("/pro")
	public void delete() {
		serv.delete();
	}
}
