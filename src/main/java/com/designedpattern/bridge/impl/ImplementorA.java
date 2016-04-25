package com.designedpattern.bridge.impl;

import com.designedpattern.bridge.Implementor;

public class ImplementorA implements Implementor{

	public void realAction1() {
		System.out.println("A's action1");
	}

	public void realAction2() {
		System.out.println("A's action2");
	}

}
