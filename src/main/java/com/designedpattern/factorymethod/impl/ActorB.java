package com.designedpattern.factorymethod.impl;

import com.designedpattern.factorymethod.IActor;

public class ActorB implements IActor{

	public void performA() {
		System.out.println("ActorB perform partA");
	}

	public void performB() {
		System.out.println("ActorB perform partB");
	}

	public void performC() {
		System.out.println("ActorB perform partC");
	}

}
