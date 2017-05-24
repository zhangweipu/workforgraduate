/**
 * Created by zhang on 2017/2/8.
 */
jQuery(function ($) {
    $.ajaxSetup ({
        cache: false //关闭AJAX相应的缓存
    });
    //写登陆界面的验证
    $("#submit").on("click",function () {
        var $id=$("input[name='str1']");
        var $passwd=$("input[name='str2']");
        var $showErr=$("#showErr");
        if(""==$id.val()){
            $showErr.html("账号不能为空");
            $id.focus();
            return;
        }
        if(isNaN($id.val())){
            $showErr.html("账号格式不对");
            $id.focus();
            return;
        }
        if($passwd.val()==""){
            $showErr.html("输入密码");
            $passwd.focus();
            return;
        }
        $showErr.html("");
        $("#form1").submit();
    })
})
