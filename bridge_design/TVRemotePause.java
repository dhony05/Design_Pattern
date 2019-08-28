package com.collabera.jump.design_pattern.bridge_design;

public class TVRemotePause extends RemoteButton{

	public TVRemotePause(EntertaimentDevice newDevice) {
		super(newDevice);
		
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV was Paused");
		
	}

}
