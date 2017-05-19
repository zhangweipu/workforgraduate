<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<script src="<%=path%>/static/js/common.js"></script>
<html>
<head>
    <title>开始</title>
    <link rel="stylesheet" href="<%=path%>/static/bootstrap3/css/bootstrap.min.css">
</head>
<body>
  <div>
      <form id="form1" action="<%=path%>/main/login" method="post">
      <div class="modal-dialog bg-success"><h4>登录</h4></div>
      <div><label>账号：</label><input type="text" name="str1"></div>
      <div><label>密码：</label><input type="password" name="str2"></div>

      </form>
      <div><input type="button" id="submit" value="登录"></div>
  </div>
  <label id="showErr">${msg}</label>
<div>
    <a href="<%=path%>/admin/index">后台服务</a>
    <a href="<%=path%>/client/list">菜单</a>
</div>
</body>
</html>
