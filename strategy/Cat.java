package com.collabera.jump.design_pattern.strategy;

public class Cat extends Animal {
	
	public void digHole() {
		System.out.println("Dug a hole");
	}

	public Cat(){
		super();
		
		setSound("Meaw");
	}
}
