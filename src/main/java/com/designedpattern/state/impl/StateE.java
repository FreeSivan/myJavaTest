package com.designedpattern.state.impl;

import com.designedpattern.state.State;

public class StateE extends State{

	@Override
	public void handle() {
		System.out.println("End state!");
	}

}
