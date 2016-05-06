package com.designedpattern.builder;

public abstract class Builder {
	
	private String result = "";

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public abstract void buildpartA();
	
	public abstract void buildpartB();
	
	public abstract void buildpartC();
	
}
