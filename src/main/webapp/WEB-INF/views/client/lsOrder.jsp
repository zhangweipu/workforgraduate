<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/10/17
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
订单列表
<table class="table">
<c:forEach items="${list}" var="ls" varStatus="lst">
    <tr>
        <td>${ls.foodName}</td>
        <td>${ls.foodType}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
