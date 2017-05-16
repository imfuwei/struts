package com.zfw.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{
	private String username;
	private int age;

	public String getName() {
		return username;
	}

	public void setName(String w) {
		this.username = w;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
