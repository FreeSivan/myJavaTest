package com.designedpattern.state.impl;

import com.designedpattern.state.State;

public class StateD extends State{

	@Override
	public void handle() {
		System.out.println("D state!");
		State state = getContainer().getStateMap().get("stateE");
		changeState(state);
	}

}
