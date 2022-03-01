package OOPS;
import java.util.ArrayList;
class Employee{
class Manager extends Assignment2Q2 {
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}
class Labour extends Assignment2Q2 {
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}
}
public class Assignment2Q2 {
	static int salary = 10000;
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int sum = 0;
    	for (int i=0;i<=employeeSalaries.size()-1;i++) {
    		sum +=employeeSalaries.get(i);
    	}
    	return sum;
    }
    public static void main(String[] args) {
    	ArrayList<Integer> employeeSalaries = new ArrayList<>();
    	Employee s = new Employee();
    	Employee.Labour obj1 = s.new Labour();
    	Employee.Manager obj2 = s.new Manager();
    	employeeSalaries.add(obj1.getSalary(salary));
    	employeeSalaries.add(obj2.getSalary(salary));
    	System.out.println(totalEmployeesSalary(employeeSalaries));	
    }
}
