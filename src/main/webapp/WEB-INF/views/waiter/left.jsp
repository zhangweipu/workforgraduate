<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="type" uri="http://myel.com" %>
<% String path=request.getContextPath();%>
    <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
        <div class="panel panel-default">
            <c:forEach items="${type:myFunc()}" var="type" varStatus="status">
            <div class="panel-heading" role="tab" id="headingOne">
                <h4 class="panel-title">
                    <a role="button" class="btn" href="<%=path%>/admin/waiter/list?type=${type.id}" >
                            ${type.id}--${type.type}
                    </a>
                </h4>
            </div>
            </c:forEach>
        </div>
    </div>