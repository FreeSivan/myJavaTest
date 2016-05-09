package com.designedpattern.command.impl;

import com.designedpattern.command.IReceiver;

public class ReceiverB implements IReceiver{

	public void action() {
		System.out.println("RecieverB's action");
	}

}
