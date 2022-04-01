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
	
	@GetMapping("/ord")
	public List<order> getAllOrders(){
		return serv.get();
	}
	
	@PostMapping("/ord")
	public void addOrder(@RequestBody order o) {
		serv.addOrder(o);
	}
	
	@PutMapping("/ord/{id}")
	public void updateOrder(@RequestBody order op,@PathVariable("id") int id) {
		serv.updateOrder(op, id);
	}
	@DeleteMapping("/orde")
	public void deleteAllOrder() {
		serv.deleteAllOrder();
	}
}
	