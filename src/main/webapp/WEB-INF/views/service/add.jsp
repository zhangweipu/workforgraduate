
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加菜</title>
    <script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript">

        $("input[name='size']").on("blur",function () {
            var value=$(this).val();
            alert(value);
        })
    </script>
</head>
<body>
<form action="/service/add" method="post" enctype="multipart/form-data">
    <div class="row">
    <div class="col-xs-4">
        <%--<input type="text" class="form-control" name="id" placeholder=".col-xs-4">--%>
       菜名： <input type="text" class="form-control" name="name" placeholder=".col-xs-4">
        <input type="text" class="form-control" name="imageName" placeholder=".col-xs-4">
        <input type="text" class="form-control" name="type" placeholder=".col-xs-4">
        <input type="text" class="form-control" name="size" placeholder=".col-xs-4">
        <input type="text" class="form-control" name="price" placeholder=".col-xs-4">
        <button type="submit" class="btn btn-primary">提交</button>
    </div>
    </div>
</form>
</body>
</html>
