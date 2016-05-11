package com.designedpattern.strategy;

public class Context {
	
	private IStrategy strategy;

	public IStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextAction() {
		System.out.println("context other step!");
		strategy.algorithmAction();
	}
}
