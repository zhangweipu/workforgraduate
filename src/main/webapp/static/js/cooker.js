$(function () {
    $('.btu').on('click',function () {
        $parent=$(this).parent();
        if($('.child').length>0){
            $('.child').remove();
        }
        var id=$(this).data('id');
        $.post("<%=path%>/admin/cooker/orderdetail",{"id":id},function (data) {
            var str="<div class='child'>";
            for (var i=0;i<data.length;i++) {
                str+="<span>"+data[i].foodName+"</span>";
                if(data[i].la=="ND"){
                    str+="<span><a class='undo' data-oid='"+id+"' data-fid='"+data[i].foodID+"' href='#'>未完成</a></span></br>";
                }else{
                    str+="<span class='do'>已完成</span></br>";
                }
            }
            str+="</div>";
            $parent.append(str);
        })
    })
    $('body').on('click','.undo',function () {
        $this=$(this);
        var oid=$this.data('oid');
        var fid=$this.data('fid');
        $.post("<%=path%>/admin/cooker/orderStatus",{"oid":oid,"fid":fid},function (data) {
            window.location.href="<%=path%>/admin/cooker/list";
        })
    })

})
function getOrder($object) {
    var id=$object.data("id");
    alert(id);
    $.post("",{"id":id},function (data) {

    })

}
