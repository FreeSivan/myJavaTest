package com.designedpattern.adapter.impl;

public class UserInfo {
	public void userInfo(String name, Integer age) {
		System.out.println("name type = " + name.getClass().getName() + " name = " + name);
		System.out.println("age type = "+ age.getClass().getName() + " age = " + age);
	}
}
