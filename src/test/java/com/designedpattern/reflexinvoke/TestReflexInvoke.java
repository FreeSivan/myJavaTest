package com.designedpattern.reflexinvoke;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;
import com.designedpattern.reflexinvoke.impl.ReflexImpl;

public class TestReflexInvoke extends BaseTest{
	private static final String REGEX = "^test.*"; 
	@Test
	public void test() {
		ReflexImpl reflex = (ReflexImpl) getAc().getBean("reflexImpl");
		reflex.dispatchInvokeFilterByName(REGEX);
		System.out.println("====================================");
		reflex.dispatchInvokeOrderByAnn();
		System.out.println("====================================");
		reflex.dispatchInvokeFilterOrderByAnn("batch");
		System.out.println("====================================");
		reflex.dispatchInvokeFilterOrderByAnn("single");
	}
}
