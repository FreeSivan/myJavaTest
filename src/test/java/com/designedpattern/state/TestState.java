package com.designedpattern.state;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestState extends BaseTest{
	private Context context;
	
	@Test
	public void test1() {
		context = (Context) getAc().getBean("contextState");
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
	}
}
