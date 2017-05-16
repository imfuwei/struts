<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	<form action="login.asp" method="post">
		用户名：<input type="text" name="username"> 年龄:<input type="text"
			name="age"> <input type="submit" value="验证">
	</form>


	<%
		for (int i = 1; i <= 3; i++) {
	%>
	<a href="www.aa.com?a=<%=i%>"><%=i%></a>

	<%
		}
	%>

</body>
</html>
