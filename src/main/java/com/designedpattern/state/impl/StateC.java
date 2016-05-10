package com.designedpattern.state.impl;

import java.util.Random;

import com.designedpattern.state.State;

public class StateC extends State{

	@Override
	public void handle() {
		System.out.println("C state!");
		Random random = new Random();
		int tmp = random.nextInt(1);
		switch(tmp) {
		case 0: {
			State state = getContainer().getStateMap().get("stateD");
			changeState(state);
			break;
		}
		case 1: {
			State state = getContainer().getStateMap().get("stateE");
			changeState(state);
			break;
		}
		default: {
			break;
		}
		}
	}

}
