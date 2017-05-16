package com.zfw.actions;

import java.util.List;

import com.zfw.beans.User;

public class LookAction {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String execute() {
		return "success";
	}
}
