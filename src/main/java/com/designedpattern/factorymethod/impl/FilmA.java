
package com.designedpattern.factorymethod.impl;

import com.designedpattern.factorymethod.IActor;
import com.designedpattern.factorymethod.Film;

public class FilmA extends Film{

	@Override
	public IActor createActor() {
		return new ActorA();
	}

}
