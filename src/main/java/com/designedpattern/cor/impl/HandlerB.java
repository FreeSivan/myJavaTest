package com.designedpattern.cor.impl;

import org.springframework.stereotype.Service;

import com.designedpattern.cor.Handler;

@Service
public class HandlerB implements Handler{

	public void handleRequest() {
		System.out.println("HandlerB's handleRequest!");
	}

}
