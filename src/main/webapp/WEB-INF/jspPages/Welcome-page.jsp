<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<title></title>
</head>
<body>
<div>
<h2 align="center">${myWebsiteTitle}</h2>
<hr>
<div align="center">
<form action="processOrder">
<label for ="item_name">Item name:</label>
<input id="item_name" type="text" name="foodType" placeholder="food type?"/>
<input type="submit" value ="oder now"/>
</form>
</div>

</div>
</body>
</html>
