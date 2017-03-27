<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                            <div class="sold-count">月售49分</div>
                            <div class="sold-desc">赞</div>
                        </div>
                        <div class="addli">
                            <div class="addli-money">${li.price}</div>
                            <div class="addli-add" data-title="${li.name}" data-price="${li.price}" data-id="${li.id}">
                                <a
                                        class="addorder" href="#">添加</a></div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </c:if>
    </c:forEach>
</div>