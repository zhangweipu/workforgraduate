<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加菜</title>
    <script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript">
        $("#subm").on("click",function (evt) {
            alert("here");
            $(".required").each(function () {
                var inp=$(this).val();
                if(inp==""){
                    alert("kong");
                    evt.preventDefault();
                    return;
                }else{
                    alert(inp);
                }
            })
        })
    </script>
</head>
<body>
<form action="/service/add" method="post" enctype="multipart/form-data">
        <table class="table">
            <tr ><td colspan="2" align="center">添加菜品</td></tr>
        <%--<input type="text" class="form-control" name="id" placeholder=".col-xs-4">--%>
      <tr><td>菜名：</td> <td> <input type="text" class="form-control required" name="name" placeholder="请输入菜名"></td></tr>

        <%--<input type="text" class="form-control" name="imageName" placeholder=".col-xs-4">--%>
            <tr> <td>菜的种类：</td><td> <input type="text" class="form-control required" name="type" placeholder="种类"></td></tr>
            <tr><td> 菜的大小：</td><td><input type="text" class="form-control" name="size" placeholder="大小"></td></tr>
            <tr><td> 菜的价格：</td><td><input type="text" class="form-control required" name="price" placeholder="价格"></td></tr>
            <tr><td>菜的口味：</td><td><select class="form-control" name="la" placeholder=".col-xs-4">
            <option value="la">辣</option>
            <option value="bula">不辣</option>
            <option value="tela">特辣</option>
        </select></td></tr>
            <tr><td>菜品图片：</td><td><input type="file" name="icon" class="form-control" placeholder="请上传图片" ></td></tr>
           <tr> <td>详细介绍：</td><td><textarea name="detail" class="form-control" rows="3"></textarea></td></tr>
            <tr><td><button type="submit" id="subm" class="btn btn-primary">提交</button></td></tr>
        </table>
</form>
</body>
</html>
