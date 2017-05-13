<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="FUNC" uri="http://myel.com" %>
<%--<script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>--%>
    <script src="/static/js/service.js"></script>
    <script src="/static/js/angular.min.js"></script>
    <script src="/static/bootstrap3/js/bootstrap.min.js"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">批量添加菜单类型</h1>
    </div>
    <div class="panel panel-default">

        <div class="panel-body">
            <form class="form-horizontal" action="/admin/addFoodType"   method="post">
                <div class="ng-scope">
                    <div class="table-header">
                        <input type="text" id="find" placeholder="请输入菜名"/>
                        <a id="findBy" href="#">查找</a><br>
                        <c:forEach begin="0" end="${FUNC:myFunc().size()}" items="${FUNC:myFunc()}" var="ls" >
                            <a class="btn" href="${url}?condition=${ls}">${ls}</a>
                        </c:forEach>
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
                                    style="width: 102px;">编号
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">名称
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">图片
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">类型
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">价格
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">大小
                                </th>
                                <th class="sorting" tabindex="0"
                                    aria-controls="DataTables_Table_4" rowspan="1" colspan="2"
                                    aria-label="Domain: activate to sort column ascending"
                                    style="width: 102px;">操作
                                </th>

                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${list}" var="ls" varStatus="lsi">
                                <tr>
                                    <td>${lsi.index+1}</td>
                                    <td> ${ls.name}</td>
                                    <td> ${ls.imageName}</td>
                                    <td> ${ls.type}</td>
                                    <td> ${ls.price}</td>
                                    <td>${ls.size}</td>
                                    <td>  <a href="/admin/update?id=${ls.id}" class="btn btn-default" role="button">修改</a></td>
                                    <td>  <a href="/admin/delete?id=${ls.id}" class="btn btn-default" role="button">删除</a></td>
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


<%@include file="../../common/page.jsp"%>
<script type="text/javascript">

</script>
<%--<jsp:include page="../common/page.jsp">--%>
    <%--<jsp:param name="coun" value="11"/>--%>
    <%--<jsp:param name="aa" value="11"/>--%>
<%--</jsp:include>--%>
<%--</body>--%>
<%--</html>--%>
