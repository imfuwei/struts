<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>

<body>
	<h1>这是转发过来的</h1><%--
	name=${requestScope.username }--%>
	name=<%=request.getAttribute("username") %>
	name=<%=request.getParameter("username") %>

</body>
</html>
