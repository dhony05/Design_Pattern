package com.collabera.jump.design_pattern.strategy;

public interface Living {
	
	
	public abstract void setName(String newName);
	public abstract String getName();
	
	public abstract void setHeight(double newHeight);
	public abstract double  getHeight();
	
	public abstract void setFavFood(String newFood);
	public abstract String getFavFood();
	
	public abstract void setWeight(double newWeight);
	public abstract double  getWeight();
	
	public abstract void setSpeed(double newSpeed);
	public abstract String getSpeed();
	
	public abstract void setWeight(String newSound);
	public abstract double  getSound();



}
