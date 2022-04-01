package scoreassi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main( String[] args ){
	    
        ApplicationContext context = new ClassPathXmlApplicationContext("scoreass.xml");
         
        tyre t = (tyre) context.getBean("ty"); 
        t.print();
		 
        appcontext a = (appcontext) context.getBean("appcontext");
        int e= a.draw(3);
        System.out.println(e);
         
         beaninit b = (beaninit) context.getBean("be");
         b.sys();
         b.init();
         b.dest();
         b.initbeaninit();
         b.destbeaninit();
    beanlife q = (beanlife) context.getBean("bl");
    q.getMessage();
    q.init();
    q.destroy();
}
}