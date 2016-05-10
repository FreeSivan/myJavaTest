package com.designedpattern.mediator.impl;

import com.designedpattern.mediator.Colleague;

public class ColleagueA extends Colleague{

	@Override
	public void sendRequest(String dstName, String msg) {
		System.out.println("ColleagueA send request to : " + dstName);
		getMediator().request(getCollName(), dstName, msg);
	}

	@Override
	public void recvRequest(String orgName, String msg) {
		System.out.println("ColleagueA recv request from  : " + orgName + " | msg : "+ msg);
		sendResponse(orgName, "Response from ColleagueA");
	}

	@Override
	public void sendResponse(String destName, String msg) {
		System.out.println("ColleagueA send response to : " + destName);
		getMediator().response(getCollName(), destName, msg);
	}

	@Override
	public void recvResponse(String orgName, String msg) {
		System.out.println("ColleagueA recv response from : " + orgName + " | msg : " + msg);
	}

}
