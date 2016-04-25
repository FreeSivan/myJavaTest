package com.designedpattern.observer;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestObserver extends BaseTest{
	
	private Target target;
	
	@Test
	public void test() {
		target = (Target)getAc().getBean("target1");
		target.setState("State1");
		target.setState("State2");
	}
}
