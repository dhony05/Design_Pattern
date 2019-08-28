package com.collabera.jump.design_pattern.bridge_design;

public class TestTheRemote {

	public static void main(String[] args) {
		
		
		RemoteButton theTV = new TVRemoteMute(new TVDevice(1,200));
		
		RemoteButton theTV2 = new TVRemoteMute(new TVDevice(1,200));
		
		System.out.println("Test TV with Mute");
		
		theTV.buttonFivePressed();
		theTV.buttonSixPressed();
		theTV.buttonNinePressed();
		
		System.out.println("\nTest tv with pause  ");
		
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonSixPressed();
		theTV2.buttonNinePressed();
		theTV2.deviceFeedback();
	}
}
