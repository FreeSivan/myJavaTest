package com.designedpattern.adapter.impl;

import com.designedpattern.adapter.IAdapter;

public class Adapter implements IAdapter{
	
	private UserInfo userinfo;
		
	public void userInfo(String name, String ages) {
		userinfo.userInfo(name, Integer.valueOf(ages));
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

}
