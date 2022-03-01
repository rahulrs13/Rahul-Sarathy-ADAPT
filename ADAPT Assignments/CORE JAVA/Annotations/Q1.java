package Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
}
class appqo{
	@Test
     void run() {
    	 System.out.println("HOW");
     }
}
public class Q1 {
	public static void main(String[] args) {
		appqo s = new appqo();
		s.run();
	}
}
