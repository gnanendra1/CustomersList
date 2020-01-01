<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
td {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
  background-color: Lime;
}
tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<table>
<tr>
	<th>CID</th>
    <th>CNAME</th>
    <th>EMAIL</th>
    <th>ADDRESS</th>
    <th>UPDATE</th>
    <th>DELETE</th>
</tr>
<c:forEach var="cust" items="${customer}">
	<c:url var="updateLink" value="/showFormForUpdate">
	<c:param name="customerId" value="${cust.cId}" />
	</c:url>
	<c:url var="removeLink" value="/showFormForRemove">
	<c:param name="customerId" value="${cust.cId}" />
	</c:url>
	
	<tr>
		<td>${cust.cId}</td>
		<td>${cust.cName}</td>
		<td>${cust.cEmail}</td>
		<td>${cust.cAddress}</td>
		<td><a href="${updateLink}">Update</a></td>
		<td><a href="${removeLink}">Delete</a></td>
	</tr>
	
</c:forEach>
</table>
</body>
</html>