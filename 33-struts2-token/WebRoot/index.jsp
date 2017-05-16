<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	<form action="login.action" method="post">
		<s:token />
		用户名：<input type="text" name="username"> 年龄:<input type="text"
			name="age"> <input type="submit" value="验证">
	</form>

</body>
</html>
