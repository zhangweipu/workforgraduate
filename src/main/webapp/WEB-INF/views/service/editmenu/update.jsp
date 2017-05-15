<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="my" uri="http://myel.com" %>
<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">修改食物信息</h1>
    </div>
    <div class="panel panel-default">
        <div class="panel-body">
            <form:form  action="/admin/update" class="form-horizontal" method="post" modelAttribute="food">
                <div class="line line-dashed b-b line-lg pull-in"></div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">菜名：</label>
                    <div class="col-sm-10">
                        <form:input path="name"/>
                    </div>
                </div>

                <div class="form-group" >
                    <label class="col-sm-2 control-label">价格：</label>
                    <div class="col-sm-10" >
                        <form:input path="price"/>
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">种类：</label>
                    <div class="col-sm-10" >
                        <form:select path="type">
                            <form:option value="">请选择是食物类型</form:option>
                                <form:options items="${my:myFunc()}" itemValue="id" itemLabel="type"></form:options>
                        </form:select>
                    </div>
                </div>
                <div class="form-group" >
                    <label class="col-sm-2 control-label">规格：</label>
                    <div class="col-sm-10" >
                        <form:input path="size"/>
                    </div>
                </div>
                <form:hidden path="id"/>
                <form:hidden path="imageName"/>
                <div  align="center">
                    <input id="aa" type="submit" value="提交">
                </div>
            </form:form>
        </div>
    </div>
</div>