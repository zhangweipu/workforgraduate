<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script src="/static/js/service.js"></script>
    <script src="/static/bootstrap3/js/bootstrap.min.js"></script>
    <title>菜单列表</title>
<table class="table" id="table">
    <thead>
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>图片</td>
        <td>类型</td>
        <td>价格</td>
        <td>大小</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
<c:forEach items="${list}" var="ls" varStatus="lsi">
  <tr>
      <td>${lsi.index+1}</td>
      <td> ${ls.name}</td>
      <td> ${ls.imageName}</td>
      <td> ${ls.type}</td>
      <td> ${ls.price}</td>
      <td>${ls.size}</td>
      <td>  <a href="/service/update?id=${ls.id}" class="btn btn-primary btn-lg active" role="button">修改</a></td>
      <td>  <a href="/service/delete?id=${ls.id}" class="btn btn-primary btn-lg active" role="button">删除</a></td>
  </tr>
</c:forEach>
    </tbody>
</table>
<%@include file="../common/page.jsp"%>
<%--<jsp:include page="../common/page.jsp">--%>
    <%--<jsp:param name="coun" value="11"/>--%>
    <%--<jsp:param name="aa" value="11"/>--%>
<%--</jsp:include>--%>
<%--</body>--%>
<%--</html>--%>
