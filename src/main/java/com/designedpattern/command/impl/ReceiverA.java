package com.designedpattern.command.impl;

import com.designedpattern.command.IReceiver;

public class ReceiverA implements IReceiver{

	public void action() {
		System.out.println("RecieverA's action");
	}

}
