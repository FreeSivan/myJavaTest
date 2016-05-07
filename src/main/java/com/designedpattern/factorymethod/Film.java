package com.designedpattern.factorymethod;

public abstract class Film {
	public void filmPartA() {
		System.out.println("partA--");
		IActor actor = createActor();
		actor.performA();
	}
	
	public void filmPartB() {
		System.out.println("partB--");
		IActor actor = createActor();
		actor.performB();
	}
	
	public void filmPartC() {
		System.out.println("partC--");
		IActor actor = createActor();
		actor.performC();
	}
	
	public abstract IActor createActor();
}
