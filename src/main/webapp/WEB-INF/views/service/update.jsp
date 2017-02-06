<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/10/8
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form:form action="/service/update" method="post" modelAttribute="food">
    <form:hidden path="id"/>
    <form:hidden path="imageName"/>
    <form:input path="name"/>
    <form:input path="price"/>
    <input type="submit" value="提交">
</form:form>
</body>
</html>
