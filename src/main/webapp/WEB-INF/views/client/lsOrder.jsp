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
