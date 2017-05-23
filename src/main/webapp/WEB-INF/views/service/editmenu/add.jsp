<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="my" uri="http://myel.com" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>添加菜</title>
<%@include file="../../common.jsp"%>
<script src="<%=path%>/static/js/service.js"></script>
    <div class="add">
        <div class="bg-light lter b-b wrapper-md">
            <h1 class="m-n font-thin h3">添加菜品</h1>
        </div>
        <div class="panel panel-default">
            <div class="panel-body">
                <form class="form-horizontal" action="<%=path%>/admin/add" method="post" enctype="multipart/form-data">
                    <div class="line line-dashed b-b line-lg pull-in"></div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label ">种类：</label>
                        <div class="col-sm-10">
                            <select  name="type">
                                <option value="">请选择是食物类型</option>
                                <c:forEach items="${my:myFunc()}" var="item">
                                    <option value="${item.id}">${item.type}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group" >
                        <label class="col-sm-2 control-label ">菜名：</label>
                        <div class="col-sm-10" >
                            <input type="text" name="name" placeholder="菜名">
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label ">菜的规格：</label>
                        <div class="col-sm-10" >
                            <input type="text" name="size" placeholder="大小">
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label ">菜的价格：</label>
                        <div class="col-sm-10" >
                            <input type="text"  name="price" placeholder="价格"></td>
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label ">菜品图片：</label>
                        <div class="col-sm-10" >
                            <input type="file" name="icon"  placeholder="请上传图片" >
                        </div>
                    </div>
                    <div class="form-group" >
                        <label class="col-sm-2 control-label ">详细介绍：</label>
                        <div class="col-sm-10" >
                            <textarea name="detail" rows="3"></textarea>
                        </div>
                    </div>
                    <div  align="center">
                        <button type="submit" >提交</button>
                        <a class="btn btn-default" href="<%=path%>/admin/addmany">批量添加</a>
                    </div>
                </form>
            </div>
        </div>
    </div>


