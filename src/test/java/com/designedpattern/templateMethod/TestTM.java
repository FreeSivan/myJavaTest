package com.designedpattern.templateMethod;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestTM {
	
	private TemplateMethod method;
	
	private ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void test1() {
		System.out.println("**********begin Test1***********");
		method = (TemplateMethod) ac.getBean("methodA");
		method.action();
		System.out.println("********** end Test1 ***********");
	}
	
	@Test
	public void test2() {
		System.out.println("**********begin Test2***********");
		method = (TemplateMethod) ac.getBean("methodB");
		method.action();
		System.out.println("********** end Test2 ***********");
	}

}
