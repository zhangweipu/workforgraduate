<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>菜名</td>
        <td>类型</td>
        <td>价格</td>
        <td>数量</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="ls">
        <tr>
            <td>${ls.foodName}</td>
            <td>${ls.foodType}</td>
            <td>${ls.foodPrice}</td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
