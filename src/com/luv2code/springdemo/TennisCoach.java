package com.luv2code.springdemo;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	/**
	 * Qualifier with constructor*/
	@Autowired
	public TennisCoach(@Qualifier("randomService") FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(">> Tennis Coach: pre destroy");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println(">> Tennis Coach: post construct");
	}
	
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> Tennis Coach: inside default constructor");
	}
	
	//define a setter method
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> Tennis Coach: inside setFortuneService");
		this.fortuneService =fortuneService; 
	}
	*/
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
