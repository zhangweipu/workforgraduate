<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<script src="<%=path%>/static/js/common.js"></script>
<html>
<head>
    <title>开始</title>
    <link rel="stylesheet" href="<%=path%>/static/bootstrap3/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=path%>/static/css/main.css">
</head>
<body>
<div class="mycenter">
    <div class="mysign">
        <div class="col-lg-11 text-center text-info">
            <h2>餐厅后台，请登录</h2>
        </div>
        <form id="form1" action="<%=path%>/main/login" method="post">
            <div class="col-lg-10">
                <input type="text" class="form-control" name="str1" placeholder="请输入账户名" required autofocus/>
            </div>
            <div class="col-lg-10"></div>
            <div class="col-lg-10">
                <input type="password" class="form-control" name="str2" placeholder="请输入密码" required autofocus/>
            </div>
        </form>
        <div class="col-lg-10"></div>
        <div class="col-lg-10 mycheckbox checkbox">
            <label id="showErr">${msg}</label>
        </div>
        <div class="col-lg-10"></div>
        <div class="col-lg-10">
            <button type="button" id="submit" class="btn btn-success col-lg-12">登录</button>
        </div>
    </div>
</div>
</body>
</html>
