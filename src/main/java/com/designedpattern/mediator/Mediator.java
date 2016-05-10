package com.designedpattern.mediator;

import java.util.Map;

public class Mediator {
	
	private Map<String, Colleague> collMap;
	
	public Map<String, Colleague> getCollMap() {
		return collMap;
	}

	public void setCollMap(Map<String, Colleague> collMap) {
		this.collMap = collMap;
	}
	
	public void request(String orgName, String dstName, String msg) {
		Colleague colleague = collMap.get(dstName);
		colleague.recvRequest(orgName, msg);
	}
	
	public void response(String orgName, String dstName, String msg) {
		Colleague colleague = collMap.get(dstName);
		colleague.recvResponse(orgName, msg);
	}
}
