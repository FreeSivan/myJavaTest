package com.designedpattern.state;

import java.util.Map;

public class ContainerState {
	
	private Map<String, State> stateMap;
	
	public Map<String, State> getStateMap() {
		return stateMap;
	}

	public void setStateMap(Map<String, State> stateMap) {
		this.stateMap = stateMap;
	}
	
}
