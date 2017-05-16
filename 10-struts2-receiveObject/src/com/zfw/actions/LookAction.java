package com.zfw.actions;

import com.zfw.beans.User;

public class LookAction {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {
		return "success";
	}
}
