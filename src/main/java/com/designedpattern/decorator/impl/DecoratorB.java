package com.designedpattern.decorator.impl;

import com.designedpattern.decorator.Decorator;

public class DecoratorB extends Decorator{

	public void showSelf() {
		System.out.println("==== start DecoratorB's function====");
		getComponent().showSelf();
		System.out.println("====  end decoratorB's fuction  ====");
	}

}
