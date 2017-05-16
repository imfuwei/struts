package com.zfw.struts;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginAction {

	public String execute() {
		//第一种方式。获取valuestack，第一种方式，太麻烦了
		Object o = ServletActionContext.getRequest().getAttribute(ServletActionContext.VALUE_STACK);
		ValueStack valueStack1=(ValueStack)o;
		//用获取来的valuestack来获取的context
		Map<String, Object> context = valueStack1.getContext();
		//第二种方式。用ActionContext来获取context，简单
		ActionContext actioncontext = ActionContext.getContext();
		ValueStack valueStack2 = actioncontext.getValueStack();
		//证明两种获取的valuestack是同一个对象
		System.out.println(valueStack1);
		System.out.println(valueStack2);
		
		
		
		//证明valuestack中的context属性与ActionContext对象是同一个map
		//如果是同一个map那么相同的key。前面的那个会被后面那个覆盖
		valueStack1.getContext().put("some", "shanghai");
		ActionContext.getContext().put("some", "beijing");
		return "success";
	}
}
