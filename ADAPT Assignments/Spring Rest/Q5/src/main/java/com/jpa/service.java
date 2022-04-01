package com.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class service {

	@Autowired
	private repository repo;
	
	public static List<employee> l = new ArrayList<employee>();
	
	void create(){
		
		repo.save(new employee(1,"Yuvi","Testing","QA",32000));
		repo.save(new employee(2,"Doni","Cyber","Developer",92501));
		repo.save(new employee(3,"Kholi","Database","Analyst",72013));
		repo.save(new employee(4,"Heemas","Java","Developer",20643));
	}
	
	public List<employee> get(){
		create();
		return repo.findAll();
	}
	public void addemp(employee e) {
		repo.save(e);
	}
	public void updateemp(employee emplo,int id) {
		if(id == emplo.getEmpid()) {
           repo.save(emplo);			
		}

	}
	public void deleteAllEmp() {
		repo.deleteAll();
		
	}
}
