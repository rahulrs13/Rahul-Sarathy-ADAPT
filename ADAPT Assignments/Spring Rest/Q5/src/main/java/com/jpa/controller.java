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
	
	@GetMapping("/emp")
	public List<employee> get(){
		return serv.get();
	}
	
	@PostMapping("/emp")
	public void addemp(@RequestBody employee e) {
		serv.addemp(e);
	}
	@PutMapping("/emp/{id}")
	public void updateemp(@RequestBody employee emplo,@PathVariable int id) {
		serv.updateemp(emplo, id);
	}
	@DeleteMapping("/deleteemp")
	public void deleteAllEmp() {
	serv.deleteAllEmp();
		
	}
}
