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
    var price=$father.data("price")
    alert(price);
    $("#money").html(price);

})

})
