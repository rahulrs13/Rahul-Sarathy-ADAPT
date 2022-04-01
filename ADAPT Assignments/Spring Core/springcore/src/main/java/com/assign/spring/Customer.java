package com.assign.spring;

import org.springframework.stereotype.Component;

@Component
public class Customer {
private int CustomerID;
private String CustomerName;
private int CustomerContact;
private Address CustomerAddress;
public int getCustomerID() {
	return CustomerID;
}
public void setCustomerID(int customerID) {
	CustomerID = customerID;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public int getCustomerContact() {
	return CustomerContact;
}
public void setCustomerContact(int customerContact) {
	CustomerContact = customerContact;
}
public Address getCustomerAddress() {
	return CustomerAddress;
}
public void setCustomerAddress(Address customerAddress) {
	CustomerAddress = customerAddress;
}
void cusad() {
	System.out.println("ID: "+getCustomerID()+" Name: "+getCustomerName()+" Contact: "+getCustomerContact()+" "+getCustomerAddress());
	
}


}
