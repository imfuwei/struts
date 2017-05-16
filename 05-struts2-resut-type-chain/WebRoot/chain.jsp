<%@page contentType="text/html; charset=utf-8"%>

<html>
<head>
<title>测试Struts2请求转发</title>
</head>
<body>
<%=request.getAttribute("username") %>
name=${requestScope.username } <br>
此处的username是因为拿的是从LoginAction的getUserame方法，所以调用的username这个属性得到的<br>

age=${requestScope.age }<br>

name=<%=request.getParameter("username") %><br>
而此处是直接从表单中获取username的value,如果写成像上面的方式，request.getParameter("name")，根本就从表单找不到name这个对应的value;
所以需要深入了解EL表达式，requestScope的作用范围，或对象范围和request有什么不同
<br>
<%=request.getParameter("age") %>
<br>
<br>
<br>
<br>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%=basePath %>


</body>
</html>