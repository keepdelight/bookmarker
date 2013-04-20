<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Bookmarker</title>

    <!-- Le styles -->
    <link href="../resources/css/bootstrap.css" rel="stylesheet"/>
    <link href="../resources/css/bookmarker.css" rel="stylesheet"/>
    <link href="../resources/css/bootstrap-responsive.css" rel="stylesheet"/>

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="./resources/js/html5shiv.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="../resources/ico/favicon.png">
</head>
<body>
<div class="container-narrow">

    <div class="masthead">
        <form class="navbar-form pull-right">
            <input class="span2" type="text" placeholder="email@bookmarker.io"/>
            <input class="span2" type="password" placeholder="password"/>
            <button type="submit" class="btn btn-primary btnSign-in" style="">Sign in</button>
        </form>
        <h3 class="muted"><a href="bookmarker.html">Bookmarker</a></h3>
    </div>

    <hr>

    <div class="jumbotron">
        <h3>Create your free personal account</h3>
        <form class="form-signin" action="/user/sign_up" method="post">
            <input name="email" type="text" class="input-block-level" placeholder="Email Address"/>
            <input name="password" type="password" class="input-block-level" placeholder="Password"/>
            <input name="cpassword" type="password" class="input-block-level" placeholder="Confirm Password"/>
            <input name="username" type="text" class="input-block-level" placeholder="Username"/>
            <button class="btn btn-large btn-success pull-right" type="submit">Create an account</button>
        </form>
    </div>

    <hr>

    <div class="row-fluid marketing">
        <div class="span6">
            <h4>마음에 드는 사이트 기록하기</h4>
            <p>마음에 드는 사이트를 찾으셨다면, Bookmarker에 등록해두세요.</p>
            <h4>내가 찾는 북마크를 검색</h4>
            <p>공개된 북마크를 검색해서 찾아 볼 수 있습니다.</p>
        </div>
        <div class="span6">
            <h4>태그로 북마크 관리</h4>
            <p>주제별로 태그를 달아 분류함으로써 원하는 북마크 목록을 쉽게 관리하세요.</p>
            <h4>어디서나 간편하게 북마크 확인</h4>
            <p>인터넷이 연결된 PC 또는 모바일이라면 어디서나 북마크를 확인 할 수 있습니다.</p>
        </div>
    </div>

    <hr>

    <div class="footer">
        <p>&copy; Bookmarker 2013</p>
    </div>
</div>
<!-- /container -->

<!-- Le javascript ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="../resources/js/jquery-1.9.1.min.js"></script>
<script src="../resources/js/bootstrap.min.js"></script>
</body>
</html>