package com.zfw.actions;

public class LoginAction {
	private String aa;
	private int age;

	public String getUsername() {
		return aa;
	}

	public void setUsername(String v) {
		this.aa = v;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String execute(){
		// TODO Auto-generated method stub
		System.out.println(aa);
		return "success";
	}
}
