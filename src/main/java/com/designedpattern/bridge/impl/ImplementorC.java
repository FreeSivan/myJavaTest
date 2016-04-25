package com.designedpattern.bridge.impl;

import com.designedpattern.bridge.Implementor;

public class ImplementorC implements Implementor{

	public void realAction1() {
		System.out.println("C's action1");
	}

	public void realAction2() {
		System.out.println("C's action2");
	}

}
