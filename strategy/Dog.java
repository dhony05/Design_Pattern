package com.collabera.jump.design_pattern.strategy;

public class Dog extends Animal {
	
	public void digHole() {
		System.out.println("Dug a hole");
	}

	Dog(){
		//super();
		
		setSound("Bark");
		
		flyingType = new CantFly();
		
	}
}
