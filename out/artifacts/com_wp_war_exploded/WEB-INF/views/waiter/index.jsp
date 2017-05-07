<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="type" uri="http://myel.com" %>
<html>
<head>
    <title>waiter</title>
    <link href="/static/css/waiter.css" rel="stylesheet"/>
    <script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script src="/static/js/waiter.js"></script>
</head>
<body>
<div class="top">top</div>
<div class="main">main</div>
<div class="left">
    <div class="type">
        <h3>种类选择</h3>
    <ul>
    <c:forEach items="${type:myFunc()}" var="type" varStatus="status">
        <li><a href="/admin/waiter/list?type=${type.type}" >${type.id}--${type.type}</a></li>
    </c:forEach>
    </ul>
    </div>
    <div class="other">

    </div>
</div>
</body>
</html>
