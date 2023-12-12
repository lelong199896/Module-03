<%--
  Created by IntelliJ IDEA.
  User: long
  Date: 12/11/2023
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
    <h1>Product details</h1>
    <table>
        <tr>
            <td>Name: </td>
            <td>${requestScope["product"].getName()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${requestScope["product"].getPrice()}</td>
        </tr>
        <tr>
            <td>Color: </td>
            <td>${requestScope["product"].getColor()}</td>
        </tr>
    </table>
<p>
    <a href="/products">Back to product list</a>
</p>
</body>
</html>
