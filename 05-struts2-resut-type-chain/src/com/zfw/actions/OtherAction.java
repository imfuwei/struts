package com.zfw.actions;

import com.opensymphony.xwork2.Action;

public class OtherAction implements Action {
	private String other;

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
}
