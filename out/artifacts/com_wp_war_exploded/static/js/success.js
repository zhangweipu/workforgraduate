$(function () {
    var t = $(".timer").data("time");
       time(t);
      // clearTimeout(timer)
})

function time(t) {
    $(".showtime").html(t);
    if(t>0) {
        timer = setTimeout(function () {
            time(t-1);
        }, 3000);
    }
    $(".timer").html("请尽情享用");
}
