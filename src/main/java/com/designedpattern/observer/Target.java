package com.designedpattern.observer;

import java.util.List;

public class Target {
	
	private String state;

	private List<Observer> observers;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		notifyToAll();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	
	public void notifyToAll() {
		for (Observer item : observers) {
			item.pullState();
		}
	}
	
}
