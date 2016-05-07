package com.designedpattern.factorymethod;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class Testfm extends BaseTest{
	
	private Film film;
	
	@Test
	public void test1() {
		film = (Film) getAc().getBean("filmA");
		film.filmPartA();
		film.filmPartB();
		film.filmPartC();
	}
	
	@Test
	public void test2() {
		film = (Film) getAc().getBean("filmB");
		film.filmPartA();
		film.filmPartB();
		film.filmPartC();
	}
}
