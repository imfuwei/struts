package com.zfw.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginAction {
	private String name;
	private int age;
	public String getName() {
		return name;
	}

	public void setName(String w) {
		this.name = w;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String execute() {
		return "success";
	}
}
