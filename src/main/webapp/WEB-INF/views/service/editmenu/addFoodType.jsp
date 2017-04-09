<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="addFoodType">
    <form action="/admin/addFoodType" method="post">
        <table>
            <thead>
            <tr>
                <td>序列</td>
                <td>类型</td>
                <td>优先级</td>
            </tr>
            </thead>
            <c:forEach begin="0" end="10" varStatus="status">
                <tr>
                    <td>${status.index}</td>
                    <td><input class="type${status.index}" type="text" name="type"></td>
                    <td><input class="type${status.index}" type="text" name="id"></td>
                </tr>
            </c:forEach>
        </table>
        <input type="submit" value="确定">
        <input type="reset" value="重置">
    </form>
    <div class="display"><span>设置优先级，越小越优先展示</span></div>
</div>
