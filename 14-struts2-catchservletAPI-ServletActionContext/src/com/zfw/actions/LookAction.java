package com.zfw.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


public class LookAction{
	public String execute() {
		//通过ServletActionContext去获取ServletAPI
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("req", "req_value");
		request.getSession().setAttribute("ses", "ses_value");
		ServletActionContext.getServletContext().setAttribute("App", "App_value");
		return "success";
	}
}
