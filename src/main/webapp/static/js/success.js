$(function () {
    var t = $(".timer").data("time");
       time();
      // clearTimeout(timer)
})

function time() {
    $(".showtime").html((t - 1) + "aaa");
    timer= setTimeout(function () {
        time();
    }, 3000);
}
