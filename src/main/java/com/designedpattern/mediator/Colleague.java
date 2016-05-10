package com.designedpattern.mediator;

public abstract class Colleague {
	
	private Mediator mediator;
	
	private String collName;

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public String getCollName() {
		return collName;
	}

	public void setCollName(String collName) {
		this.collName = collName;
	}
	
	public abstract void sendRequest(String dstName, String msg);
	
	public abstract void recvRequest(String orgName, String msg);
	
	public abstract void sendResponse(String destname, String msg);
	
	public abstract void recvResponse(String orgName, String msg);
	
}
