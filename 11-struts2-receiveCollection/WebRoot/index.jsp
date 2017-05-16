<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户提交数据封装到域对象中</title>
</head>

<body>
	<form action="look">
		用户名1：<input type="text" name="users[0].username"><br> 
		年龄：<input type="text" name="users[0].age"><br> 
		<br>
		<br>
		用户名2：<input type="text" name="users[1].username"><br> 
		年龄：<input type="text" name="users[1].age"><br>
		
		 <br>
		 <br>
		用户名3：<input type="text" name="users[2].username"><br> 
		年龄：<input type="text" name="users[2].age"><br> 
		
		
		
		 <input type="submit"
			value="提交">
	</form>
</body>
</html>
