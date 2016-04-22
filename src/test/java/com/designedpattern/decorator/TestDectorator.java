package com.designedpattern.decorator;

import org.junit.Test;
import com.designedpattern.baseTest.BaseTest;

public class TestDectorator extends BaseTest{
	
	private IComponent component;
	
	
	@Test
	public void test1() {
		System.out.println("**********begin Test1***********");
		component = (IComponent) getAc().getBean("componentA");
		component.showSelf();
		System.out.println("********** end Test1 ***********");
	}
	
	@Test
	public void test2() {
		System.out.println("**********begin Test2***********");
		component = (IComponent) getAc().getBean("componentB");
		component.showSelf();
		System.out.println("********** end Test2 ***********");
	}
	
	@Test
	public void test3() {
		System.out.println("**********begin Test3***********");
		component = (IComponent) getAc().getBean("decoratorA1");
		component.showSelf();
		System.out.println("********** end Test3 ***********");
	}
	
	@Test
	public void test4() {
		System.out.println("**********begin Test4***********");
		component = (IComponent) getAc().getBean("decoratorA2");
		component.showSelf();
		System.out.println("********** end Test4 ***********");
	}
	
	@Test
	public void test5() {
		System.out.println("**********begin Test5***********");
		component = (IComponent) getAc().getBean("decoratorB1");
		component.showSelf();
		System.out.println("********** end Test5 ***********");
	}
	
	@Test
	public void test6() {
		System.out.println("**********begin Test6***********");
		component = (IComponent) getAc().getBean("decoratorB2");
		component.showSelf();
		System.out.println("********** end Test6 ***********");
	}
	
	@Test
	public void test7() {
		System.out.println("**********begin Test7***********");
		component = (IComponent) getAc().getBean("decoratorB3");
		component.showSelf();
		System.out.println("********** end Test7 ***********");
	}
	
	@Test
	public void test8() {
		System.out.println("**********begin Test1 ***********");
		component = (IComponent) getAc().getBean("decoratorB4");
		component.showSelf();
		System.out.println("********** end Test1 ***********");
	}
	
}
