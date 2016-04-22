package com.designedpattern.composite.impl;

import com.designedpattern.composite.Composite;
import com.designedpattern.composite.IComposite;

public class CompositeA extends Composite{

	public void showSelf(int num) {
		String str = "";
		for (int i = 0; i < num; ++i) {
			str += "     ";
		}
		System.out.println(str + "---begin---compositeA---");
		for (IComposite com : getComSet()) {
			com.showSelf(num+1);
		}
		System.out.println(str + "---end-----compositeA---");
	}

}
