package OOPS;
abstract class vehicle{
	abstract void start(); {
	System.out.print("Hello");      //declared entire class abstract
}
	}
abstract final class car{	// cannot be final
}
private abstract class auto{ // cannot be private
}
class bike extends vehicle{
	@Override
	void start() {
		System.out.print("Hi");
	}
}
abstract class scooty{      //can declare a class abstract without having any abstract method
}
public class Assignment2Q4 {
	public static void main(String[] args) {
		vehicle s= new vehicle(); //cannot be instantiated
	}
}
