<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
</head>
<h1>利用ognl访问静态常量</h1>
pi=<s:property value="@java.lang.Math@PI"/><br>
<h1>利用ognl访问静态方法</h1>
random=<s:property value="@java.lang.Math@random()"/>
<body>
</body>
</html>
