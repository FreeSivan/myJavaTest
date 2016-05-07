package com.designedpattern.abstractfactory.impl;

import com.designedpattern.abstractfactory.IAcrobat;
import com.designedpattern.abstractfactory.ICircus;
import com.designedpattern.abstractfactory.IClown;
import com.designedpattern.abstractfactory.IMagician;

public class CircusB implements ICircus{

	public IClown createClown() {
		return new ClownB();
	}

	public IAcrobat createAcrobat() {
		return new AcrobatB();
	}

	public IMagician createMagician() {
		return new MagicianB();
	}

}
