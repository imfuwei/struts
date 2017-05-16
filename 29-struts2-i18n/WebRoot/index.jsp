<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	<a href="language.action?request_locale=zh_CN">中文</a>
	<a href="language.action?request_locale=en_US">english</a>
	<br>
	<s:text name="index.form.title"/>
	<s:form action="login" method="post">
	<s:textfield name="username" key="index.form.username"/>
	<s:textfield name="age" key="index.form.age"/>
	<s:submit key="index.form.submit"/>
	</s:form>
	
</body>
</html>
