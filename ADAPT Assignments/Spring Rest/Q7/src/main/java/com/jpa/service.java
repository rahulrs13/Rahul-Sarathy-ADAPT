package com.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {

	@Autowired
	private repository repo;
	
 public static List<order> odrs=new ArrayList<>();
 void create(){
	 
		repo.save(new order(101,"Shoes",15000));
		repo.save(new order(102,"Socks",150));
		repo.save(new order(103,"Slippers",1500));
	    repo.save(new order(104,"Shorts",1800));
		 
	}
 public List<order> get(){
		create();
		return repo.findAll();
	}
	
	public void addOrder(order o) {
		repo.save(o);
	}
	
	public void updateOrder(order op, int id) {
		if (id == op.getOrderid()) {
			repo.save(op);
		}
	}
	
	public void deleteAllOrder() {
		repo.deleteAll();
		
	}
}
