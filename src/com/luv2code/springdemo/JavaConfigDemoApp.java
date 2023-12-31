package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext( SportConfig.class);
		
		
		//get the bean from Spring container
		Coach theCoach = applicationContext.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		applicationContext.close();
	}

}
