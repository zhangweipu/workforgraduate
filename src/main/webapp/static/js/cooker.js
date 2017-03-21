$(function () {
    $('.btu').on('click',function () {
        $parent=$(this).parent();
        if($('.child').length>0){
            $('.child').remove();
        }
        var id=$(this).data('id');
        $.post("/cooker/orderdetail",{"id":id},function (data) {
            var str="<div class='child'>";
            for (var i=0;i<data.length;i++) {
                str+="<span>"+data[i].foodName+"</span>";
                if(data[i].la=="ND"){
                    str+="<span><a class='undo' href='#'>未完成</a></span></br>";
                }else{
                    str+="<span class='do'>已完成</span></br>";
                }
            }
            str+="</div>";
            $parent.append(str);
        })
    })
    $('body').on('click','.undo',function () {
        alert("aaa");

    })

})
function getOrder($object) {
    var id=$object.data("id");
    alert(id);
    $.post("",{"id":id},function (data) {

    })

}
