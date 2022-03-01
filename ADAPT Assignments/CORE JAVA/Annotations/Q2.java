package Annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
int AuthorID();
String Author()default"None";
String Supervisor() default"None";
String Date();
String Time();
String Version();
String Description() default"NA";
}
@info(AuthorID=2233,Author="Rahul",Date="12-04-2022",Time="10:21",Version="Java 11")
class developer{
	void dev() {
		System.out.println("Hello");
	}
}
public class Q2 {
	public static void main(String[] args) {
		developer s = new developer();
		s.dev();
	    Class a = s.getClass();
	    java.lang.annotation.Annotation p = a.getAnnotation(info.class);
	    info i = (info)p;
	    System.out.println(i);
	}
}