package com.zfw.struts;


public class LoginAction{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String doOne(){
		if ("admin".equals(name)) {
			return "success";
		}
		return "fail";
	}
	public String doTwo(){
		if (age>60) {
			return "old";
		}else if(age<15){
			return "fail";
		}
		return "success";
	}

	
}
