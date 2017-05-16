package com.zfw.actions;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

public class DownLoadAction {
	private InputStream is;
	private String fileName;

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String execute() throws Exception {
		fileName="5.jpg";
		String path = "/images/" + fileName;
		is = ServletActionContext.getServletContext().getResourceAsStream(path);
		//重命名文件名为中文，并解决乱码，先用utf-8进行解码，再用iso-8859-1进行编码，就ok了
		fileName="中文.jpg";
		byte[] bytes = fileName.getBytes("gbk");
		fileName=new String(bytes, "iso-8859-1");
		
		return "success";
	}
}
