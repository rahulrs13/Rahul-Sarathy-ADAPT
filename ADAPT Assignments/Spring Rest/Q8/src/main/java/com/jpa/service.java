package com.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	@Autowired
	private repository repo;

public static	List<product> l = new ArrayList<>();
	
	void create(){
		repo.save(new product(2,"Controller",8000));
		repo.save(new product(7,"PS5",25000));
		repo.save(new product(9,"PowerBank",800));
		repo.save(new product(4,"Mouse",250));
		
	}
	public List<product> get(){
		create();
		return repo.findAll();
	}
	
	public void add(product pro) {
		repo.save(pro);
}
	public void update(product prom,int id) {
		if (id == prom.getId()) {
			repo.save(prom);
		}
	}
	
	public void delete() {
		repo.deleteAll();
	}
}
