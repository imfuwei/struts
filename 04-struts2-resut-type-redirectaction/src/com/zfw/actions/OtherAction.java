package com.zfw.actions;

import com.opensymphony.xwork2.Action;

public class OtherAction implements Action{
	private String tname;
	private String tage;
	
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTage() {
		return tage;
	}

	public void setTage(String tage) {
		this.tage = tage;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
