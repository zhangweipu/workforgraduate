<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/9/6
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <link rel="shortcut icon" href="/static/image/bushuohua.ico" type="image/x-icon"/>
    <title>fuwu</title>
    <!-- Bootstrap core CSS -->
    <link href="/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/static/css/dashboard.css" rel="stylesheet">


</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">点餐后台</a>
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
            <ul id="ls" class="nav nav-sidebar">
                <li ><a href="/service/add" class="btn btn-primary btn-lg active" role="button">添加菜</a></li>
                <li ><a href="/service/list" class="btn btn-primary btn-lg active" role="button">菜单显示</a></li>
                <li ><a href="#" class="btn btn-primary btn-lg active" role="button">Primary link</a></li>
                <li ><a href="#" class="btn btn-primary btn-lg active" role="button">Primary link</a></li>

            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" id="showOper">
            <div id="main">
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
<script  src="/static/bootstrap3/js/myJs.js"></script>
</body>
</html>
