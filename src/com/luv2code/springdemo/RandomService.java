package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RandomService implements FortuneService {

	String[] dataFortune = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	
	//create a random number generator
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(dataFortune.length);
		
		String theFortune = dataFortune[index];
				
		return theFortune;
	}

}
