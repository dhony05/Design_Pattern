package com.collabera.jump.design_pattern.strategy;



class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;
	
	public Flys flyingType; // composition, allows you to chage the behavior at run time
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWeight(int newWeight) {
		
		if(newWeight > 0) {
			weight = newWeight;
		}else {
			System.out.println("Weight must be greater than 0");
		}
	}
	
	public int getWeight() {
		return weight;
	}
	public void setSound(String newSound) {
		sound = newSound;
	}
	
	public String getSound() {
		return sound;
	}
	
public void setHeight(double newHeight) {
		
		if(newHeight > 0) {
			height = newHeight;
		}else {
			System.out.println("Height must be greater than 0");
		}
	}
	
	public double getHeight() {
		return height;
	}
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}

}
