package com.designedpattern.factorymethod.impl;

import com.designedpattern.factorymethod.IActor;
import com.designedpattern.factorymethod.Film;

public class FilmB extends Film{

	@Override
	public IActor createActor() {
		return new ActorB();
	}

}
