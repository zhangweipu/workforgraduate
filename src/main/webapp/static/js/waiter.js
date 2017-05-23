$(function () {
    $(".get").on("click",function (evt) {
        evt.preventDefault();
        var href=$(this).attr("href");
        $(".main").load(href);
    })
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
        $.post("/order/addorder",order,function (data) {
           var str= toshow(data);
            $(".order").html(str);
        })
    })

    $(".order").on("click","#tijiao",function () {
         $.post("/order/submit",function (data) {
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

})