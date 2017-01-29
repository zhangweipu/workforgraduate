<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/10/8
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="/static/bootstrap3/js/myJs.js"></script>
    <script src="/static/bootstrap3/js/bootstrap.min.js"></script>
    <title>菜单列表</title>
</head>
<body style="width: 768px">
<table class="table">
    <thead>
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>类型</td>
        <td>价格</td>
        <td>大小</td>
        <td>大小</td>
        <td>大小</td>

    </tr>
    </thead>
    <tbody>
<c:forEach items="${list}" var="ls" varStatus="lsi">
  <tr>
      <td><input size="1" type="text" readonly value="${lsi.index+1}"></td>
      <td> <input size="8" type="text" readonly value="${ls.name}"></td>
      <td> <input size="8" type="text" readonly value="${ls.type}"></td>
      <td> <input size="8" type="text" readonly value="${ls.price}"></td>
      <td><input size="8" type="text" readonly value="${ls.size}"></td>

      <td>  <a href="/service/update?id=${ls.id}" class="btn btn-primary btn-lg active" role="button">修改</a></td>
      <td>  <a href="/service/delete?id=${ls.id}" class="btn btn-primary btn-lg active" role="button">删除</a></td>
  </tr>
</c:forEach>
    </tbody>
</table>
</body>
</html>
