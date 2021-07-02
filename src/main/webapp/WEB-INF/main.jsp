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
    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=d68a224907e407957cb019b00426ce82&libraries=services"></script>
    <script>
        Kakao.init('d68a224907e407957cb019b00426ce82');
        console.log(Kakao.isInitialized());
    </script>
</head>
<body class="d-flex h-100 text-center text-white bg-dark">
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
    <div>
        <h3 class="float-md-start mb-0">Random-Lunch</h3>
        <nav class="nav nav-masthead justify-content-center float-md-end">
            <a class="nav-link active" aria-current="page" href="#">Main</a>
            <a class="nav-link" href="#">Service</a>
            <a class="nav-link" href="#">Contact</a>
        </nav>
    </div>

    <main class="px-3">
        <jsp:include page="${content}"/>
    </main>

    <p>
        blahblahblah
    </p>
</div>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</body>
</html>