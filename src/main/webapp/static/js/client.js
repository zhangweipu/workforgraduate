$(function () {
    //主页js操作
    $(".left a").on("click", function (evt) {
        evt.preventDefault();
        $(".left").hide();
        var href = $(this).attr("href");
        $(".media-middle").load(href);
    })


    //添加订单js操作
    var a = "";
    var objec = "";
    $(".tijiao").on("click", function () {
        alert("提交");

    })
    $(".submi").on("click", function (evt) {
        var tab = $(this).val();
        if (objec == "") {
            alert("请点菜");
        } else {
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
    $(".addorder").on("click", function () {
        $father = $(this).parent();
        var name = $father.data("title");
        var id = $father.data("id");
        var price = $father.data("price");
        var $order = $('.order');
        var $nums = $('#nums');
        var a = $order.data("id");
        var jsonObject = {
            "orderId": a,
            "foodID": id,
            "foodName": name,
            "foodPrice": price
        }
        $.ajax({
            url: '/order/addorder',
            data: jsonObject,
            dataType: 'json',
            type: 'post',
            success: function (data) {
                var str = toshow(data);
                $nums.html(str);
            },
            error: function (data) {
                alert("error" + data);
            }
        });

    })

//动态添加绑定事件
    $("body").on("click", ".a", function () {
        var $this = $(this);
        var name = $this.data('name');
        var id = $this.data('id');
        var price = $this.data('price');
        var orderid = $('.order').data('id');
        var $nums = $('#nums');
        var jsonObject = {
            "orderId": orderid,
            "foodID": id,
            "foodName": name,
            "foodPrice": price
        }
        $.post('/order/addorder', jsonObject, function (data) {
            // var str="<a href='javascript:void(0);' class='reset'>取消订单</a></div>" +
            //     "<div class='list cai'>菜</div><div class='list money'>钱</div>";
            // var a=data;
            // for(var i=0;i<a.length;i++){
            //     str+='<div class="list name">'+a[i].foodName+'</div>' +
            //         '<div class="list num">' +
            //         '<div class="jia"><a class="a" href="javascript:void(0);"  data-name="'+a[i].foodName+'"' +
            //         'data-id="'+a[i].foodID+'" data-price="'+a[i].foodPrice+'">+</a></div> <div class="number">'+a[i].num+'</div>' +
            //         '<div class="jian"><a href="javascript:void(0);"  data-id="'+a[i].foodID+'">-</a> </div></div>';
            // }
            var str = toshow(data);
            $nums.html(str);
        })

    })
    //
    // $("body").on("click",".a",function () {
    //     alert("aaaa");
    // })

    $("body").on("click", ".b", function () {
        var id = $(this).data("id");
        var $nums = $('#nums');
        $.post("/order/suborder", {"foodID": id}, function (data) {
            var str = toshow(data);
            $nums.html(str);
        })
    })
    $("body").on("click",".reset",function () {
        var str="";
        $.get("/order/reset",{},function (data) {
        })
        $('#nums').html(str);
    })
    function toshow(data) {
        if (data.length == 0) {
            var str = "";
        } else {
            var str = "<a href='javascript:void(0);' class='reset'>取消订单</a></div>" +
                "<div class='list cai'>菜</div><div class='list money'>钱</div>";
            var a = data;
            for (var i = 0; i < a.length; i++) {
                str += '<div class="list name">' + a[i].foodName + '</div>' +
                    '<div class="list num">' +
                    '<div class="jia"><a class="a" href="javascript:void(0);"  data-name="' + a[i].foodName + '"' +
                    'data-id="' + a[i].foodID + '" data-price="' + a[i].foodPrice + '">+</a></div> <div class="number">' + a[i].num + '</div>' +
                    '<div class="jian"><a class="b" href="javascript:void(0);" data-id="' + a[i].foodID + '">-</a> </div></div>';
            }
        }
        return str;
    }
})
