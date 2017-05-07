<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="order" uri="http://myOrderEL.com" %>
<div class="food-list">
    <c:forEach items="${typeList}" var="type">
        <c:if test="${food:foodFunc(type.type).size()!=0}">
            <div class="list-row">
                <span class="food-type">${type.type}</span>
                <c:forEach items="${food:foodFunc(type.type)}" var="li">
                    <div class="row">
                        <div class="image">
                            <img src="${url}${li.imageName}">
                        </div>
                        <div class="fname">
                            <span title="${li.name}">${li.name}</span>
                        </div>
                        <div class="sold">
                            <div class="sold-count">已售${order:orderFunc(li.id)}份</div>
                            <div class="sold-desc">
                                <a class="food-praise" style="text-decoration: none" href="javascript:void(0);" data-id="${li.id}">
                                      <span class="glyphicon glyphicon-thumbs-up"></span>
                                </a>(<span class="praise${li.id}">${food:foodP(li.id)}</span>)
                            </div>
                        </div>
                        <div class="addli">
                            <div class="addli-money">￥${li.price}/份</div>
                            <div class="addli-add" data-title="${li.name}" data-price="${li.price}" data-id="${li.id}">
                                <a class="addorder" href="javascript:void(0);">添加</a></div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </c:if>
    </c:forEach>
</div>