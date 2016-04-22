package com.designedpattern.decorator.impl;

import com.designedpattern.decorator.Decorator;

public class DecoratorA extends Decorator{

	public void showSelf() {
		System.out.println("==== start DecoratorA's function====");
		getComponent().showSelf();
		System.out.println("====  end decoratorA's fuction  ====");
	}

}
