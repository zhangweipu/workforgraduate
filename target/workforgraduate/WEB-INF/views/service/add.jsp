
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加菜</title>
    <script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <%--<script type="text/javascript">--%>
        <%--$("#subm").on("click",function (evt) {--%>
            <%--var a=$("input[name='size']").val();--%>
            <%--alert("www"+a);--%>
            <%--evt.preventDefault();--%>
        <%--})--%>
    <%--</script>--%>
</head>
<body>
<form action="/service/add" method="post" enctype="multipart/form-data">
    <div class="row">
    <div class="col-xs-4">
        <%--<input type="text" class="form-control" name="id" placeholder=".col-xs-4">--%>
       菜名： <input type="text" class="form-control" name="name" placeholder="请输入菜名">
            菜的图片<input type="file" name="icon" class="form-control" placeholder="请输入图片" >
        <%--<input type="text" class="form-control" name="imageName" placeholder=".col-xs-4">--%>
       菜的种类： <input type="text" class="form-control" name="type" placeholder="种类">
        菜的大小：<input type="text" class="form-control" name="size" placeholder="大小">
        菜的价格：<input type="text" class="form-control" name="price" placeholder="价格">
        菜的口味：<select class="form-control" name="la" placeholder=".col-xs-4">
            <option value="la">辣</option>
            <option value="bula">不辣</option>
            <option value="tela">特辣</option>
        </select>
            详细介绍：<textarea name="detail" class="form-control" rows="3"></textarea>
        <button type="submit" id="subm" class="btn btn-primary">提交</button>
    </div>
    </div>
</form>
</body>
</html>
