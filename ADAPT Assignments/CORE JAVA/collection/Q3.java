package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class Empl implements Comparable<Empl>{
	Integer id;
	String name;
	String department;
	Integer Salary;
	public Empl(Integer id, String name, String department, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		Salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", department=" + department + ", Salary=" + Salary + "]";
	}
	@Override
	public int compareTo(Empl o) {
		if(this.getId() > o.getId()) return 1;
		else return -1;
	}
}
public class Q3 {
	class SortbyId implements Comparator<Empl> {
	    public int compare(Empl e1, Empl e2){
	    	 return e1.getId().compareTo(e2.getId());
	    }
	}
	class SortbyName implements Comparator<Empl> {
	    public int compare(Empl e1, Empl e2){
	       return e1.name.compareTo(e2.name);
	    }
	}
	class SortbyDep implements Comparator<Empl> {
	    public int compare(Empl e1, Empl e2){
	        return e1.getDepartment().compareTo(e2.getDepartment());
	    }
	}
	class SortbySal implements Comparator<Empl> {
	    public int compare(Empl e1, Empl e2)
	    {
	        return e1.getSalary().compareTo(e2.getSalary());
	    }
	}
	public static void main(String[] args) {
	Q3 mm = new Q3();
	Set<Empl> e = new TreeSet<>();
	e.add(new Empl(1,"Rahul","CSE",89128));
	e.add(new Empl(2,"Aohan","ECE",99999));
	e.add(new Empl(3,"Nahor","EEE",19929));
	e.add(new Empl(4,"Luhar","CSE",59299));
	e.add(new Empl(5,"Klua","ECE",76532));
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter choice:");
	String choice = sc.next();
	List<Empl>ll=new ArrayList<>();
	for (Empl ee : e) {
	    ll.add(ee);
	}
	switch(choice){  
    case "a": Collections.sort(ll,mm.new SortbyId());
    break;  
    case "b": Collections.sort(ll,mm.new SortbyName()); 
    break;  
    case "c": Collections.sort(ll,mm.new SortbyDep());
    break;  
    case "d": Collections.sort(ll,mm.new SortbySal()); 
    
    default:break; 
    }  

	for(Empl empp:ll) {
		System.out.println(empp.toString());
	}	
	}
}
