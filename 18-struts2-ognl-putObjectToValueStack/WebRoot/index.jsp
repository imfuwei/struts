<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
</head>
<a href="login.action">向Valuestack中的root中放入无名称对象</a><br>
<a href="login2.action">向Valuestack中的root中放入有名称对象，用map集合放进去可以达到此目的</a><br>
<a href="login3.action">向Valuestack中的root中放入有名称对象，使用valuestack的set方法</a><br>
<a href="login4.action">向Valuestack中的root中放入无名对象，直接操作root，root本身就是一个集合</a>
<body>
</body>
</html>
