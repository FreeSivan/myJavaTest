package com.designedpattern.observer.impl;

import com.designedpattern.observer.Observer;

public class ObserverB extends Observer{

	@Override
	public void showSelf() {
		System.out.println("ObserverB's state = " + getState());
	}

}
