package com.collabera.jump.design_pattern.bridge_design;

public abstract class RemoteButton {

	private EntertaimentDevice theDevice;


	public RemoteButton(EntertaimentDevice newDevice) {

		theDevice = newDevice;

	}

	public void buttonFivePressed() {

		theDevice.buttonFivePressed();
	}

	public void buttonSixPressed() {

		theDevice.buttonSixPressed();
	}
	
	public void deviceFeedback() {
		
		theDevice.deviceFeedback();
		
	}
	
	public abstract void buttonNinePressed();


}
