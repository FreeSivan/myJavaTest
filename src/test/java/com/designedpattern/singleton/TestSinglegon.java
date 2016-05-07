package com.designedpattern.singleton;

import org.junit.Test;

public class TestSinglegon {
	
	@Test
	public void test() {
		Singleton.instance().showSelf();
	}
}
