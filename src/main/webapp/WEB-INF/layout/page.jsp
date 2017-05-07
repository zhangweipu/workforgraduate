<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page session="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    aa
    <t:insertAttribute name="header"/>
</div>
<div>
    <t:insertAttribute name="footer"/>
</div>
<div>
    <t:insertAttribute name="body"/>
</div>
</body>
</html>
