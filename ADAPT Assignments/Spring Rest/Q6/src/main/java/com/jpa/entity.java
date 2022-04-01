package com.jpa;

public class entity {

	private int a,b;
	public entity(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "entity [a=" + a + ", b=" + b + "]";
	}
	
}
