package com.designedpattern.observer.impl;

import com.designedpattern.observer.Observer;

public class ObserverA extends Observer{

	@Override
	public void showSelf() {
		System.out.println("ObserverA's state = " + getState());
	}

}
