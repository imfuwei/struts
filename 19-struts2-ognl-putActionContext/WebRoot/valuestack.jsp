<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'valuestack.jsp' starting page</title>
</head>

<body>
	如果不指定范围，会从小到大的找：<br>
	name=
	<s:property value="#attr.some" /><br>
	指定范围后，可以从指定范围中找：<br>
	request中：<s:property value="#request.some"/><br>
	session中：<s:property value="#session.some"/><br>
	application中：<s:property value="#application.some"/><br>
	<s:debug />
</body>
</html>
