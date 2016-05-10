package com.designedpattern.state.impl;

import java.util.Random;

import com.designedpattern.state.State;

public class StateA extends State{

	@Override
	public void handle() {
		System.out.println("Start state!");
		Random random = new Random();
		int tmp = random.nextInt(2);
		switch(tmp) {
		case 0: {
			State state = getContainer().getStateMap().get("stateB");
			changeState(state);
			break;
		}
		case 1: {
			State state = getContainer().getStateMap().get("stateC");
			changeState(state);
			break;
		}
		case 2: {
			State state = getContainer().getStateMap().get("stateD");
			changeState(state);
			break;
		}
		default: {
			break;
		}
		}
	}

}
