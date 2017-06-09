<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">

    </style>
</head>
<body style="background: url('/static/images/success.jpg') no-repeat; ">
<div class="timer" data-time="${time}">
    <h1>点餐成功</h1>
</div>
<div>
    <c:forEach items="${orders}" var="order">
        ${order.foodName}
    </c:forEach>
</div>
<script type="text/javascript" src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="/static/js/success.js"></script>
</body>
</html>
