<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingOne">
                <h4 class="panel-title">
                    <a role="button" data-toggle="collapse" data-parent="#accordion"  href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                     添加菜单
                    </a>
                </h4>
            </div>
            <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                <div class="panel-body">
                    <ul  class="nav nav-sidebar">
                        <li ><a href="/service/add" class="btn " role="button">添加一个</a></li>
                        <li ><a href="/service/addmany" class="btn " role="button">批量添加</a></li>
                    </ul>
                </div> 
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingTwo">
                <h4 class="panel-title">
                    <a class="collapsed" role="button" data-toggle="collapse"
                       data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                        编辑菜单
                    </a>
                </h4>
            </div>
            <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                <div class="panel-body">
                    <ul class="nav nav-sidebar">
                        <%--<li ><a href="/service/add" class="btn " role="button">添加菜单</a></li>--%>

                        <li ><a href="/service/list" class="btn " role="button">菜单列表</a></li>

                    </ul>
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading" role="tab" id="headingThree">
                <h4 class="panel-title">
                    <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                        订单列表
                    </a>
                </h4>
            </div>
            <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                <div class="panel-body">
                    <ul  class="nav nav-sidebar">
                        <%--<li ><a href="/service/add" class="btn " role="button">添加菜单</a></li>--%>
                        <li ><a href="/service/showOrder" class="btn " role="button">订单列表</a></li>
                        <li ><a href="#" class="btn " role="button">Primary link</a></li>

                    </ul>
                </div>
            </div>
        </div>
    </div>