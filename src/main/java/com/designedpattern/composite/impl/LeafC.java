package com.designedpattern.composite.impl;

import com.designedpattern.composite.IComposite;

public class LeafC implements IComposite{

	public void showSelf(int num) {
		String str = "";
		for (int i = 0; i < num; ++i) {
			str += "     ";
		}
		System.out.println(str + "LeafC");
	}

}
