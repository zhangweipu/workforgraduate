<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../common.jsp"%>
<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">修改员工信息</h1>
    </div>
    <div class="panel panel-default">
        <div class="panel-body">
            <form  action="<%=path%>/admin/emp/toUpdate" class="form-horizontal" method="post">
                <div class="line line-dashed b-b line-lg pull-in"></div>
                <input type="text" name="id" hidden value="${emp.id}">
                <div class="form-group">
                    <label class="col-sm-2 control-label">姓名：</label>
                    <div class="col-sm-10">
                        <input type="text" name="name" value="${emp.name}">
                    </div>
                </div>

                <div class="form-group" >
                    <label class="col-sm-2 control-label">年龄：</label>
                    <div class="col-sm-10" >
                        <td><input type="text" name="age" value="${emp.age}"></td>
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">性别：</label>
                    <div class="col-sm-10" >
                        <input type="text" name="sex" value="${emp.sex}">
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">职位：</label>
                    <div class="col-sm-10" >
                        <input type="text" name="power" value="${emp.power}">
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">薪资：</label>
                    <div class="col-sm-10" >
                        <input type="text" name="salary" value="${emp.salary}">
                    </div>
                </div>


                <div  align="center">
                    <input type="submit" value="确定">
                </div>
            </form>
        </div>
    </div>
</div>