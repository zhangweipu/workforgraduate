<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/static/js/service.js"></script>
<div>
<table class="table">
    <thead>
    <tr>
        <td>编号</td>
        <td>时间</td>
        <td>状态</td>
        <td>总额</td>
        <td>详情</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="ls">
        <tr><td>${ls.id}</td>
            <td><fmt:formatDate value="${ls.time}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
            <td>${ls.stat}</td>
            <td>${ls.money}</td>
            <td><a class="btn" href="/admin/orderdetail?id=${ls.id}">详情</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
    ${list}
</div>
