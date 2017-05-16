package com.zfw.actions;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;



public class LookAction implements RequestAware,SessionAware,ApplicationAware{
	//通过实现特定的接口，获取ServletAPI，不是真的获取
	private Map<String, Object> myRequest;
	private Map<String, Object> session;
	private Map<String, Object> myApplication;
	public String execute() {
		myRequest.put("req", "req_value");
		session.put("ses", "ses_value");
		myApplication.put("App", "app_value");
		return "success";
	}
	@Override
	public void setApplication(Map<String, Object> application) {
		myApplication=application;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		myRequest=request;
	}

}
