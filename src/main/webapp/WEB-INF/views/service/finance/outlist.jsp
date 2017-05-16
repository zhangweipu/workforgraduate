<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="/static/css/finance.css" rel="stylesheet">
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
                fff
                <div  align="center">
                    <button type="button" class="btn btn-primary">查询</button>
                </div>
            </form>
        </div>
    </div>
</div>