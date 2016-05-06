package com.designedpattern.prototype.impl;

import com.designedpattern.prototype.Product;

public class ProductA extends Product{

	@Override
	public void showself() {
		System.out.println("ProductA : " + getContent());
	}

	@Override
	public Product clone() {
		return new ProductA();
	}

}
