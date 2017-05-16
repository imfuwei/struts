package com.zfw.actions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadAction {
	private File file;
	private String fileFileName;
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String execute() throws Exception{
		if (file!=null) {
			String realPath = ServletActionContext.getServletContext()
					.getRealPath("/UP");
			File destDir = new File(realPath, fileFileName);
			FileUtils.copyFile(file, destDir);
			return "success";
		}
		System.out.println("123");
		return "fail";
	}
}
