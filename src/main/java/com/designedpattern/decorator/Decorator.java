package com.designedpattern.decorator;


public abstract class Decorator implements IComponent{
	
	private IComponent component;

	public IComponent getComponent() {
		return component;
	}

	public void setComponent(IComponent component) {
		this.component = component;
	}
	
}
