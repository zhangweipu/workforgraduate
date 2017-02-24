<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


    <form:form id="formid" action="/service/update" method="post" modelAttribute="food">
        <table class="table">
        <form:hidden path="id"/>
        <form:hidden path="imageName"/>
        <tr><td>菜名： </td><td> <form:input path="name"/></td></tr>
        <tr> <td>价格： </td><td><form:input path="price"/></td></tr>
        <tr><td>种类： </td><td><form:input path="type"/></td></tr>
        <tr><td>规格： </td><td><form:input path="size"/></td></tr>
        <tr><td><input id="aa" type="submit" value="提交"></td></tr>
        </table>
    </form:form>

