package com.designedpattern.mediator.impl;

import com.designedpattern.mediator.Colleague;

public class ColleagueD extends Colleague{

	@Override
	public void sendRequest(String dstName, String msg) {
		System.out.println("ColleagueD send request to : " + dstName);
		getMediator().request(getCollName(), dstName, msg);
	}

	@Override
	public void recvRequest(String orgName, String msg) {
		System.out.println("ColleagueD recv request from  : " + orgName + " | msg : "+ msg);
		sendResponse(orgName, "Response from ColleagueD");
	}

	@Override
	public void sendResponse(String destName, String msg) {
		System.out.println("ColleagueD send response to : " + destName);
		getMediator().response(getCollName(), destName, msg);
	}

	@Override
	public void recvResponse(String orgName, String msg) {
		System.out.println("ColleagueD recv response from : " + orgName + " | msg : " + msg);
	}

}
