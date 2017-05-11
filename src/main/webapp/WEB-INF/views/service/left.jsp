<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingOne">
                <h4 class="panel-title">
                    <a role="button" data-toggle="collapse" data-parent="#accordion"  href="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
                     菜单管理
                    </a>
                </h4>
            </div>
            <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                <div class="panel-body">
                    <ul  class="nav nav-sidebar">
                        <li ><a href="/admin/addFoodType" class="btn " role="button">添加食物类型</a></li>
                        <li ><a href="/admin/add" class="btn " role="button">添加食物菜单</a></li>
                        <li ><a href="/admin/list" class="btn " role="button">编辑菜单列表</a></li>
                    </ul>
                </div> 
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingTwo">
                <h4 class="panel-title">
                    <a class="collapsed" role="button" data-toggle="collapse"
                       data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                        订单管理
                    </a>
                </h4>
            </div>
            <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                <div class="panel-body">
                    <ul class="nav nav-sidebar">
                        <%--<li ><a href="/adminer/add" class="btn " role="button">添加菜单</a></li>--%>
                            <%--<li ><a href="/adminer/add" class="btn " role="button">添加菜单</a></li>--%>
                            <li ><a href="/admin/showOrder" class="btn " role="button">订单记录</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingThree">
                <h4 class="panel-title">
                    <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                        财务管理
                    </a>
                </h4>
            </div>
            <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                <div class="panel-body">
                    <ul  class="nav nav-sidebar">
                        <%--<li ><a href="/adminer/add" class="btn " role="button">添加菜单</a></li>--%>
                        <li ><a href="/admin/finance/index" class="btn " role="button">账户信息</a></li>
                        <li ><a href="/admin/finance/outlist" class="btn " role="button">支出明细</a></li>
                        <li ><a href="/admin/finance/inlist" class="btn " role="button">收入明细</a></li>
                        <li ><a href="/admin/finance/analyse" class="btn " role="button">财务分析</a></li>

                    </ul>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingFour">
                <h4 class="panel-title">
                    <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                        人事管理
                    </a>
                </h4>
            </div>
            <div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
                <div class="panel-body">
                    <ul  class="nav nav-sidebar">
                        <li ><a href="/admin/emp/add" class="btn " role="button">添加员工信息</a></li>
                        <li ><a href="/admin/emp/find" class="btn " role="button">查找员工信息</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingFive">
                <h4 class="panel-title">
                    <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
                        安全设置
                    </a>
                </h4>
            </div>
            <div id="collapseFive" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFive">
                <div class="panel-body">
                    <ul  class="nav nav-sidebar">
                        <li ><a href="/admin" class="btn " role="button">管理员管理</a></li>
                        <li ><a href="/admin" class="btn " role="button">员工安全管理</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>