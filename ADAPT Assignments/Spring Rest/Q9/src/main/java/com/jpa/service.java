package com.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {

	@Autowired
	private repository repo;
	
	public static List<customer> list = new ArrayList<>();
	
	void create(){
		repo.save(new customer(21,"Shyam",23,"M"));
		repo.save(new customer(35,"Priya",38,"F"));
		repo.save(new customer(84,"Jithin",26,"M"));
		repo.save(new customer(91,"Shreya",21,"F"));
		
	}
	
	public List<customer> get(){
		create();
		return repo.findAll();
	}
	
	public void add(customer cus) {
		repo.save(cus);
	}
       public void update(customer cust, int id) {
		if (id == cust.getId()) {
			repo.save(cust);
		}
	}
       public void delete(customer o) {
    	   repo.deleteAll();
       }
}
