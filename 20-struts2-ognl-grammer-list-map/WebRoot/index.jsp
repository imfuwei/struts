<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>ognl语法</title>
</head>
<body>

	<br>-------------List---------------
	<br>
	<%--创建list --%>
	<s:set name="nameList" value="{'zhang','wang','li'}" />
	<%--输出list --%>
	<s:iterator value="#nameList">
		<s:property />
		<br>
	</s:iterator>


	<br>------------map---------------
	<br>
	<%--创建map --%>
	<s:set name="maps" value="#{'mobile':'1234567','qq':'7654321','email':'718059569@qq.com'}" />
	<%--输出map --%>
	map第一种输出方式
	<br>
	<s:iterator value="#maps">
		<s:property />
		<br>
	</s:iterator>
	<br> map第二种输出方式
	<br>
	<s:iterator value="#maps" var="aa">
		<s:property value="aa" />
		<br>
	</s:iterator>
	map第三种输出方式
	<br>
	<s:iterator value="#maps">
		<s:property value="key" />=<s:property value="value" />
		<br>
	</s:iterator>
	<br>---------判断集合中是否有哪些元素-------<br>
	<%--in 和 not in 判断元素是否在集合中 --%>
	zhang in nameList?=	<s:property value="'li' in #nameList" /><br> 
	zhang not in nameList?=<s:property value="'zhang' not in #nameList" /><br>
	<br>
	moblie的值 in maps?=<s:property value="'1234567' in #maps"/><br>
	qq的值 not in maps?=<s:property value="'7654321' not in #maps"/>
	
	<br> 
	<br>--------------创建对象-------------<br>
	<s:bean name="com.zfw.beans.Group" id="group">
	<s:param name="groupName" value="'组别1'"/>
	</s:bean>
	<s:bean name="com.zfw.beans.Group" id="group2">
	<s:param name="groupName" value="'组别2'"/>
	</s:bean>
	<s:bean name="com.zfw.beans.Student" id="student1">
	<s:param name="name" value="'zhangsan'"/><%--ognl标签中字符串要用单引号包着 --%>
	<s:param name="age" value="15"/>
	<s:param name="group" value="#group"/>
	</s:bean>
	<s:bean name="com.zfw.beans.Student" id="student2">
	<s:param name="name" value="'lisi'"/>
	<s:param name="age" value="23"/>
	<s:param name="group" value="#group2"/>
	</s:bean>
	<s:bean name="com.zfw.beans.Student" id="student3">
	<s:param name="name" value="'wangwu'"/>
	<s:param name="age" value="43"/>
	</s:bean>

	student1=<s:property value="#student1"/><br>
	student2=<s:property value="#student2"/><br>
	student3=<s:property value="#student3"/><br>
	<br>
	
	--------------将对象映射到List集合中-------------<br>
	<s:set name="students" value="{#student1,#student2,#student3}"/>
	
	
	<s:iterator value="#students">
	<s:property value="name"/><br>
	<s:property value="age"/><br>
	<s:property value="group"/><br>
	</s:iterator>
	<br>
	<br>
	--------将Students这个list对象中的name再放到List集合中--------------<br>
	<s:set name="studentsNames" value="#students.{name}"/>
	<s:iterator value="#studentsNames">
	<s:property/>
	</s:iterator>
	
	
	<br>
	--------------将对象映射到Map集合中-------------<br>
	<s:set name="studentmaps" value="#{'a':#student1,'b':#student2,'c':#student3}"/>
	<s:iterator value="#studentmaps">
	name=<s:property value="value.name"/><br>
	age=<s:property value="value.age"/><br>
	group=<s:property value="value.group"/><br>
	</s:iterator>
	<br>
	<br>
<br>
	--------------查询集合中<span style="color:red">所有</span>年龄大于3的人-------------<br>
	<s:iterator value="#students.{?#this.age>3}">
	<s:property/><br>
	</s:iterator>
<br>
	--------------查询集合中<span style="color:red">所有</span>年龄大于3的<span style="color:red">第一个人</span>-------------<br>
	<s:iterator value="#students.{^#this.age>3}">
	<s:property/><br>
	</s:iterator>
<br>
	--------------查询集合中<span style="color:red">所有</span>年龄大于3的<span style="color:red">最后一个人</span>-------------<br>
	<s:iterator value="#students.{$#this.age>3}">
	<s:property/><br>
	</s:iterator>

	<s:debug />
</body>
</html>



























