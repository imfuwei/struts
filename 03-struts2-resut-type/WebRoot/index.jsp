<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	<form action="login.action" method="post">
		用户名：<input type="text" name="username"> 年龄:<input type="text"
			name="age"> <input type="submit" value="验证转发">
	</form>
	<form action="redirect.action" method="post">
		用户名：<input type="text" name="username"> 年龄:<input type="text"
			name="age"> <input type="submit" value="验证重定向">
	</form>
	
	<a href="login.action?username=admin">afds</a>
</body>
</html>
