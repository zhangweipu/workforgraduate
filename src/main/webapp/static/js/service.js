jQuery(function($) {
    var ur=$("#path").data("path");
    $(".btn").on("click",function (evt) {
        evt.preventDefault();
        var href=$(this).attr("href");
        $("#main").load(href);
    })

    $("#findBy").on("click",function () {
        var val=$("#find").val();
        var url=ur+"/admin/list?condition1="+val;
        $("#main").load(url);
    })

    $(".out-btn").on("click",function (evt) {
        evt.preventDefault();
        $(".out-main").fadeIn();
    })
    $("#update").on("click",function () {
        var pass1=$("#password1").val();
        var pass2=$("#password2").val();
        var pass3=$("#password3").val();
        var options={
            str1:pass1,
            str2:pass2,
            str3:pass3
        }
        $.post(ur+"/admin/security/update",options,function (response) {
            if(response=="success"){
                $("#main").load(ur+"/success");
            }else {
                $("showErr").html("修改密码失败！！！")
            }
        })
    })
})