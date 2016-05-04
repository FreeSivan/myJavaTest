package com.designedpattern.proxy.impl;

import com.designedpattern.proxy.IData;

public class RealData implements IData{
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
