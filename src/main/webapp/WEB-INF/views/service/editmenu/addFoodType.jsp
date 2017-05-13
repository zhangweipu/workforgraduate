<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
<div class="bg-light lter b-b wrapper-md">
    <h1 class="m-n font-thin h3">批量添加菜单类型</h1>
</div>
<div class="panel panel-default">

    <div class="panel-body">
        <form class="form-horizontal" action="/admin/addFoodType" method="post">
            <div class="ng-scope">
                <div class="table-header">
                    添加食物种类
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
                                style="width: 10px;">序列
                            </th>
                            <th class="sorting" tabindex="0"
                                aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                aria-label="Domain: activate to sort column ascending"
                                style="width: 10px;">类型
                            </th>
                            <th class="sorting" tabindex="0"
                                aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                aria-label="Domain: activate to sort column ascending"
                                style="width: 10px;">优先级
                            </th>

                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach begin="0" end="10" varStatus="status">
                            <tr class="ng-scope odd">
                                <td>${status.index}</td>
                                <td><input class="type${status.index}" type="text" name="type"></td>
                                <td><input class="type${status.index}" type="text" name="id"></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <input type="submit" value="确定">
                    <input type="reset" value="重置">
                </div>
            </div>
        </form>
    </div>
</div>
<div class="display"><span>设置优先级，越小越优先展示</span></div>
</div>