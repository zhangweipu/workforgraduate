<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../common.jsp"%>
<%--<script src="<%=path%>/static/js/waiter.js"></script>--%>
<div class="list">
    <table>
        <thead>
        <tr>
            <td>序列</td>
            <td>菜名</td>
            <td>价格</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="list" varStatus="status">
            <td>${status.index}</td>
            <td>${list.name}</td>
            <td>${list.price}</td>
            <td><a class="btn" data-id="${list.id}" data-name="${list.name}" data-price="${list.price}" data-orderid="${orderid}"
                   href="javascript:void(0);">选择</a></td>
        </c:forEach>
        </tbody>
    </table>
</div>
<script>
    //没有用
    $.ajaxSetup ({
        cache: false //关闭AJAX相应的缓存
    });
    var ur=$("#path").data("path");

    $(".btn").on("click",function () {
        var $this=$(this);
        var id=$this.data("id");
        var name=$this.data("name");
        var price=$this.data("price");
        var orderid=$this.data("orderid");
        var order={
            foodID:id,
            foodName:name,
            foodPrice:price,
            orderId:orderid
        }
        $.post(ur+"/order/addorder",order,function (data) {
            var str= toshow(data);
            $(".order",window.parent.document).html(str);
        })
    })

    $(".order",window.parent.document).on("click","#tijiao",function () {
        $.post(ur+"/order/submit",function (data) {
            alert(data);
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
${orderid}
