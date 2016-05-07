package com.designedpattern.abstractfactory.impl;

import com.designedpattern.abstractfactory.IAcrobat;
import com.designedpattern.abstractfactory.ICircus;
import com.designedpattern.abstractfactory.IClown;
import com.designedpattern.abstractfactory.IMagician;

public class CircusA implements ICircus{

	public IClown createClown() {
		return new ClownA();
	}

	public IAcrobat createAcrobat() {
		return new AcrobatA();
	}

	public IMagician createMagician() {
		return new MagicianA();
	}

}
