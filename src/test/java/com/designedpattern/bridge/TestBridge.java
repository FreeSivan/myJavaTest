package com.designedpattern.bridge;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestBridge extends BaseTest{
	
	private Component com;
	
	@Test
	public void test1() {
		com = (Component)getAc().getBean("com1");
		System.out.println("**********begin Test1***********");
		com.action1();
		com.action2();
		System.out.println("********** end Test1 ***********");
	}
	
	@Test
	public void test2() {
		com = (Component)getAc().getBean("com2");
		System.out.println("**********begin Test2***********");
		com.action1();
		com.action2();
		System.out.println("********** end Test2 ***********");
	}
	
	@Test
	public void test3() {
		com = (Component)getAc().getBean("com3");
		System.out.println("**********begin Test3***********");
		com.action1();
		com.action2();
		System.out.println("********** end Test3 ***********");
	}
	
	@Test
	public void test4() {
		com = (Component)getAc().getBean("com4");
		System.out.println("**********begin Test4***********");
		com.action1();
		com.action2();
		System.out.println("********** end Test4 ***********");
	}
	
	@Test
	public void test5() {
		com = (Component)getAc().getBean("com5");
		System.out.println("**********begin Test5***********");
		com.action1();
		com.action2();
		System.out.println("********** end Test5 ***********");
	}
	
	@Test
	public void test6() {
		com = (Component)getAc().getBean("com6");
		System.out.println("**********begin Test6***********");
		com.action1();
		com.action2();
		System.out.println("********** end Test6 ***********");
	}
}
