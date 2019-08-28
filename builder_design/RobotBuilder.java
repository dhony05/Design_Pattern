package com.collabera.jump.design_pattern.builder_design;

//Defines the methods needed for creating parts 
//for the robot

public interface RobotBuilder {
	
	public void buildRobotHead();
	
	public void buildRobotTorso();
	
	public void buildRobotArms();
	
	public void buildRobotLegs();
	
	public Robot getRobot();
	
}