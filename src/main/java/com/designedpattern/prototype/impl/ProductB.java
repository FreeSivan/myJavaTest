package com.designedpattern.prototype.impl;

import com.designedpattern.prototype.Product;

public class ProductB extends Product{

	@Override
	public void showself() {
		System.out.println("ProductB : " + getContent());
	}

	@Override
	public Product clone() {
		return new ProductB();
	}

}
