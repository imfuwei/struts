<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'valuestack.jsp' starting page</title>
</head>

<body>
	<s:debug />
	student3=<s:property value="student3"/><br>
	student3.name=<s:property value="student3.name" /><br>
	student3.age=<s:property value="student3.age" /><br>
	
	<p>
	student33=<s:property value="student33"/><br>
	student33.name=<s:property value="student33.name"/><br>
	student33.age=<s:property value="student33.age"/>

</body>
</html>
