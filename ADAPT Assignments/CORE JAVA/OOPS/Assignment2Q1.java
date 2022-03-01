package OOPS;
class SingletonInheritanceCheck{ 
	static SingletonInheritanceCheck obj = null;
	 private SingletonInheritanceCheck(){}
	 public static SingletonInheritanceCheck getinstance() {
		 if (obj == null) 
			 obj = new SingletonInheritanceCheck();
		 return obj;
	 }
}
public class Assignment2Q1{
	public static void main(String[] args) {
		SingletonInheritanceCheck obj1 = SingletonInheritanceCheck.getinstance()
		SingletonInheritanceCheck obj2 = new SingletonInheritanceCheck();
		SingletonInheritanceCheck obj3 = new SingletonInheritanceCheck(); // restrict the instantiation of a class and ensures that only one instance
	}	
}