package com.designedpattern.state;

public abstract class State {
	
	private ContainerState container;
	
	private Context context;
	
	public abstract void handle();
	
	public void changeState(State state) {
		context.setState(state);
	}
	
	public Context getContext() {
		return context;
	}
	
	public void setContext(Context context) {
		this.context = context;
	}

	public ContainerState getContainer() {
		return container;
	}

	public void setContainer(ContainerState container) {
		this.container = container;
	}
	
}
