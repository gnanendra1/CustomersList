<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Customer Management System</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: Gray;
  padding: 1px;
  text-align: center;
  font-size: 25px;
  color: white;
}
table.center {
    margin-left:auto; 
    margin-right:auto;
  }

/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 30%;
  height: 300px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */

section:after {
  content: "";
  display: table;
  clear: both;
}
/* Style the footer */
footer {
  background-color: #777;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
</style>
</head>
<body>
<header>
  <h2>Customer Registration Form</h2>
</header>
<section>
  <nav>
    <ul>
      <li><a href="/CustomerList/getAll">List Of Customers</a></li>
      <li><a href="/CustomerList/getAll">Customers update info</a></li>
      <li><a href="/CustomerList/getAll">Remove Customers</a></li>
    </ul>
  </nav>
  <article>
<form:form action="addcustomer" modelAttribute="customer">
<table>
<tr><td><label>Enter Name    :</label><form:input path="cName"/></td></tr>
<tr><td><label>Enter Email   :</label><form:input path="cEmail"/></td></tr>
<tr><td><label>Enter Address:</label><form:input path="cAddress"/></td></tr>
<tr><td><input type="submit" value="Add Customer"></td></tr>
</table>
</form:form>
  </article>
</section>
<footer>
  <p>Copyright © 2019 MGR Company&Co, All Rights Reserved.</p>
</footer>
</body>
</html>
    