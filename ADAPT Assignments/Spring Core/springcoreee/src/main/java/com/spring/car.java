package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Controller
class car {
	@Autowired
	private road Road;
	public road getRoad() {
		return Road;
	}
	public void setRoad(road road) {
		Road = road;
	}
	void run() {
		System.out.println("Car running");
		Road.ki();
	}
}
@Repository
class bike{
	 void po() {
		 System.out.println("bike is going");
	 }
 }
@Service
class road{
void ki() {
	System.out.println("hello");
}
}