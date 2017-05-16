package com.zfw.actions;

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
}
