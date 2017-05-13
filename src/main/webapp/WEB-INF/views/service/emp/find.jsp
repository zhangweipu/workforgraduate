<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/static/js/service.js"></script>
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
                                    style="width: 102px;">序号:
                                </th>
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
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">年龄
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">性别
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">入职时间
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">薪水
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">职权
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="2"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">操作
                                </th>


                            </tr>
                            </thead>
                            <tbody>

                            <c:forEach items="${list}" var="ls" varStatus="status">
                                <tr>
                                    <td>${status.index}</td>
                                    <td>${ls.id}</td>
                                    <td>${ls.name}</td>
                                    <td>${ls.age}</td>
                                    <td>${ls.sex}</td>
                                    <td>${ls.worktime}</td>
                                    <td>${ls.salary}</td>
                                    <td>${ls.power}</td>
                                    <td><a class="btn" href="/admin/emp/update?id=${ls.id}">修改</a></td>
                                    <td><a class="btn" href="/admin/emp/delete?id=${ls.id}">删除</a></td>
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
