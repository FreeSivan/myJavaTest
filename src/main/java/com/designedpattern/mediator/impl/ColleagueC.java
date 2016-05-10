package com.designedpattern.mediator.impl;

import com.designedpattern.mediator.Colleague;

public class ColleagueC extends Colleague{

	@Override
	public void sendRequest(String dstName, String msg) {
		System.out.println("ColleagueC send request to : " + dstName);
		getMediator().request(getCollName(), dstName, msg);
	}

	@Override
	public void recvRequest(String orgName, String msg) {
		System.out.println("ColleagueC recv request from  : " + orgName + " | msg : "+ msg);
		sendResponse(orgName, "Response from ColleagueC");
	}

	@Override
	public void sendResponse(String destName, String msg) {
		System.out.println("ColleagueC send response to : " + destName);
		getMediator().response(getCollName(), destName, msg);
	}

	@Override
	public void recvResponse(String orgName, String msg) {
		System.out.println("ColleagueC recv response from : " + orgName + " | msg : " + msg);
	}

}
