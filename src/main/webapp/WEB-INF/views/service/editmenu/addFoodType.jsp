<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../common.jsp"%>
<script src="<%=path%>/static/js/jquery.form.js"></script>
<script src="<%=path%>/static/js/service.js"></script>
<div>
<div class="bg-light lter b-b wrapper-md">
    <h1 class="m-n font-thin h3">批量添加菜单类型</h1>
</div>
<div class="panel panel-default">

    <div class="panel-body">
        <form id="form3" class="form-horizontal" action="<%=path%>/admin/addFoodType" method="post">
            <div class="ng-scope">
                <div class="table-header">
                    添加食物种类
                </div>
                <div id="DataTables_Table_4_wrapper"
                     class="dataTables_wrapper form-inline no-footer">
                    <table>
                        <thead>
                        <tr >
                            <th>序列
                            </th>
                            <th>中文
                            </th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach begin="0" end="5" varStatus="status">
                            <tr class="ng-scope odd">
                                <td>${status.index}</td>
                                <td><input class="type${status.index}" type="text" name="type"></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <input class="btn btn-default" type="button" id="queding" value="确定">
                    <input class="btn btn-default" type="reset" value="重置">
                </div>
            </div>
        </form>
    </div>
</div>
<div class="display"><span>该添加为批量添加，最多可添加5个</span></div>
</div>