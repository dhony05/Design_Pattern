package com.collabera.jump.design_pattern.bridge_design;

public class TVDevice extends EntertaimentDevice{
	
	
	public TVDevice(int newDeviceState, int newMaxSetting) {
		
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}

	@Override
	public void buttonFivePressed() {
		System.out.println("Channel Down");
		
		deviceState --;
		
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Channel UP");
		
		deviceState ++;
	}

}
