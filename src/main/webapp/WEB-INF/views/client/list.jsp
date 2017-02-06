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

</head>
<body>
<div class="container">
<h1>菜单</h1>
        <h1>${tab}</h1>
    <div id="xie">
        <li class="li" style="list-style-type: none">
        </li>
    </div>
    <div class="row">
    <table class="table">
    <c:forEach items="${foodList}" var="li">

        <div class="col-md-4">

           <div> <img  src="${url}${li.imageName}" width="100" height="100" title="张伟普本人"></div>
           <div> <input name="id" value="${li.id}" hidden></div>
            <div><input name="name" value="${li.name}" readonly><br/></div>
            <div> <button class="tijiao" value="${li.name}">添加</button></div>
            <%--<input class="tijiao" type="button" value="添加">--%>
            <%--<input class="yichu" type="button" value="移除">--%>

            </div>


    </c:forEach>
    </table>
    </div>

</div>
<div>
    <button class="submi" value="${tab}">提交</button>
</div>
<script src="/static/js/client.js"></script>
</body>
</html>
