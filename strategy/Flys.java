package com.collabera.jump.design_pattern.strategy;

public interface Flys {
	
	String fly();

}


class ItFlys implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
	   return "Flying High";
	}
	
	
	
	
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I can't fly";
	}
	
}
