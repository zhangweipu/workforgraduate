<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="/static/js/service.js"></script>
    <script src="/static/bootstrap3/js/bootstrap.min.js"></script>
    <title>菜单列表</title>
</head>
<body style="width: 768px">
<table id="table">
    <thead>
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>类型</td>
        <td>价格</td>
        <td>大小</td>
        <td>大小</td>
        <%--<td>大小</td>--%>

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

      <%--<td>  <a href="/service/update?id=${ls.id}" class="btn btn-primary btn-lg active" role="button">修改</a></td>--%>
      <%--<td>  <a href="/service/delete?id=${ls.id}" class="btn btn-primary btn-lg active" role="button">删除</a></td>--%>
  </tr>
</c:forEach>
    </tbody>
</table>
<a href="href='javascript:;'" onclick="getTable();">按钮</a>
<script type="text/javascript">
    function getTable(){
    //创建封装数据的对象
    var obj={
        index:"",
        name:"",
        imageName:"",
        type:"",
        price:"",
        size:""
    }
    //遍历表格封装数据（表格的每一行是一个json对象，多还
    // 就是一个json数组，json数组再弄成一个对象）
    var a =JSON.parse("{\"title\":\"\",\"data\":[]}");

    //封装底部表格中的数据
    var rows=document.getElementById("table").rows.length;//获得行数包括hesd
    var columns=document.getElementById("table").rows[0].cells.length;//获得列数
    if(rows>=1){
        for(var i=1;i<rows;i++){
            var obj=new Object();
            obj.index=document.getElementById("table").rows[i].cells[0].innerHTML;
            obj.name=document.getElementById("table").rows[i].cells[1].innerHTML;
            obj.imageName=document.getElementById("table").rows[i].cells[2].innerHTML;
            obj.type=document.getElementById("table").rows[i].cells[3].innerHTML;
            obj.price=document.getElementById("table").rows[i].cells[4].innerHTML;
            obj.size=document.getElementById("table").rows[i].cells[5].innerHTML;
          a.data.push(obj);//向json数组添加json对象的方法
        }
        //格式化数据
        var obj=JSON.stringify(a);//这行很关键
        //异步提交数据
        $.ajax({
            url:"/service/getTable",
            type:"post",
            data:{"getTable":obj},
            dataType:"json",
            success:function(){

            }
        });
    }
    }
</script>
</body>
</html>
