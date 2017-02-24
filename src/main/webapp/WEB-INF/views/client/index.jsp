<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>你好</title>

    <script src="/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <link rel="shortcut icon" href="/static/images/bushuohua.ico" type="image/x-icon"/>
    <script src="/static/js/client.js"></script>
</head>
<body>
<div class="container">
    <c:forEach begin="1" end="10" var="tab" varStatus="ta">
        <div>
            <a href="/client/list?tab=${ta.index}">${ta.index}号桌</a>
        </div>
    </c:forEach>
</div>
</body>
</html>
