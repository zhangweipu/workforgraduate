<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="food" uri="http://myFoodEL.com" %>
<html>
<head>
    <title>菜单列表</title>
    <%@include file="../common.jsp"%>
    <script src="<%=path%>/static/bootstrap3/js/bootstrap.js"></script>
    <link rel="shortcut icon" href="<%=path%>/static/images/bushuohua.ico" type="image/x-icon"/>
    <link href="<%=path%>/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
    <script src="<%=path%>/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script src="<%=path%>/static/bootstrap3/js/json2.js"></script>
    <link href="<%=path%>/static/css/client.css" rel="stylesheet">
    <link href="<%=path%>/static/css/common.css" rel="stylesheet">
    <script src="<%=path%>/static/js/client.js"></script>
    <script src="<%=path%>/static/js/common.js"></script>
</head>
<body>
  <%@include file="header.jsp"%>
  <%@include file="test.jsp"%>
  <%@include file="left.jsp"%>
  <%@include file="ls.jsp"%>
    <div class="order" data-id="${id}">
        here
        <div class="order-num"><div id="nums"> </div></div>
        <div class="order-money">总价格：<span id="money"> </span></div>
        <div class="order-sub"><a class="tijiao" href="javascript:void(0);">提交订单</a> </div>
    </div>
 <%@include file="footer.jsp"%>

<c:forEach items="${food:foodFunc('11')}" var="item">
    ${item.type}
</c:forEach>
</body>
</html>
