<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../common.jsp"%>
<link href="<%=path%>/static/css/finance.css" rel="stylesheet">
<script  src="<%=path%>/static/js/service.js"></script>
<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">收入详细</h1>
    </div>
    <div class="panel panel-default">

        <div class="panel-body">
            <form class="form-horizontal">
                <div class="ng-scope">
                    <div class="table-header">
                    </div>
                    <div id="DataTables_Table_4_wrapper"
                         class="dataTables_wrapper form-inline no-footer">
                        <table datatable="ng" dt-options="dtOptions" dt-column-defs="dtColumnDefs"
                               class="table table-striped table-bordered table-hover row-border hover ng-isolate-scope dataTable no-footer"
                               style="display: table;" id="DataTables_Table_4" role="grid"
                               aria-describedby="DataTables_Table_4_info">
                            <thead>
                            <tr role="row">
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">编号:
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">时间:
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">状态:
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">总额:
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">类型:
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">详情:
                                </th>

                            </tr>
                            </thead>
                            <tbody>

                            <c:forEach items="${list}" var="ls">
                                <tr><td>${ls.transId}</td>
                                    <td><fmt:formatDate value="${ls.time}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
                                    <td>${ls.type}</td>
                                    <td>${ls.turnover}</td>
                                    <td>${ls.detail}</td>
                                    <td><a class="btn" href="<%=path%>/admin/orderdetail?id=${ls.transId}">详情</a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>

            </form>
        </div>
    </div>
</div>