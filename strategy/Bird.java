package com.collabera.jump.design_pattern.strategy;

public class Bird extends Animal{

	public Bird() {
		
		super();
		
		setSound("Tweet");
		
		flyingType = new ItFlys();
	}
}
