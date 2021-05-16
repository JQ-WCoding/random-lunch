<!doctype html>
<html lang="en" class="h-100">
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8"%>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--<meta name="viewport"-->
    <!--      content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">-->
    <!--<meta http-equiv="X-UA-Compatible" content="ie=edge">-->
    <title>Random-Lunch</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <!--integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>-->
    <!--<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"-->
    <!--        integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"-->
    <!--        crossorigin="anonymous"></script>-->
    <!--<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"-->
    <!--        integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"-->
    <!--        crossorigin="anonymous"></script>-->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/cover.css">
    <link rel="stylesheet" href="js/index.js">
</head>
<body class="d-flex h-100 text-center text-white bg-dark">

<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
    <header class="mb-auto">
        <div>
            <h3 class="float-md-start mb-0">Random-Lunch</h3>
            <nav class="nav nav-masthead justify-content-center float-md-end">
                <a class="nav-link active" aria-current="page" href="#">Main</a>
                <a class="nav-link" href="#">Service</a>
                <a class="nav-link" href="#">Contact</a>
            </nav>
        </div>
    </header>

    <main class="px-3">
        <h1>Random-Lunch</h1>
        <p class="lead">
            아무거나 먹고 싶은게 없을때 골라서 먹을 수 있도록 선택을 도와주는 서비스로 일단 사용할거 같은 우리의 프로젝트이자 아니자 뭐 그런건데 말을 엄청 길게 적어야 대충 얼마나 쓰이지 감이 와서
            하루종일 적고 있으니까 힘드네ㅎㅎ
        </p>
        <p class="lead">
            <%--위치 임의 지정--%>
            <a href="/menu" class="btn btn-lg btn-secondary fw-bold border-white bg-white text-black-50" id="start">Start</a>
        </p>
    </main>

    <footer class="mt-auto text-white-50">
        <p>
            blahblahblah
        </p>
    </footer>
</div>

<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>