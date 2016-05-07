package com.designedpattern.singleton;

public class Singleton {
	private static Singleton ins = new Singleton();
	
	public static Singleton instance() {
		return ins;
	}
	
	private Singleton() {
	}
	
	public void showSelf() {
		System.out.println("in the Singleton's showSelf function");
	}
}
