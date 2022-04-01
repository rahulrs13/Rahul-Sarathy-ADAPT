package com.assign.spring;
import org.springframework.stereotype.Component;

@Component
public class Address {
 private String Street,City,State,Zip,Country;

public String getStreet() {
	return Street;
}

public void setStreet(String street) {
	Street = street;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getState() {
	return State;
}

public void setState(String state) {
	State = state;
}

public String getZip() {
	return Zip;
}

public void setZip(String zip) {
	Zip = zip;
}

public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}

@Override
public String toString() {
	return "Address [Street=" + Street + ", City=" + City + ", State=" + State + ", Zip=" + Zip + ", Country=" + Country
			+ "]";
}
 
	
}
