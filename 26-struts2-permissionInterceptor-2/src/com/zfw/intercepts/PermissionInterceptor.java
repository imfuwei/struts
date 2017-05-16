package com.zfw.intercepts;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PermissionInterceptor implements Interceptor,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8705321158093562029L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String user = (String) ActionContext.getContext().getSession()
				.get("user");
		if (!"user".equals(user)) {
			System.out.println("权限拦截器已拦截");
			return "fail";
		}
		return invocation.invoke();
	}

}
