<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>fuwu</title>
    <%
        String basePath = request.getScheme() + "://"
                + request.getServerName() + ":" + request.getServerPort();
        basePath += request.getContextPath() + "/";
        String path=request.getContextPath();
    %>
    <base href="<%=basePath%>">
    <link rel="shortcut icon" href="<%=path%>/static/image/bushuohua.ico" type="image/x-icon"/>
    <!-- Bootstrap core CSS -->
    <script src="<%=path%>/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script src="<%=path%>/static/bootstrap3/js/bootstrap.min.js"></script>
    <script src="<%=path%>/static/bootstrap3/js/json2.js"></script>
    <script  src="<%=path%>/static/js/service.js"></script>
    <script src="<%=path%>/static/js/angular.min.js"></script>
    <link href="<%=path%>/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/static/css/common.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="<%=path%>/static/css/dashboard.css" rel="stylesheet">
    <script src="<%=path%>/static/my97date/calendar.js"></script>
    <script src="<%=path%>/static/my97date/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=path%>/static/css/client.css">
</head>

<body style="background: url('/static/images/beijing2.jpg') repeat;">

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">餐厅后台</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <%--<li><a href="/sys/index">首页</a></li>--%>
                <%--<li><a onclick="history.go(-1)">返回上一页</a></li>--%>
                <li><a href="<%=path%>/loadOut">登出</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <jsp:include page="left.jsp"/>
        </div>
        <div class="showord"></div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div id="main" >

            </div>
        </div>
    </div>
</div>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

</body>
</html>
