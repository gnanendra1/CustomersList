<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="updateCustomer" modelAttribute="customer" method="POST">

<table>
<form:hidden path="cId"/>
<tr><td><label>Enter Name    :</label><form:input path="cName"/></td></tr>
<tr><td><label>Enter Email   :</label><form:input path="cEmail"/></td></tr>
<tr><td><label>Enter Address:</label><form:input path="cAddress"/></td></tr>
<tr><td><input type="submit" value="Update"></td></tr>
</table>
</form:form>
</body>
</html>