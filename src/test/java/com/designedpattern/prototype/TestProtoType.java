package com.designedpattern.prototype;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestProtoType extends BaseTest{
	
	private Container container;
	
	@Test
	public void test() {
		container = (Container) getAc().getBean("container");
		Product product = container.getProduct("A");
		product.showself();
		product = container.getProduct("B");
		product.showself();
	}
}
