package com.jpa;

import java.util.ArrayList;
import java.util.List;

public class repo {

	List<address> l = new ArrayList<address>();
	
	public List<address> getaddress(){
		l.add(new address("Tamil Nadu","Chennai","India",600028));
		l.add(new address("Karnataka","Banglore","India",210206));
		l.add(new address("Kerala","Ernakulam","India",600028));
		l.add(new address("AK","ANCHORAGE","US",600028));
					
		return l;
	}
	public address getzip(long zipcode) {
	
		for (address zip : l) {
			if (zip.getZipcode()==zipcode)
				return zip;
		}
		return null;
}
}
