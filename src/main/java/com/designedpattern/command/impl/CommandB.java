package com.designedpattern.command.impl;

import com.designedpattern.command.Command;
import com.designedpattern.command.IReceiver;

public class CommandB extends Command{
	
	public CommandB(){}
	
	public CommandB(IReceiver receiver) {
		super(receiver);
	}
	
	public void action() {
		System.out.println("Double click");
		getReceiver().action();
	}

}
