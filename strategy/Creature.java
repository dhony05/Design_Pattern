package com.collabera.jump.design_pattern.strategy;

//cannot create an object from a abstract class
abstract public class Creature {
	
	protected String name;
	protected int weight;
	protected String sound;
	
	public abstract void setName(String newName);
	public abstract String getName();
	
	public abstract void setWeight(double newWeight);
	public abstract double  getWeight();

}
