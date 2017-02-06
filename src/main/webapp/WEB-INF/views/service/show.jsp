<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
    <thead></thead>
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
