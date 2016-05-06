package com.designedpattern.builder.impl;

import com.designedpattern.builder.Builder;

public class BuilderA extends Builder{

	@Override
	public void buildpartA() {
		setResult(getResult()+"~~A~~");
	}

	@Override
	public void buildpartB() {
		setResult(getResult()+"~~B~~");
	}

	@Override
	public void buildpartC() {
		setResult(getResult()+"~~C~~");
	}

}
