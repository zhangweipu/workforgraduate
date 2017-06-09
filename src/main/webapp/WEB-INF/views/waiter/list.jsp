<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../common.jsp"%>
<link rel="stylesheet" href="<%=path%>/static/bootstrap3/css/bootstrap-theme.css">
<script src="<%=path%>/static/bootstrap3/js/jquery-1.11.2.min.js"></script>

<div class="food-list">
            <div class="list-row">
                <c:forEach items="${list}" var="li">
                    <div class="row">
                        <div class="image">
                            <img src="${url}${li.imageName}">
                        </div>
                        <div class="fname">
                            <span title="${li.name}">${li.name}</span>
                        </div>
                        <div class="sold">

                        </div>
                        <div class="addli">
                            <div class="addli-money">￥${li.price}/份</div>
                            <div class="addli-add" data-title="${li.name}">
                                <a class="tianjia" href="javascript:void(0);"
                                   data-id="${li.id}" data-name="${li.name}" data-price="${li.price}" >添加</a></div>
                        </div>
                    </div>
                </c:forEach>
</div>
<script>
    //没有用
    $.ajaxSetup ({
        cache: false //关闭AJAX相应的缓存
    });
    var ur=$("#path").data("path");

    $(".tianjia").on("click",function () {
        var $this=$(this);
        var id=$this.data("id");
        var name=$this.data("name");
        var price=$this.data("price");
        var order={
            foodID:id,
            foodName:name,
            foodPrice:price,
        }
        debugger;
        $.post(ur+"/order/addorder",order,function (data) {
            var str= toshow(data);
            $(".showord").html(str);
        })
    })

    $(".showord",window.parent.document).on("click","#tijiao",function () {
        $.post(ur+"/order/submit",function (data) {
            if(data!=null){
                window.location.href="/client/success";
            }
        })
    })

    function toshow(data) {
        if (data.length == 0) {
            var str = "";
        } else {
            var str = "<table><tr><td>菜名</td><td>价格</td><td>数量</td></tr>";
            var a = data;
            for (var i = 0; i < a.length; i++) {
                str += "<tr><td>"+a[i].foodName+"</td><td>"+a[i].foodPrice+"</td><td>"+a[i].num+"</td></tr>"
            }
        }
        str+="</table><div><input type='button' id='tijiao' value='提交'></div>";
        return str;
    }

</script>

