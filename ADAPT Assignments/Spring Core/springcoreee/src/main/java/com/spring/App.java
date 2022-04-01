package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        car s = (car) context.getBean(car.class);
        s.run();
        bike a = (bike) context.getBean(bike.class);
        a.po();
        brand b= (brand) context.getBean(brand.class);
        b.bren();
    }
}
