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
    
    $("#find").on("click",function () {

        var id=$("#id").val();
        if(id=="" || id==null){
            $("#showErr").html("输入查询的员工号");
            $("#id").focus();
            return;
        }
        if(isNaN(id)){
            $("#showErr").html("员工号格式不正确");
            $("#id").focus();
            return;
        }
        $("#showErr").html("");
        var href=ur+"/admin/security/updateEmp?id="+id;
        $("#showRsp").load(href);
        // $.post(ur+"/admin/security/updateEmp",{id:id},function (response) {
        //     alert(response.password);
        // })
    })

    $("#container").on("click",'#reset',function () {
        var id=$(this).data("id");
        $.post(ur+"/admin/security/reset",{id:id},function (data) {
            if(data=="success"){
                $("#showRsp").html("");
                $("#showErr").html("成功");
            }
        })
    })

    $("#queding").on("click",function () {
        var num=0;
       $(".input").each(function () {
            if($(this).val()==""){
                console.log("kong",$(this));
            }else{
               num=num+1;
            }
        });
       if(num==7){
        var options={
            //url:url, //提交的地址
            //type:type,//form提交的方式
            //target:target,//显示服务器返回数据的元素id号
            //before:function(),//提交前执行的回调函数
            success:function(data){
                //alert(data);
            },//执行成功后的回调函数
            //dataType:null,//服务器返回的数据类型
            clearForm:true,//提交后清除表单中的字段
            //resetForm:true,//提交后重置表单中的字段
            timeout:6000 //设置请求时间
        };
        console.log("提交！！！！");
        $("#form3").ajaxForm(options).submit();
        $("#main").load(ur+"/success2");
    }else {
           alert("请输入完整！");
           return false;
       }
    })
    $("#sure").on("click",function () {
        var option={
            success:function (data) {
                $("#main").load(ur+"/success2");
            },
            clearForm:true
        }
        $("#form3").ajaxForm(option).submit();
    })
})