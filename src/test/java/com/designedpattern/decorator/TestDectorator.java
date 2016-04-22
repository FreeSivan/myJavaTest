package com.designedpattern.decorator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class TestDectorator {
	
	private IComponent component;
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
	
	@Test
	public void test1() {
		System.out.println("**********begin Test1***********");
		component = (IComponent) ac.getBean("componentA");
		component.showSelf();
		System.out.println("********** end Test1 ***********");
	}
	
	@Test
	public void test2() {
		System.out.println("**********begin Test2***********");
		component = (IComponent) ac.getBean("componentB");
		component.showSelf();
		System.out.println("********** end Test2 ***********");
	}
	
	@Test
	public void test3() {
		System.out.println("**********begin Test3***********");
		component = (IComponent) ac.getBean("decoratorA1");
		component.showSelf();
		System.out.println("********** end Test3 ***********");
	}
	
	@Test
	public void test4() {
		System.out.println("**********begin Test4***********");
		component = (IComponent) ac.getBean("decoratorA2");
		component.showSelf();
		System.out.println("********** end Test4 ***********");
	}
	
	@Test
	public void test5() {
		System.out.println("**********begin Test5***********");
		component = (IComponent) ac.getBean("decoratorB1");
		component.showSelf();
		System.out.println("********** end Test5 ***********");
	}
	
	@Test
	public void test6() {
		System.out.println("**********begin Test6***********");
		component = (IComponent) ac.getBean("decoratorB2");
		component.showSelf();
		System.out.println("********** end Test6 ***********");
	}
	
	@Test
	public void test7() {
		System.out.println("**********begin Test7***********");
		component = (IComponent) ac.getBean("decoratorB3");
		component.showSelf();
		System.out.println("********** end Test7 ***********");
	}
	
	@Test
	public void test8() {
		System.out.println("**********begin Test8***********");
		component = (IComponent) ac.getBean("decoratorB4");
		component.showSelf();
		System.out.println("********** end Test8 ***********");
	}
	
}
