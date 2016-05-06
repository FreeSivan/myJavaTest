package com.designedpattern.builder;

public class Director {
	
	private Builder builder;

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void parseStr(String str) {
		for (byte item : str.getBytes()) {
			switch(item) {
			case 'a': {
				builder.buildpartA();
				break;
			}
			case 'b': {
				builder.buildpartB();
				break;
			}
			case 'c': {
				builder.buildpartC();
				break;
			}
			default: {
				break;
			}
			}
		}
	}
	
	public void showResult() {
		System.out.println(getBuilder().getResult());
	}
	
}
