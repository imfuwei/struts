<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<s:form action="login.action" method="post">
	<s:textfield name="age" label="年龄" />
	<s:textfield name="birthday" label="生日" />
	<s:textfield name="birthday2" label="生日2" />
	
	<s:submit value="验证自定义局部类型转换器" />
</s:form>

</body>
</html>
