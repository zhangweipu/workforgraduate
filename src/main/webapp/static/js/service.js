jQuery(function($) {
    $(".btn").on("click",function (evt) {
        evt.preventDefault();
        var href=$(this).attr("href");
        $("#main").load(href);
    })
    //$('.dropdown-toggle').dropdown()
    // $(".btn").on("click",function (evt) {
    //     evt.preventDefault();
    //     var href=$(this).attr("href");
    //     $("#main").load(href);
    // })
})