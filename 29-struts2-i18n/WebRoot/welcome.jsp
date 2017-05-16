<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
<s:text name="welcome.msg1"/>
<br>
<br>
<br>
绑定参数的i18n，要在配置文件中添加占位符，这个不同于action的通配符，那个是从{1}开始的，这个是从{0}开始的<br><br>
<s:text name="welcome.msg2">
<s:param>${username }</s:param>
</s:text>

</body>
</html>
