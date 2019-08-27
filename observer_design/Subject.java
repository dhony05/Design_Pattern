package com.collabera.jump.design_pattern.observer_design;

public interface Subject {

	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
