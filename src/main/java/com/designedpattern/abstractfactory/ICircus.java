package com.designedpattern.abstractfactory;

public interface ICircus {
	
	public IClown createClown();
	
	public IAcrobat createAcrobat();
	
	public IMagician createMagician();
	
}
