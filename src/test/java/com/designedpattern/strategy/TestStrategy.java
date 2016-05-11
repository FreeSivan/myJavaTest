package com.designedpattern.strategy;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestStrategy extends BaseTest{
	
	private Context context;
	
	@Test
	public void test1() {
		context = (Context) getAc().getBean("strategyContext1");
		context.contextAction();
	}
	
	@Test
	public void test2() {
		context = (Context) getAc().getBean("strategyContext2");
		context.contextAction();
	}
	
	@Test
	public void test3() {
		context = (Context) getAc().getBean("strategyContext3");
		context.contextAction();
	}
}
