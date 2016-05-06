package com.designedpattern.prototype;

import java.util.Map;

public class Container {
	private Map<String, Product> proMap;

	public Map<String, Product> getProMap() {
		return proMap;
	}

	public void setProMap(Map<String, Product> proMap) {
		this.proMap = proMap;
	}
	
	public Product getProduct(String proName) {
		return proMap.get(proName);
	}
	
	public void addProduct(String proName, Product product) {
		proMap.put(proName, product);
	}
}
