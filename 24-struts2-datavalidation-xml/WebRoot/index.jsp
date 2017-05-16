<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	
此标签是struts2用于显示filedErrors集合中的错误标签:s:fielderror


<br>
<br>
	发的请求是login_doSome.action
	<s:form action="login_doSome.action">
		<s:textfield name="name" label="名字" />
		<s:textfield name="mobile" label="手机号" />
		<s:submit value="验证" />
	</s:form>
	<br>
	<br>
	<br>
	发的请求是login_doTwo.action
	<s:fielderror style="color:red" />
	<form action="login_doTwo.action" method="post">
		名字：<input type="text" name="name"><br> 手机号：<input
			type="text" name="mobile"><br> <input type="submit"
			value="验证">
	</form>
</body>
</html>
