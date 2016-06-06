package com.designedpattern.springprototype.impl;

import com.designedpattern.springprototype.IComponent;

public class ComponentB implements IComponent{

	public void showSelf() {
		System.out.println("ComponentB = " + this);
	}

}
