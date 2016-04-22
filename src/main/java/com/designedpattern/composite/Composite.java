package com.designedpattern.composite;

import java.util.List;

public abstract class Composite implements IComposite{
	private List<IComposite> comSet;

	public List<IComposite> getComSet() {
		return comSet;
	}

	public void setComSet(List<IComposite> comSet) {
		this.comSet = comSet;
	}
}
