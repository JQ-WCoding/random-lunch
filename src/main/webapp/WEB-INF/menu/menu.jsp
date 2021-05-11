<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>Simple Sidebar - Start Bootstrap Template</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico"/>
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/styles.css" rel="stylesheet"/>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
</head>
<body>
<div class="bg-dark border-dark">
    <p class="text-white text-center">검색창 만들 곳? 아래가 더 좋을까?</p>
</div>
<div class="d-flex" id="wrapper">
    <!-- Sidebar-->
    <div class="bg-light border-right" id="sidebar-wrapper">
        <div class="sidebar-heading text-center">뭐먹?</div>
        <div class="list-group list-group-flush">
            <a class="list-group-item list-group-item-action bg-light" href="#!">Menu</a>
            <a class="list-group-item list-group-item-action bg-light" href="#!">Service</a>
            <a class="list-group-item list-group-item-action bg-light" href="#!">Contact</a>
        </div>
    </div>
    <!-- Page Content-->
    <div id="page-content-wrapper">
        <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
            <button class="btn btn-primary" id="menu-toggle">메뉴버튼 css 수정하기 색이 너무 별로</button>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span
                    class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                    <li class="nav-item active">
                        <a class="nav-link" href="#!">
                            Home
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="#!">Link</a></li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#!" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#!">Action</a>
                            <a class="dropdown-item" href="#!">Another action</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#!">Something else here</a>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container-fluid">
            <h1 class="mt-4">메뉴고르기 검색결과</h1>
            <p>하단 부분에 검색 결과가 리스트 형식으로 나오도록 설정 <br>
                배경화면 : 흰색 배경으로 유지
            </p>
            <%--<p>The starting state of the menu will appear collapsed on smaller screens, and will appear non-collapsed on--%>
            <%--    larger screens. When toggled using the button below, the menu will change.</p>--%>
            <%--<p>--%>
            <%--    Make sure to keep all page content within the--%>
            <%--    <code>#page-content-wrapper</code>--%>
            <%--    . The top navbar is optional, and just for demonstration. Just create an element with the--%>
            <%--    <code>#menu-toggle</code>--%>
            <%--    ID which will toggle the menu when clicked.--%>
            <%--</p>--%>
        </div>
    </div>
</div>
<!-- Bootstrap core JS-->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="js/scripts.js"></script>
</body>
</html>
