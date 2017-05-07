<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>defaultLayout</title>
</head>
<body>
   <header id="header">
       <t:insertAttribute name="header"/>
   </header>
   <section id="sidemenu">
       <t:insertAttribute name="menu"/>
   </section>
   <section id="site-content">
       <t:insertAttribute name="body"/>
   </section>
   <footer id="footer">
       <t:insertAttribute name="footer"/>
   </footer>
</body>
</html>
