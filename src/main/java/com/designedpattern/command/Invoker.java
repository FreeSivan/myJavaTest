package com.designedpattern.command;

import java.util.List;

public class Invoker {
	private List<Command> comlist;

	public List<Command> getComlist() {
		return comlist;
	}

	public void setComlist(List<Command> comlist) {
		this.comlist = comlist;
	}
	
	public void invoke() {
		for (Command item : comlist) {
			item.action();
		}
	}
}
