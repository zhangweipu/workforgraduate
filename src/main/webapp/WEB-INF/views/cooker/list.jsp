<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="shortcut icon" href="/static/image/bushuohua.ico" type="image/x-icon"/>
    <title>fuwu</title>
    <%@include file="../common.jsp"%>
    <!-- Bootstrap core CSS -->
    <script src="<%=path%>/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script src="<%=path%>/static/bootstrap3/js/bootstrap.min.js"></script>
    <script src="<%=path%>/static/bootstrap3/js/json2.js"></script>
    <script  src="<%=path%>/static/js/service.js"></script>
    <script src="<%=path%>/static/js/angular.min.js"></script>
    <link href="<%=path%>/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/static/css/cooker.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="<%=path%>/static/css/dashboard.css" rel="stylesheet">
    <script src="<%=path%>/static/my97date/calendar.js"></script>
    <script src="<%=path%>/static/my97date/WdatePicker.js"></script>

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">餐厅后台</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <%--<li><a href="/sys/index">首页</a></li>--%>
                <%--<li><a onclick="history.go(-1)">返回上一页</a></li>--%>
                <li><a href="#">Profile</a></li>
                <li><a href="<%=path%>/loadOut">登出</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>
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
<script type="text/javascript" src="<%=path%>/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/cooker.js"></script>
</body>
</html>
