package com.designedpattern.proxy.impl;

import com.designedpattern.proxy.IData;

public class Request implements Runnable{

	private IData data;
	
	public Request() {
	}
	
	public Request(IData data) {
		this.data = data;
	}
	
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		data.setContent("fetch data from remote!");
	}


	public IData getData() {
		return data;
	}

	public void setData(IData data) {
		this.data = data;
	}

}
