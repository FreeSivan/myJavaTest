package com.designedpattern.templateMethod.impl;

import com.designedpattern.templateMethod.TemplateMethod;

public class MethodB extends TemplateMethod{

	@Override
	protected void step1() {
		System.out.println("MethodB's step1");
	}

	@Override
	protected void step2() {
		System.out.println("MethodB's step2");
	}

}
