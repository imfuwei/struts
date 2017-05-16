package com.zfw.actions;

import com.opensymphony.xwork2.ActionContext;


public class LookAction{
	public String execute() {
		//通过ActionContext去获取ServletAPI
		ActionContext.getContext().put("req", "req_value");
		ActionContext.getContext().getSession().put("ses", "ses_value");
		ActionContext.getContext().getApplication().put("App", "App_value");
		return "success";
	}
}
