<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <c:forEach items="${list}" var="ls" varStatus="status">
        <td>${status.index}</td>
        <td>${ls.id}</td>
        <td>${ls.name}</td>
        <td>${ls.age}</td>
        <td>${ls.sex}</td>
        <td>${ls.worktime}</td>
        <td>${ls.salary}</td>
        <td>${ls.power}</td>
        <td><a>修改</a><a>删除</a></td>
    </c:forEach>
    </table>
</div>
