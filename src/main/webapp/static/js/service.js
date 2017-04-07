jQuery(function($) {
    $(".btn").on("click",function (evt) {
        evt.preventDefault();
        var href=$(this).attr("href");
        $("#main").load(href);
    })

    $("#findBy").on("click",function () {
        var val=$("#find").val();
        var url="/adminer/list?condition1="+val;
        $("#main").load(url);
    })

})