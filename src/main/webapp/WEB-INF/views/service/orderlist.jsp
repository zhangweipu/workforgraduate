<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>详细订单</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>编号</td>
        <td>编号</td>
        <td>编号</td>
        <td>编号</td>
        <td>编号</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="ls">
        <tr><td>${ls.id}</td>
            <td><fmt:formatDate value="${ls.time}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
            <td>${ls.id}</td></tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
