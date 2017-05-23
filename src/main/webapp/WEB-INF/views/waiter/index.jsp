<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="type" uri="http://myel.com" %>
<html>
<head>
    <% String path=request.getContextPath();%>
    <title>waiter</title>
    <link href="<%=path%>/static/css/waiter.css" rel="stylesheet"/>
    <script src="<%=path%>/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <%--<script src="<%=path%>/static/js/waiter.js"></script>--%>
</head>
<body>
<div class="top">服务员菜单
  <div class="ls">订单列表
    <div class="order">

    </div>
  </div>
</div>
<iframe class="main">main</iframe>
<div class="left">
    <div class="type">
        <h3>种类选择</h3>
    <ul>
    <c:forEach items="${type:myFunc()}" var="type" varStatus="status">
        <li><a class="get" href="<%=path%>/admin/waiter/list?type=${type.id}">${type.id}--${type.type}</a></li>
    </c:forEach>
    </ul>
    </div>
    <div class="other">

    </div>
</div>
<script type="text/javascript">
    $(".get").on("click",function (evt) {
        evt.preventDefault();
        var href=$(this).attr("href");
        $(".main").attr("src",href);
    })
    $.ajaxSetup ({
        cache: false //关闭AJAX相应的缓存
    });
</script>
</body>
</html>
