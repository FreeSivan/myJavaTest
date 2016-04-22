package com.designedpattern.baseTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BaseTest {
	
	private ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");

	public ApplicationContext getAc() {
		return ac;
	}

	public void setAc(ApplicationContext ac) {
		this.ac = ac;
	}
	
}
