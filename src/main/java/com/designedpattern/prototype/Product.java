package com.designedpattern.prototype;


public abstract class Product {
	
	private String content;
	
	public Product(){
	}
	
	public Product(String content) {
		this.setContent(content);
	}
	
	public Product(Product obj) {
		this.setContent(obj.getContent());
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public abstract void showself();
	
	public abstract Product clone();

}
