<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<html>
<head>
    <title>开始</title>
    <link rel="stylesheet" href="<%=path%>/static/bootstrap3/css/bootstrap.min.css">
</head>
<body>
  <div>
      <form>
      <div class="modal-dialog bg-success"><h4>登录</h4></div>
      <div><label>账号：</label><input type="text" name="id"></div>
      <div><label>密码：</label><input type="password" name="password"></div>
      <div><input type="submit"></div>
      </form>
  </div>
<div>
    <a href="<%=path%>/admin/index">后台服务</a>
    <a href="<%=path%>/client/list">菜单</a>
</div>
</body>
</html>
