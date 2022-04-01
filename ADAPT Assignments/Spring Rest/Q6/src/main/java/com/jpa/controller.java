package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	private serviece serv;
	
	@RequestMapping("/add")
	 public int getaddnum() {
		 return serv.add(4, 12);
	 }
	 @RequestMapping("/sub")
	 public int getsub() {
		 return serv.sub(14, 9);
	 }
	 @RequestMapping("/mul")
	 public int getmul() {
		 return serv.mul(9, 2);
	 }
	 @RequestMapping("/divi")
	 public double getdiv() {
		 return serv.div(25, 5);
	 }
}
