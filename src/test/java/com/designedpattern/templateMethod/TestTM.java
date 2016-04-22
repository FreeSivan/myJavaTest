package com.designedpattern.templateMethod;

import org.junit.Test;
import com.designedpattern.baseTest.BaseTest;

public class TestTM extends BaseTest{
	
	private TemplateMethod method;
	
	@Test
	public void test1() {
		System.out.println("**********begin Test1***********");
		method = (TemplateMethod) getAc().getBean("methodA");
		method.action();
		System.out.println("********** end Test1 ***********");
	}
	
	@Test
	public void test2() {
		System.out.println("**********begin Test2***********");
		method = (TemplateMethod) getAc().getBean("methodB");
		method.action();
		System.out.println("********** end Test2 ***********");
	}

}
