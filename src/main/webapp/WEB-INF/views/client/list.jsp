<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<div class="row">
    <c:forEach items="${foodList}" var="li">
        <li class="fl rest-li">    <div class="j-rest-outer rest-outer transition hover">
            <div data-title="${li.name}" data-price="${li.price}" data-poiid="${li.id}" class="restaurant" data-all="1" data-invoice="1" data-minpricelevel="5">
                <a class="rest-atag" href="" target="_blank">
                    <div class="top-content">
                        <div class="preview">
                            <img data-rid="" data-index="1" class="scroll-loading" src="${url}${li.imageName}" data-src="" data-max-width="208" data-max-height="156">
                            <div class="rest-tags">
                            </div>
                        </div>
                        <div class="content">
                            <div class="name">
                <span title="${li.name}">
                        ${li.name}
                </span>
                            </div>
                            <div class="rank clearfix">
                  <span class="star-ranking fl">
                    <span class="star-score" style="width: 67px"></span>
                  </span>
                                <span class="score-num fl">4.6分</span>
                            </div>
                            <div class="price">
                                <span class="start-price">起送:${li.price}</span>
                                <span class="send-price">
                  配送费:￥5
                </span>
                                <span class="send-time"><i class="icon i-poi-timer"></i>
                      45分钟
                </span>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>
                </a>
                <a href="javascript:void(0);" class="addorder" data-poiid="" title="">
                    添加
                </a>
            </div>
        </div>
        </li>
    </c:forEach>
</div>
<script src="/static/js/client.js"></script>
