package com.designedpattern.bridge.impl;

import com.designedpattern.bridge.Implementor;

public class ImplementorB implements Implementor{

	public void realAction1() {
		System.out.println("B's action1");
	}

	public void realAction2() {
		System.out.println("B's action2");
	}

}
