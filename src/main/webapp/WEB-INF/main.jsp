<!doctype html>
<html lang="en" class="h-100">
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" %>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Random-Lunch</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/cover.css">
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=${apiKey}&libraries=services"></script>
</head>
<body class="d-flex h-100 text-center text-white bg-dark">
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
<header class="mb-auto">
    <jsp:include page="layout/header.jsp"/>
</header>

<main class="px-3">
    <jsp:include page="${content}"/>
</main>

<footer class="mt-auto text-white-50">
    <jsp:include page="layout/footer.jsp"/>
</footer>
</div>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</body>
</html>