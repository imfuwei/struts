<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>index</title>
</head>
<body>
	<form action="login.action" method="post">

		用户名：<input type="text" name="username"><br> 年龄:<input
			type="text" name="age"><br> <input type="submit"
			value="验证">
	</form>

</body>


</html>