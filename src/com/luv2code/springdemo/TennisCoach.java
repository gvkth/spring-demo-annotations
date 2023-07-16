package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	*/
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> Tennis Coach: inside default constructor");
	}
	
	//define a setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> Tennis Coach: inside setFortuneService");
		this.fortuneService =fortuneService; 
	}
	

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
