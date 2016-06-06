package com.designedpattern.springprototype.impl;

import com.designedpattern.springprototype.IComponent;

public class ComponentA implements IComponent{

	public void showSelf() {
		System.out.println("ComponentA = " + this);
	}

}
