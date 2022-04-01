package com.jpa;

import org.springframework.stereotype.Service;

@Service
public class serviece {

	 public int add(int a,int b) {
		 return a+b;
	 }
	 public int sub(int a,int b) {
		 return a-b;
	 }
	 public int mul(int a,int b) {
		 return a*b;
	 }
	 public double div(int a,int b) {
		 return a/b;
	 }
}
