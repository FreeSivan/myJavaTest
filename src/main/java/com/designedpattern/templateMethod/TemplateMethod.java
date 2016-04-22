package com.designedpattern.templateMethod;

public abstract class TemplateMethod {
	public void action() {
		System.out.println("now step1");
		step1();
		System.out.println("now step2");
		step2();
	}
	
	protected abstract void step1();
	
	protected abstract void step2();
}
