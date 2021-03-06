<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="my" uri="http://myel.com" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <title>添加菜</title>
    <script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="/static/js/service.js"></script>
    <style type="text/css">

    </style>

<form action="/admin/add" method="post" enctype="multipart/form-data">
        <table class="table">
            <tr ><td colspan="2" align="center">添加菜品</td></tr>
        <%--<input type="text" class="form-control" name="id" placeholder=".col-xs-4">--%>
      <tr><td>种类：</td> <td>
          <select class="form-control required" name="type">
              <option value="">请选择是食物类型</option>
              <c:forEach items="${my:myFunc()}" var="item">
              <option value="${item.type}">${item.type}</option>
              </c:forEach>
          </select>
      </td></tr>

        <%--<input type="text" class="form-control" name="imageName" placeholder=".col-xs-4">--%>
            <tr> <td>菜名：</td><td> <input type="text" class="form-control required" name="name" placeholder="菜名"></td></tr>
            <tr><td> 菜的规格：</td><td><input type="text" class="form-control" name="size" placeholder="大小"></td></tr>
            <tr><td> 菜的价格：</td><td><input type="text" class="form-control required" name="price" placeholder="价格"></td></tr>
            <tr><td>菜品图片：</td><td><input type="file" name="icon" class="form-control" placeholder="请上传图片" ></td></tr>
           <tr> <td>详细介绍：</td><td><textarea name="detail" class="form-control" rows="3"></textarea></td></tr>
            <tr><td><button type="submit" >提交</button></td>
                <td><a class="btn" href="/admin/addmany">批量添加</a></td></tr>
        </table>
</form>

