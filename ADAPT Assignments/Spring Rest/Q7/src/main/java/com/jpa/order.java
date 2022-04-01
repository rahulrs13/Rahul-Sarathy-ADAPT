package com.jpa;

public class order {

	private int orderid;
	private String ordername;
	private int orderprice;
	public order(int orderid, String ordername, int orderprice) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
		this.orderprice = orderprice;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public int getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(int orderprice) {
		this.orderprice = orderprice;
	}
	@Override
	public String toString() {
		return "order [orderid=" + orderid + ", ordername=" + ordername + ", orderprice=" + orderprice + "]";
	}
	
}
