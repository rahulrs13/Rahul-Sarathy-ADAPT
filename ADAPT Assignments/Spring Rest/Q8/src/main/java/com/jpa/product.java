package com.jpa;

public class product {

	private int id;
	private String name;
	private float cost;
	public product(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
	
}
