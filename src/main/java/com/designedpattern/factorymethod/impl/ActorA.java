package com.designedpattern.factorymethod.impl;

import com.designedpattern.factorymethod.IActor;

public class ActorA implements IActor{

	public void performA() {
		System.out.println("ActorA perform partA");
	}

	public void performB() {
		System.out.println("ActorA perform partB");
	}

	public void performC() {
		System.out.println("ActorA perform partC");
	}

}
