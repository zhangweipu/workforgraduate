/**
 * Created by admin on 2016/10/16.
 */
$(function () {
    //主页js操作
    $(".left a").on("click",function (evt) {
        evt.preventDefault();
        $(".left").hide();
        var href=$(this).attr("href");
        $(".media-middle").load(href);
    })


   //添加订单js操作
    var a="";
    var objec="";
    $(".tijiao").on("click",function () {
        objec+=$(this).val()+",";
        a+=$(this).attr("value")+"<button  value='"+$(this).attr("value")+"' class=\"glyphicon glyphicon-remove\"></button> ";
        $(".li").html(a);
    })
  $(".submi").on("click",function (evt) {
            var tab=$(this).val();
            if(objec==""){
                alert("请点菜");
            }else {
                jsonData = {
                    "tab": tab,
                    "str": objec
                }
                $.ajax({
                    url: "/client/addOrder",
                    type: "post",
                    dataTypes: "json",
                    data: JSON.stringify(jsonData),
                    contentType: "Application/json;charset=utf-8",
                    success: function () {
                        window.location.href = "/client/lsOrder?tab=" + tab;
                    }
                });
            }
  })
    // $(".glyphicon").bind("click",function () {
    //     alert("ss");
    // })
    // $(".yichu").on("click",function () {
    //      a="";
    //     $(".li").html(a);
    // })
$(".addorder").on("click",function () {
    $father=$(this).parent();
    var name=$father.data("title");
    var id=$father.data("id");
    var price=$father.data("price");
    var $order=$('.order',parent.document);
    var $nums=$('#nums',parent.document);
    var a=$order.data("id");
    var jsonObject={
        "orderId":a,
        "foodID":id,
        "foodName":name,
        "foodPrice":price
    }
    $.ajax({
        url:'/order/addorder',
        data:jsonObject,
        dataType:'json',
        type:'post',
        success:function (data) {
            var str="<div class='list cai'>菜</div><div class='list money'>钱</div>";
            var a=data;
            for(var i=0;i<a.length;i++){
                str+='<div class="list name">'+a[i].foodName+'</div><div class="list num">'+a[i].num+'</div>';
            }
            $nums.html(str);
        },
        error:function (data) {
            alert("error"+data);
        }
    });

})

})
