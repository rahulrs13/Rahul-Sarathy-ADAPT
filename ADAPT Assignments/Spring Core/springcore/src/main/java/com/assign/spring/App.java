package com.assign.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("comass.xml");
        Customer c = (Customer) context.getBean("Cust");
        c.cusad();
        
        Question a = (Question) context.getBean("ques");
        a.print();
       
        spel s = (spel) context.getBean("spel");
        System.out.println(s.toString());
    }
}
