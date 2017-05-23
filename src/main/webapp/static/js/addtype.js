$(function () {
    $("#sure").on("click",function () {
        var option={
            success:function (data) {
                $("#main").load(ur+"/success2");
            },
            clearForm:true
        }
        $("#form3").ajaxForm(option).submit();
        return true;
    });
})
