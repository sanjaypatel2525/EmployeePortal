<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Employee Form</title>
    <%@ include file="./common/head.jsp" %>
    </head>
    <body>
    <%@ include file="./common/header.jsp" %>
     	Employee Form 
     	<form method="post" action="saveEmployee">
     		Name : <input type="text" name="name"/> 
     		<input type="submit" value="save"/> 
     	</form>
    </body>
</html>