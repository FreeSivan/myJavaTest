package com.designedpattern.observer;

public abstract class Observer {

	private Target target;
	
	private String state;
	
	public abstract void showSelf();

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void pullState() {
		setState(target.getState());
		showSelf();
	}
}
