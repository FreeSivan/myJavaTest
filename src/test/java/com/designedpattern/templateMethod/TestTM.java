package com.designedpattern.templateMethod;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestTM {
	
	private TemplateMethod method;
	
	@Test
	public void testTM() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
		method = (TemplateMethod) ac.getBean("methodA");
		method.action();
		System.out.println("------------------------------");
		method = (TemplateMethod) ac.getBean("methodB");
		method.action();
	}

}
