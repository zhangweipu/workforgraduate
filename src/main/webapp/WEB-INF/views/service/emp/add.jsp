<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common.jsp"%>
<script src="<%=path%>/static/js/jquery.form.js"></script>
<script src="<%=path%>/static/js/service.js"></script>
<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">添加员工信息</h1>
    </div>
    <div class="panel panel-default">
        <div class="panel-body">
            <form id="form3" action="<%=path%>/admin/emp/add" class="form-horizontal" method="post">
                <div class="line line-dashed b-b line-lg pull-in"></div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">姓名：</label>
                    <div class="col-sm-10">
                        <input class="input" type="text" name="name">
                    </div>
                </div>

                <div class="form-group" >
                    <label class="col-sm-2 control-label">年龄：</label>
                    <div class="col-sm-10" >
                        <input class="input" type="text" name="age">
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">性别：</label>
                    <div class="col-sm-10" >
                        <select class="input" name="sex"><option value="1">男</option><option value="0">女</option></select>
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">职业：</label>
                    <div class="col-sm-10" >
                        <select class="input" name="duty">
                            <option value="">请选择</option>
                            <option value="1">管理员</option>
                            <option value="2">厨师</option>
                            <option value="3">服务员</option>
                            <option value="4">财务</option>
                        </select>
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">入职时间：</label>
                    <div class="col-sm-10" >
                        <input onclick="WdatePicker();" class="input" type="text" name="worktime" placeholder="YYYY-MM-DD">
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">薪资：</label>
                    <div class="col-sm-10" >
                        <input class="input" type="text" name="salary">
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">权限：</label>
                    <div class="col-sm-10" >
                        <select class="input" name="power">
                            <option value="">请选择</option>
                            <option value="1">管理权限</option>
                            <option value="2">厨师权限</option>
                            <option value="3">服务员权限</option>
                            <option value="4">财务权限</option>
                        </select>
                    </div>
                </div>

                <div  align="center">
                    <input type="button" id="queding" value="保存">
                    <a href="">批量添加</a>
                </div>
            </form>
        </div>
    </div>
</div>