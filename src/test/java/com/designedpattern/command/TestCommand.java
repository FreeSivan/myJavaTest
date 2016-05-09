package com.designedpattern.command;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestCommand extends BaseTest{
	private Invoker invoker;
	
	@Test
	public void test1() {
		invoker = (Invoker) getAc().getBean("invoker");
		invoker.invoke();
	}
	
}
