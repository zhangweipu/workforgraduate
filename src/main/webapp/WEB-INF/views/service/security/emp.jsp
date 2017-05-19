<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../common.jsp"%>
<script src="<%=path%>/static/js/service.js"></script>
<link href="<%=path%>/static/css/finance.css" rel="stylesheet">
<div id="container">
<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">账户信息</h1>
    </div>
    <div class="panel panel-default">
        <div class="panel-body">
            <form class="form-horizontal" method="post" name="user">
                <div class="line line-dashed b-b line-lg pull-in"></div>
                <div class="form-group">
                    <label class="col-sm-2 control-label ">员工号：</label>
                    <div class="col-sm-6">
                        <input type="text" id="id">
                    </div>
                    <div class="col-sm-4">
                        <input type="button" value="查找" id="find">
                    </div>
                </div>
            </form>
        </div>
    </div>
    <div id="showErr"></div>
</div>
<div id="showRsp"></div>
</div>