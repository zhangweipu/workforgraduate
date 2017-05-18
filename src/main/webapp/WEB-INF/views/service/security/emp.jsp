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
                <div class="form-group">
                    <label class="col-sm-2 control-label ">账户：</label>
                    <div class="col-sm-10">

                    </div>
                </div>

                <div class="form-group" >
                    <label class="col-sm-2 control-label ">原密码：</label>
                    <div class="col-sm-10" >
                        <input type="password" name="password">
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label ">新密码：</label>
                    <div class="col-sm-10" >
                        <input type="password" name="password">
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label ">确认密码：</label>
                    <div class="col-sm-10" >
                        <input type="password" name="password">
                    </div>
                </div>
                <div  align="center">
                    <button type="button" class="btn btn-primary">修改</button>
                </div>
            </form>
        </div>
    </div>
</div>