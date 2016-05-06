package com.designedpattern.builder;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestBuilder extends BaseTest{
	
	private Director director;
	
	@Test
	public void testfunc() {
		String str = "abcabcabcabcabc";
		director = (Director) getAc().getBean("director1");
		director.parseStr(str);
		director.showResult();
		director = (Director) getAc().getBean("director2");
		director.parseStr(str);
		director.showResult();
	}
	
}
