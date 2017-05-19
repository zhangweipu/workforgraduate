<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="covert" uri="http://covert.com" %>
<%@include file="../../common.jsp"%>
<script src="<%=path%>/static/js/service.js"></script>
<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">员工信息</h1>
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
                                    style="width: 102px;">姓名:
                                </th>

                            </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>${ls.id}</td>
                                    <td>${ls.name}</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </form>
        </div>
        <div  align="center">
            <button type="button" id="reset" data-id="${ls.id}" class="btn btn-primary">重置密码</button>
        </div>
    </div>
</div>
