jQuery(function($) {
    $(".btn").on("click",function (evt) {
        evt.preventDefault();
        var href=$(this).attr("href");
        $("#main").load(href);
    })
      $(".sub").on("click",function () {
          
      })
})