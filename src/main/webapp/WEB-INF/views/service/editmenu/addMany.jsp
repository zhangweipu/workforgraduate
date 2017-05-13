<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
    <div class="bg-light lter b-b wrapper-md">
        <h1 class="m-n font-thin h3">批量导入菜单</h1>
    </div>
    <div class="panel panel-default">
        <div class="panel-body">
            <form  action="/admin/addmany" class="form-horizontal" method="post"  enctype="multipart/form-data">
                <div class="line line-dashed b-b line-lg pull-in"></div>

                <div class="form-group">
                    <label class="col-sm-2 control-label "></label>
                    <div class="col-sm-10">
                        <input name="file" type="file">
                    </div>
                </div>

                <div class="form-group" >
                    <label class="col-sm-2 control-label "></label>
                    <div class="col-sm-10" >
                        <input type="submit">
                    </div>
                </div>

                <div  align="center">
                    <a href="/admin/down">模板下载</a>
                </div>
            </form>

        </div>
    </div>
</div>