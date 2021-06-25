<jsp:useBean id="img" scope="request" type="java.lang.String"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Menu</title>
</head>
<body>

<div id="menus">
    ${check}
</div>

<img src="${img}" alt="음식점 사진">

</body>
</html>