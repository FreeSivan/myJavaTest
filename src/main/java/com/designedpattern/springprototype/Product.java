package com.designedpattern.springprototype;

public class Product implements IComponent{
	
	private IComponent component;

	public IComponent getComponent() {
		return component;
	}

	public void setComponent(IComponent component) {
		this.component = component;
	}

	public void showSelf() {
		System.out.println("object = " + this);
		component.showSelf();
	}
	
}
