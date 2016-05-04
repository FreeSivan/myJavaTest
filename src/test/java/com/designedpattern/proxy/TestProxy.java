package com.designedpattern.proxy;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;
import com.designedpattern.proxy.impl.FutureData;
import com.designedpattern.proxy.impl.RealData;
import com.designedpattern.proxy.impl.Request;

public class TestProxy extends BaseTest{
	
	@Test
	public void testProxy() throws InterruptedException {
		IData data = (IData) getAc().getBean("futureData");
		Request request = (Request)getAc().getBean("request");
		new Thread(request).start();
		System.out.println("step1");
		Thread.sleep(2000);
		System.out.println("step2");
		Thread.sleep(2000);
		System.out.println("step3");
		Thread.sleep(2000);
		System.out.println("step4");
		Thread.sleep(2000);
		System.out.println("step5");
		Thread.sleep(2000);
		System.out.println("step6");
		System.out.println("data = "+data.getContent());
	}
	
}
