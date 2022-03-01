package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{
	int Sequence();
}
class Myclass{
@Execute(Sequence = 2)
public void myMethod1() {
	System.out.println("One");
}
@Execute(Sequence = 1)
public void myMethod2() {
	System.out.println("Two");
}
@Execute(Sequence = 3)
public void myMethod3() {
	System.out.println("Three");
}
}
public class Q3 {
	public static void main(String[] args) throws Exception {
		Myclass h=new Myclass();  
		Method m=h.getClass().getMethod("myMethod1");  
		Method z=h.getClass().getMethod("myMethod2");
		Method q=h.getClass().getMethod("myMethod3");  
		Execute manno=m.getAnnotation(Execute.class);
		Execute ma=z.getAnnotation(Execute.class);
		Execute no=q.getAnnotation(Execute.class);
		System.out.println(ma);
		System.out.println(manno);  
		System.out.println(no);
	}
}