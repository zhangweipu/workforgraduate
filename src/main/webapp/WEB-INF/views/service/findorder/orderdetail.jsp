<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/static/js/service.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <a href="#" class="btn">返回上一页</a>
</div>
<div>
    <table class="table">
        <thead>
        <tr>
            <td>序列</td>
            <td>菜名</td>
            <td>价格</td>
            <td>数量</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="item" varStatus="ls">
            <tr>
                <td>${ls.index}</td>
                <td>${item.foodName}</td>
                <td>${item.foodPrice}</td>
                <td>${item.num}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
