<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>菜单列表</title>
    <script src="/static/bootstrap3/js/bootstrap.js"></script>
    <link rel="shortcut icon" href="/static/images/bushuohua.ico" type="image/x-icon"/>
    <link href="/static/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
    <script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script src="/static/bootstrap3/js/json2.js"></script>
    <link href="/static/css/client.css" rel="stylesheet">
    <link href="/static/css/common.css" rel="stylesheet">
</head>
<body>
<div class="menu header"><%@include file="header.jsp"%></div>
<div class="menu">

    <div class="menu left"> <%@include file="left.jsp"%></div>
<div class="main">

    <iframe frameborder="0" scrolling="auto"  class="iframe main"src="/client/list?tab=${tab}">

    </iframe>
    <div class="menu order" data-id="${id}">
        here
        <div><span id="nums"> </span></div>
        <div>总价格：<span id="money"> </span></div>
        <div><a href="#">提交订单</a> </div>
    </div>
</div>
  <div class="menu footer"><%@include file="footer.jsp"%></div>


</div>
<script src="/static/js/client.js"></script>
<div class="stop">
    <h1>啊哈哈哈</h1>
</div>
</body>
</html>
