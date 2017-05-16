<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>  
  <body>
  <a href="doone?name=admin&age=1233">发送doone?name=admin&age=1233请求</a><br>
  <a href="doone?name=wq&age=1233">发送doone?name=wq&age=1233请求</a><br><br>
  
  
  <a href="dotwo?name=admin&age=10">发送dotwo?name=wq&age=10请求</a><br>
  <a href="dotwo?name=admin&age=30">发送dotwo?name=wq&age=30请求</a><br>
  <a href="dotwo?name=admin&age=80">发送dotwo?name=wq&age=80请求</a><br>
  
  </body>
</html>
