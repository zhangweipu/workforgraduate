<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1>批量导入菜单</h1>
<form action="/admin/addmany" method="post" enctype="multipart/form-data">
    <input name="file" type="file">
    <input type="submit">
</form>
<a href="/admin/down">模板下载</a>