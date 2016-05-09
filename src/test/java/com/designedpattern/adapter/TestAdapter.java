package com.designedpattern.adapter;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestAdapter extends BaseTest{
	private IAdapter adapter;
	
	@Test
	public void test1() {
		adapter = (IAdapter) getAc().getBean("adapter");
		adapter.userInfo("yuexiwen", "32");
	}
}
