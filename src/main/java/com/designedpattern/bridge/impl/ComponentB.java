package com.designedpattern.bridge.impl;

import com.designedpattern.bridge.Component;

public class ComponentB extends Component{

	@Override
	public void action1() {
		System.out.println("ComponentB's call style");
		getImpl().realAction1();
	}

	@Override
	public void action2() {
		System.out.println("ComponentB's call style");
		getImpl().realAction2();
	}

}
