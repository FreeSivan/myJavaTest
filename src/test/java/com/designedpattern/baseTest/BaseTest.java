package com.designedpattern.baseTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BaseTest {
	
	private ApplicationContext ac = (ApplicationContext) new FileSystemXmlApplicationContext("application.xml").getBean("ear.context");
	
	public ApplicationContext getAc() {
		return ac;
	}

}
