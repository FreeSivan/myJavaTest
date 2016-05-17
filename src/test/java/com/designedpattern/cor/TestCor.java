package com.designedpattern.cor;

import org.junit.Test;
import com.designedpattern.baseTest.BaseTest;

public class TestCor extends BaseTest{
	private Handler handler;
	
	@Test
	public void test() {
		handler = (Handler) getAc().getBean("handlerA");
		handler.handleRequest();
	}
}
