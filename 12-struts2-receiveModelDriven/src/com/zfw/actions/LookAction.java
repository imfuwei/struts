package com.zfw.actions;

import com.opensymphony.xwork2.ModelDriven;
import com.zfw.beans.User;

public class LookAction implements ModelDriven<User> {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		if (user == null) {
			user = new User();
		}
		return user;
	}

	public String execute() {
		return "success";
	}
}
