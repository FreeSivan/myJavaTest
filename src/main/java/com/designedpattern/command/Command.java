package com.designedpattern.command;

public abstract class Command {
	
	private IReceiver receiver;
	
	public Command(){
	}
	
	public Command(IReceiver receiver) {
		this.receiver = receiver;
	}
	
	public abstract void action();

	public IReceiver getReceiver() {
		return receiver;
	}

	public void setReceiver(IReceiver receiver) {
		this.receiver = receiver;
	}
	
}
