
package com.designedpattern.proxy.impl;

import com.designedpattern.proxy.IData;

public class FutureData implements IData{
	
	private RealData realData;
	
	private Boolean isReady = false;
	
	public FutureData() {
	}
	
	public FutureData(RealData realData) {
		this.realData = realData;
	}

	public RealData getRealData() {
		return realData;
	}

	public void setRealData(RealData realData) {
		this.realData = realData;
	}
	
	public synchronized String getContent() throws InterruptedException{
		if (!isReady) {
			wait();
		}
		return realData.getContent();
	}
	
	public synchronized void setContent(String content) {
		if (isReady) {
			return;
		}
		this.realData.setContent(content);
		isReady = true;
		notifyAll();
	}
}
