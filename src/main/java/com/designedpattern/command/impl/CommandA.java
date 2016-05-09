package com.designedpattern.command.impl;

import com.designedpattern.command.Command;
import com.designedpattern.command.IReceiver;

public class CommandA extends Command{
	
	public CommandA(){}
	
	public CommandA(IReceiver receiver) {
		super(receiver);
	}
	
	public void action() {
		System.out.println("Single click");
		getReceiver().action();
	}

}
