package com.designedpattern.mediator;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestMediator extends BaseTest{
	
	private Colleague colleague;
	
	@Test
	public void test1() {
		colleague = (Colleague)getAc().getBean("colleagueA");
		colleague.sendRequest("colleagueB", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueC", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueD", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueE", "hello world");
		System.out.println("----");
	}
	
	@Test
	public void test2() {
		colleague = (Colleague)getAc().getBean("colleagueB");
		colleague.sendRequest("colleagueA", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueC", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueD", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueE", "hello world");
		System.out.println("----");
	}
	
	@Test
	public void test3() {
		colleague = (Colleague)getAc().getBean("colleagueC");
		colleague.sendRequest("colleagueA", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueB", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueD", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueE", "hello world");
		System.out.println("----");
	}
	
	@Test
	public void test4() {
		colleague = (Colleague)getAc().getBean("colleagueD");
		colleague.sendRequest("colleagueA", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueB", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueC", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueE", "hello world");
		System.out.println("----");
	}
	
	@Test
	public void test5() {
		colleague = (Colleague)getAc().getBean("colleagueE");
		colleague.sendRequest("colleagueA", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueB", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueC", "hello world");
		System.out.println("----");
		colleague.sendRequest("colleagueD", "hello world");
		System.out.println("----");
	}
}
