package com.zfw.struts;

import com.opensymphony.xwork2.ActionContext;


public class LoginAction {
	public String doOne() {
		ActionContext.getContext().put("some", "req_some");
		ActionContext.getContext().getSession().put("some", "ses_some");
		ActionContext.getContext().getApplication().put("some", "app_some");
		return "success";
	}
}
