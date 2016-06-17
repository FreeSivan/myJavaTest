package com.designedpattern.springprototype;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestSpringPrototype extends BaseTest{
	
	@Test
	public void test1() {
		Product product = (Product)getAc().getBean("springProcuct1");
		product.showSelf();
		product = (Product)getAc().getBean("springProcuct1");
		product.showSelf();
		product = (Product)getAc().getBean("springProcuct1");
		product.showSelf();
		System.out.println("===========================================");
		product = (Product)getAc().getBean("springProcuct2");
		product.showSelf();
		product = (Product)getAc().getBean("springProcuct2");
		product.showSelf();
		product = (Product)getAc().getBean("springProcuct2");
		product.showSelf();
		System.out.println("===========================================");
		product = (Product)getAc().getBean("springProcuct3");
		product.showSelf();
		product = (Product)getAc().getBean("springProcuct3");
		product.showSelf();
		product = (Product)getAc().getBean("springProcuct3");
		product.showSelf();
	}
}
