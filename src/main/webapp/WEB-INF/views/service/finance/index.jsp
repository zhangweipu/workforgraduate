<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../common.jsp"%>
    <link href="<%=path%>/static/css/finance.css" rel="stylesheet">
<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">账户信息</h1>
    </div>
    <div class="panel panel-default">
        <div class="panel-body">
            <form class="form-horizontal" method="post" name="user">
                <div class="line line-dashed b-b line-lg pull-in"></div>
                <c:forEach items="${account}" var="item" varStatus="index">
                <div class="form-group">
                    <label class="col-sm-2 control-label ">账户：</label>
                    <div class="col-sm-10">
                            ${item.accountId}
                    </div>
                </div>

                <div class="form-group" >
                    <label class="col-sm-2 control-label ">余额：</label>
                    <div class="col-sm-10" >
                      ${item.amount}
                    </div>
                </div>
                </c:forEach>

            </form>
        </div>
    </div>
</div>