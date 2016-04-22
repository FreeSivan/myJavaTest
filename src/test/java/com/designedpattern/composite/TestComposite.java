package com.designedpattern.composite;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestComposite extends BaseTest{
	private IComposite com;
	
	@Test
	public void test1() {
		System.out.println("**********begin Test1***********");
		com = (IComposite) getAc().getBean("composite1");
		com.showSelf(0);
		System.out.println("********** end Test1 ***********");
	}
	
	@Test
	public void test2() {
		System.out.println("**********begin Test2***********");
		com = (IComposite) getAc().getBean("composite2");
		com.showSelf(0);
		System.out.println("********** end Test2 ***********");
	}
	
	@Test
	public void test3() {
		System.out.println("**********begin Test3***********");
		com = (IComposite) getAc().getBean("composite3");
		com.showSelf(0);
		System.out.println("********** end Test3 ***********");
	}
}
