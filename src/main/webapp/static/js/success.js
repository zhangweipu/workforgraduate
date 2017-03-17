$(function () {
    var t = $(".timer").data("time");
       time(t);
      // clearTimeout(timer)
})

function time(t) {
    $(".showtime").html((t) + "aaa");
    if(t>0) {
        timer = setTimeout(function () {
            time(t-1);
        }, 3000);
    }
}
