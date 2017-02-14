<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2017/2/10
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <tr><td>${ls.seatMark}</td>
            <td><fmt:formatDate value="${ls.time}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
            <td>${ls.foodPrice}</td></tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
