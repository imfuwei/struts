package com.zfw.actions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadAction {
	private File[] files;
	private String[] filesFileName;

	public File[] getFiles() {
		return files;
	}

	public void setFiles(File[] files) {
		this.files = files;
	}

	public String[] getFilesFileName() {
		return filesFileName;
	}

	public void setFilesFileName(String[] filesFileName) {
		this.filesFileName = filesFileName;
	}

	public String execute() throws Exception {
		if (files != null) {
			String parent = ServletActionContext.getServletContext()
					.getRealPath("/files");
			for (int i = 0; i < files.length; i++) {
				File destFile = new File(parent, filesFileName[i]);
				FileUtils.copyFile(files[i], destFile);
			}
			return "success";
		}
		return "fail";
	}
}
