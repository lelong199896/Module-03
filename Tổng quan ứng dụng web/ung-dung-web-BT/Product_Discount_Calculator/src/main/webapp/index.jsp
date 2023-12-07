<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <h1>Product Discount Calculator</h1>
    <form action="${pageContext.request.contextPath}/Calculator" method="post">
        <input type="text" name="Description" placeholder="Product Description: ">
        <input type="number" name="Price" placeholder="List Price: ">
        <input type="number" name="DiscountPercent" placeholder="Discount Percent: ">
        <input type="submit" id="submit" value="Calculate Discount">
    </form>
</body>
</html>