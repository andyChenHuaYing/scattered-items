<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 11/18/2014
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h2>MethodParamTypeController Form</h2>
<form action="methodParamType/modelParam" method="post">
  userName: <input type="text" name="userName" id="userName" title="userName"/><br/>
  password: <input type="password" name="password" id="password" title="password"/><br/>
  <input type="submit" value="submit"/>
</form>
<br/>
<h2>ModelAttributeAnnotationController Form</h2>
<form action="modelAttribute/methodParamModelAttribute" method="post">
  userName: <input type="text" name="userName" title="userName"/><br/>
  password: <input type="password" name="password" title="password"/><br/>
  schoolModel:<input type="text" name="schoolModel.schoolName" title="school name"/><br/>
  <input type="submit" value="submit"/>
</form>
</body>
</html>
