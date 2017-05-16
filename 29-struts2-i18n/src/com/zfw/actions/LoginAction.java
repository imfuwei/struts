package com.zfw.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String execute() {
		String msg1 = this.getText("loginaction.msg1");
		System.out.println(msg1);
		//动态加载配置文件
		String msg2 = this.getText("loginaction.msg2",new String[]{username});
		System.out.println(msg2);
		return "success";
	}
}