<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Errors</title>
</head>
<body>
<form:form commandName="userModel">
    <form:errors path="*" cssStyle="color:red"/>
</form:form>
</body>
</html>
