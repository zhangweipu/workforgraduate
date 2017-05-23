<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../common.jsp"%>
<script src="<%=path%>/static/js/waiter.js"></script>
<div class="list">
    <table>
        <thead>
        <tr>
            <td>序列</td>
            <td>菜名</td>
            <td>价格</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="list" varStatus="status">
            <td>${status.index}</td>
            <td>${list.name}</td>
            <td>${list.price}</td>
            <td><a class="btn" data-id="${list.id}" data-name="${list.name}" data-price="${list.price}" data-orderid="${orderid}"
                   href="javascript:void(0);">选择</a></td>
        </c:forEach>
        </tbody>
    </table>
</div>
${orderid}
