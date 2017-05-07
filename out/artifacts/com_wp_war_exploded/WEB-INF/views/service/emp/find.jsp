<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/static/js/service.js"></script>
<div class="emp-find">
    <table>
        <thead>
        <tr>
            <td>序号</td>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
            <td>入职时间</td>
            <td>薪水</td>
            <td>职权</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>

    <c:forEach items="${list}" var="ls" varStatus="status">
        <tr>
        <td>${status.index}</td>
        <td>${ls.id}</td>
        <td>${ls.name}</td>
        <td>${ls.age}</td>
        <td>${ls.sex}</td>
        <td>${ls.worktime}</td>
        <td>${ls.salary}</td>
        <td>${ls.power}</td>
        <td><a class="btn" href="/admin/emp/update?id=${ls.id}">修改</a>
            <a class="btn" href="/admin/emp/delete?id=${ls.id}">删除</a></td>
        </tr>
    </c:forEach>

        </tbody>
    </table>
</div>
