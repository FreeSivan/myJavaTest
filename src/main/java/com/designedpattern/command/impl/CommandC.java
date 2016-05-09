package com.designedpattern.command.impl;

import com.designedpattern.command.Command;
import com.designedpattern.command.IReceiver;

public class CommandC extends Command{

	public CommandC(){}
	
	public CommandC(IReceiver receiver) {
		super(receiver);
	}
	
	public void action() {
		System.out.println("Triple click");
		getReceiver().action();
	}

}
