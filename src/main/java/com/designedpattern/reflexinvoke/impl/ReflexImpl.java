package com.designedpattern.reflexinvoke.impl;

import org.springframework.stereotype.Service;

import com.designedpattern.reflexinvoke.AutoInvoke;
import com.designedpattern.reflexinvoke.BaseDispatchInvoke;

@Service
public class ReflexImpl extends BaseDispatchInvoke{
	
	@AutoInvoke(id = 2, style="batch")
	public void extractBatch1() {
		System.out.println("ReflexImpl extractBatch1");
	}
	
	@AutoInvoke(id = 0, style="batch")
	public void extractBatch2() {
		System.out.println("ReflexImpl extractBatch2");
	}
	
	@AutoInvoke(id = 1, style="batch")
	public void extractBatch3() {
		System.out.println("ReflexImpl extractBatch3");
	}
	
	@AutoInvoke(id = 4, style="single")
	public void extractSingle1() {
		System.out.println("ReflexImpl extractSingle1");
	}
	
	@AutoInvoke(id = 5, style="single")
	public void extractSingle2() {
		System.out.println("ReflexImpl extractSingle2");
	}
	
	@AutoInvoke(id = 2, style="single")
	public void extractSingle3() {
		System.out.println("ReflexImpl extractSingle3");
	}
	
	public void test1() {
		System.out.println("ReflexImpl test1");
	}
	
	public void test2() {
		System.out.println("ReflexImpl test2");
	}
	
	public void test3() {
		System.out.println("ReflexImpl test3");
	}
	
	@AutoInvoke(id = 2, style="long")
	public void longargvtest(String str) {
		System.out.println(str);
	}
	
	public void dispatchInvokeFilterByName(String regex) {
		dispatchInvokeFilterByName(new Object[]{}, regex);
	}
	
	public void dispatchInvokeOrderByAnn() {
		dispatchInvokeOrderByAnn(new Object[]{});
	}
	
	public void dispatchInvokeFilterOrderByAnn(String ann) {
		dispatchInvokeFilterOrderByAnn(new Object[]{}, ann);
	}
	
	public void dispatchInvokeFilterOrderByAnn(String ann, String str) {
		dispatchInvokeFilterOrderByAnn(new Object[]{str}, ann);
	}
}
