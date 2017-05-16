package com.zfw.actions;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String name;
	private String mobile;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String doSome(){
		System.out.println("============");
		return "success";
	}
	public String doTwo(){
		System.out.println("--------------");
		return "success";
	}
	//这是对所有action中的方法之前进行的验证
/*	@Override
	public void validate() {
		if (name==null||"".equals(name)) {
			this.addFieldError("name", "用户名不能为空");
		}
		if (name==null||"".equals(mobile)) {
			this.addFieldError("mobile", "手机号不能为空");
		}else if(Pattern.matches("^1[34578]\\d{9}$", mobile)){
			this.addFieldError("mobile", "手机号格式不对");
		}
	}*/
	
	//只对doTwo()方法进行验证
	public void validateDoTwo() {
		if (name==null||"".equals(name)) {
			this.addFieldError("name", "用户名不能为空");
		}
		if (name==null||"".equals(mobile)) {
			this.addFieldError("mobile", "手机号不能为空");
		}else if(Pattern.matches("^1[34578]\\d{9}$", mobile)){
			this.addFieldError("mobile", "手机号格式不对");
		}
	}
}
