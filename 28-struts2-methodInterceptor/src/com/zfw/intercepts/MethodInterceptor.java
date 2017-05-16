package com.zfw.intercepts;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession()
				.getAttribute("user");
		System.out.println("执行拦截器");
		if ("user".equals(user)) {
			return invocation.invoke();
		}
		return "fail";
	}

}
