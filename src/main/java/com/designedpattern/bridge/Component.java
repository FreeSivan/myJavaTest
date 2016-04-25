package com.designedpattern.bridge;

public abstract class Component {
	
	private Implementor impl;

	public Implementor getImpl() {
		return impl;
	}

	public void setImpl(Implementor impl) {
		this.impl = impl;
	}
	
	public abstract void action1();
	
	public abstract void action2();
	
}
