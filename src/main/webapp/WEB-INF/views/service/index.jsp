<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="shortcut icon" href="../static/image/bushuohua.ico" type="image/x-icon"/>
    <title>fuwu</title>
    <%
        String basePath = request.getScheme() + "://"
                + request.getServerName() + ":" + request.getServerPort();
        basePath += request.getContextPath() + "/";
    %>
    <base href="<%=basePath%>">

    <!-- Bootstrap core CSS -->
    <link href="/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
    <link href="/static/css/common.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/static/css/dashboard.css" rel="stylesheet">
    <script src="/static/my97date/calendar.js"></script>
    <script src="/static/my97date/WdatePicker.js"></script>

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">餐厅后台</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/sys/index">首页</a></li>
                <li><a onclick="history.go(-1)">返回上一页</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="/sys/loadOut">登出</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <jsp:include page="left.jsp"/>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" id="showOper">
            <div id="main">
                <%--<c:forEach items="${urlList}" var="list">--%>
                <%--<img src="${list}" width="100" height="100">--%>
                <%--</c:forEach>--%>
                <h1>欢迎管理员</h1>
            </div>
        </div>
    </div>
</div>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="/static/bootstrap3/js/bootstrap.min.js"></script>
<script src="/static/bootstrap3/js/json2.js"></script>
<script  src="/static/js/service.js"></script>
<script src="/static/js/angular.min.js"></script>
</body>
</html>
