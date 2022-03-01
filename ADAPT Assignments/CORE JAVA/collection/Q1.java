package collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
class contact implements Comparable<contact>{
	String name;
	String email;
	String gender;
	public contact(String name, String email,String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "contact [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	public int compareTo(contact o) {
		return this.name.compareTo(o.name);
	}
}
class phonenumber implements Comparable<phonenumber>{
	long number;

	public phonenumber(long number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "phonenumber [number=" + number + "]";
	}
	public int compareTo(phonenumber o) {
		return this.toString().compareTo(o.toString());
	}
}
public class Q1 {
	public static void main(String[] args) {
	    contact c1 = new contact("Rahul","yoyo@yoymail","Male");
	    contact c2 = new contact("Luhar","koyo@yokmail","Male");
	    contact c3 = new contact("Shyam","pop@bobomail","Male");
	    contact c4 = new contact("Jithan","jojo@yoymail","Male");
	    
	    phonenumber p1 = new phonenumber(97897876);
	    phonenumber p2 = new phonenumber(87654332);
	    phonenumber p3 = new phonenumber(98769876);
	    phonenumber p4 = new phonenumber(89012345);
	    
	    Map<phonenumber,contact> s = new TreeMap<>();
	    s.put(p1, c1);
	    s.put(p2, c2);
	    s.put(p3, c3);
	    s.put(p4, c4);
	    for (Entry<phonenumber, contact> entry :s.entrySet()) {
	        System.out.println(entry.getKey());
			}
	    for (Entry<phonenumber, contact> en :s.entrySet()) {
	    	System.out.println(en.getValue());
	    	
	    }
	    for (Entry<phonenumber, contact> ent :s.entrySet()) {
	    	System.out.println(ent);
	    }
	    }
}