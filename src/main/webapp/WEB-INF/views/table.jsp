<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div >
<div class="bg-light lter b-b wrapper-md">
    <h1 class="m-n font-thin h3">查询结果</h1>
</div>
<div class="panel panel-default">

    <div class="panel-body">
        <form class="form-horizontal" method="post" name="user">
            <div class="ng-scope">
                <div class="table-header">
                    查询结果
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
                                style="width: 102px;">模块代号
                            </th>
                            <th class="sorting" tabindex="0"
                                aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                aria-label="Domain: activate to sort column ascending"
                                style="width: 217px;">产品名称
                            </th>
                            <th class="sorting" tabindex="0"
                                aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                aria-label="Domain: activate to sort column ascending"
                                style="width: 217px;">产品状态
                            </th>
                            <th class="sorting" tabindex="0"
                                aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                aria-label="Domain: activate to sort column ascending"
                                style="width: 217px;">产品是否需要复核
                            </th>
                            <th class="sorting" tabindex="0"
                                aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                aria-label="Domain: activate to sort column ascending"
                                style="width: 217px;">产品是否需要审核
                            </th>
                            <th class="sorting" tabindex="0"
                                aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                aria-label="Domain: activate to sort column ascending"
                                style="width: 217px;">产品是否需要签名
                            </th>
                            <th class="sorting" tabindex="0"
                                aria-controls="DataTables_Table_4" rowspan="1" colspan="1"
                                aria-label="Domain: activate to sort column ascending"
                                style="width: 217px;">产品是否需要交易密码
                            </th>

                        </tr>
                        </thead>
                        <tbody>
                        <tr ng-class="{'selected': domain.selected}" class="ng-scope odd" role="row"
                            ng-repeat="TransCode in pageChanegData.list">
                            <td>{{'ModelType.'+TransCode.moduleid | translate}}</td>
                            <td>{{TransCode.prdname}}</td>
                            <td>{{'PrdState.'+TransCode.prdstate | translate}}</td>
                            <td>{{'prdcheckflag.'+TransCode.prdcheckflag | translate}}</td>
                            <td>{{'prdauthflag.'+TransCode.prdauthflag | translate}}</td>
                            <td>{{'prddigitsignflag.'+TransCode.prddigitsignflag | translate}}</td>
                            <td>{{'prdtrspasswordflag.'+TransCode.prdtrspasswordflag | translate}}</td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="row">
                        <div class="col-xs-6">
                            <div class="dataTables_info" id="DataTables_Table_4_info" ng-if="pageChanegData.currentindex"
                                 role="status" aria-live="polite">Showing {{pageChanegData.currentindex+1}} to
                                {{pageChanegData.currentindex +pageChanegData.pagesize > pageChanegData.recordnumber?pageChanegData.recordnumber:pageChanegData.currentindex+pageChanegData.pagesize}} of {{pageChanegData.recordnumber}}
                                entries
                            </div>
                            <div class="dataTables_info" id="DataTables_Table_4_info" ng-if="!pageChanegData.currentindex"
                                 role="status" aria-live="polite">Showing 1 to {{pageChanegData.pagesize}} of {{pageChanegData.recordnumber}}
                                entries
                            </div>
                        </div>
                        <div class="col-xs-6">
                            <div class="dataTables_paginate paging_simple_numbers"
                                 id="DataTables_Table_4_paginate">
                                <ul class="pagination">
                                    <li class="paginate_button previous disabled"
                                        aria-controls="DataTables_Table_4" tabindex="0"
                                        id="DataTables_Table_4_previous">
                                        <a style="cursor: pointer"  ng-click="changePage('previous')">上一页</a>
                                    </li>
                                    <li class="paginate_button active"
                                        aria-controls="DataTables_Table_4" tabindex="0">
                                        <a href="#">1</a>
                                    </li>
                                    <li class="paginate_button " aria-controls="DataTables_Table_4"
                                        tabindex="0"><a href="#">2</a>
                                    </li>
                                    <li class="paginate_button " aria-controls="DataTables_Table_4"
                                        tabindex="0"><a href="#">3</a>
                                    </li>
                                    <li class="paginate_button next"
                                        aria-controls="DataTables_Table_4" tabindex="0"
                                        id="DataTables_Table_4_next">
                                        <a style="cursor: pointer"  ng-click="changePage('next')">下一页</a>
                                    </li>
                                    <li class="paginate_button next"
                                        aria-controls="DataTables_Table_4" tabindex="0"
                                        id="DataTables_Table_4_next">
                                        <a style="cursor: pointer"  ng-click="goBack()">返回</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</div>