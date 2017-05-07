<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="list">
    <table>
        <thead>
        <tr>
            <td>序列</td>
            <td>菜名</td>
            <td>类型</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="list" varStatus="status">
            <td>${status.index}</td>
            <td>${list.name}</td>
            <td>${list.type}</td>
            <td><<a href=""></a></td>
        </c:forEach>
        </tbody>
    </table>
</div>
