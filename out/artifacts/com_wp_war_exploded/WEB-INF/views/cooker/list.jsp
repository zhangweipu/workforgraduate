<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>foodlist</title>
    <link rel="stylesheet" href="/static/css/cooker.css">
</head>
<body>
<%@include file="left.jsp"%>
<div class="main">
            <div class="thead">
                <span class="head">序列号</span>
                <span class="head">订单号</span>
                <span class="head">详情</span>
            </div>

        <c:forEach items="${IDlist}" var="ID" varStatus="status">
        <div class="tbody">
            <a class="btu" href="javascript:void(0);" data-status="${status.index}"
          data-id="${ID.id}" data-seat="${ID.seat}">${ID.id}</a>
        </div>
        </c:forEach>

</div>
<script type="text/javascript" src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="/static/js/cooker.js"></script>
</body>
</html>
