package com.designedpattern.abstractfactory;

import org.junit.Test;

import com.designedpattern.baseTest.BaseTest;

public class TestAbsFactory extends BaseTest{
	private ICircus circus;
	private IAcrobat acrobat;
	private IClown clown;
	private IMagician magician;
	
	@Test
	public void test1() {
		circus = (ICircus) getAc().getBean("circusA");
		acrobat = circus.createAcrobat();
		acrobat.showAcrobat();
		clown = circus.createClown();
		clown.showClown();
		magician = circus.createMagician();
		magician.showMagician();
	}
	
	@Test
	public void test2() {
		circus = (ICircus) getAc().getBean("circusB");
		acrobat = circus.createAcrobat();
		acrobat.showAcrobat();
		clown = circus.createClown();
		clown.showClown();
		magician = circus.createMagician();
		magician.showMagician();
	}
}
