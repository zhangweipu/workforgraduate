<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="page">
    共${pageCount}页
    <c:if test="${currentPage==1}">
        <span>上一页</span>
    </c:if>
    <c:if test="${currentPage!=1}">
        <a href="${url}">上一页</a>
    </c:if>
    <c:if test="${pageCount<=5}">
        <c:forEach begin="1" end="${pageCount}" var="i">
            <a href="${url}?${i}">${i}</a>
        </c:forEach>
    </c:if>
    <c:if test="${pageCount>5}">
        <c:forEach begin="-2" end="2" var="i">
          <a href="${url}?${currentPage+i}">${currentPage+i}</a>
        </c:forEach>
    </c:if>
    <c:if test="${currentPage==pageCount}">
        <span>下一页</span>
    </c:if>
    <c:if test="${currentPage<pageCount}">
        <a href="${url}?page+1">下一页</a>
    </c:if>
</div>

