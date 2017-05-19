<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../common.jsp"%>
<link href="<%=path%>/static/css/finance.css" rel="stylesheet">
<script src="<%=path%>/static/js/service.js"></script>
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
                            ${Id}
                        </div>
                    </div>

                    <div class="form-group" >
                        <label class="col-sm-2 control-label ">原密码：</label>
                        <div class="col-sm-10" >
                            <input type="password" id="password1" name="password">
                        </div>
                    </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label ">新密码：</label>
                    <div class="col-sm-10" >
                        <input type="password" id="password2" name="password">
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label ">确认密码：</label>
                    <div class="col-sm-10" >
                        <input type="password" id="password3" name="password">
                    </div>
                </div>
                <div id="showErr"></div>
                <div  align="center">
                    <a id="update" type="button" href="javascript:void(0);" class="btn btn-primary">修改</a>
                </div>
            </form>
        </div>
    </div>
</div>