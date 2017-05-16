<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>查看信息</title>
</head>

<body>
	<s:debug />
	用户名1：${users[0].username }
	<br> 年龄：${users[0].age }
	<br>
	<br> 用户名2：${users[1].username }
	<br> 年龄：${users[1].age }
	<br>
	<br> 用户名3：${users[2].username }
	<br> 年龄：${users[2].age }
	<br>
	<br>

</body>
</html>
