package com.jpa;

public class address {

	private String State,City,Country;
	private long zipcode;
	public address(String state, String city, String country,long zipcode) {
		super();
		State = state;
		City = city;
		Country = country;
		this.zipcode = zipcode;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "address [zipcode=" + zipcode + ", State=" + State + ", City=" + City + ", Country=" + Country + "]";
	}
	
}
