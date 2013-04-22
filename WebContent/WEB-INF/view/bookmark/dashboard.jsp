<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ page import="org.plab.vo.UserVO" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Bookmarker</title>

    <!-- Le styles -->
    <link href="/resources/css/bootstrap.css" rel="stylesheet"/>
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
<script>
	console.log(location.pathname);
</script>
<%
	UserVO currentUser = (UserVO)request.getSession().getAttribute("currentUser");
%>
<div class="container-narrow">

    <div class="masthead">
        <ul class="nav nav-pills pull-right">
            <li>
                <form class="form-search">
                    <div class="input-append">
                        <input type="text" class="search-query">
                        <button type="submit" class="btn">검색</button>
                    </div>
                </form>
            </li>
            <li><a href="form.html" class="btn add-link">북마크 추가</a></li>
            <li>
                <div class="btn-group">
                    <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="icon-user"></i> <%= currentUser.getName() %>
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="profile-edit.html"><i class="icon-pencil"></i> Edit</a></li>
                        <li class="divider"></li>
                        <li><a href="/logout"><i class="icon-off"></i> Sign out</a></li>
                    </ul>
                </div>
            </li>
        </ul>
        <h3 class="muted"><a href="dashboard.html">Bookmarker</a></h3>
    </div>

    <hr/>

    <div class="row-fluid">
        <div class="span9">
            <blockquote>
                <p>Bookmark List</p>
            </blockquote>
            <table class="table bookmarkList">
            <colgroup>
                <col/>
                <col style="width: 80px;">
            </colgroup>
            <tbody>
            <tr>
                <td>
                    <h4>북마크명</h4>
                    <p><a href="#">springframework.org</a></p>
                    <i class="icon-tags"></i> Java, Framework
                </td>
                <td>
                    <a class="btn btn-small" href="form.html">Edit</a><br/>
                    <i class="icon-eye-close"></i> private
                </td>
            </tr>
            <tr>
                <td>
                    <h4>북마크명</h4>
                    <p><a href="#">www.scala-lang.org</a></p>
                    <i class="icon-tags"></i> Scala
                </td>
                <td><a class="btn btn-small" href="form.html">Edit</a><br/></td>
            </tr>
            <tr>
                <td>
                    <h4>북마크명</h4>
                    <p><a href="#">www.python.org</a></p>
                    <i class="icon-tags"></i> Python
                </td>
                <td><a class="btn btn-small" href="form.html">Edit</a><br/></td>
            </tr>
            <tr>
                <td>
                    <h4>북마크명</h4>
                    <p><a href="#">www.java.com/ko</a></p>
                    <i class="icon-tags"></i> Java
                </td>
                <td>
                    <a class="btn btn-small" href="form.html">Edit</a><br/>
                    <i class="icon-eye-close"></i> private
                </td>
            </tr>
            </tbody>
            </table>
        </div>
        <div class="span3">
            <blockquote>
                <p>Tags</p>
            </blockquote>
            <ul>
                <li><a href="#">Java 34</a></li>
                <li><a href="#">Python 14</a></li>
                <li><a href="#">Scala 4</a></li>
                <li><a href="#">Javascript 21</a></li>
                <li><a href="#">Groovy 2</a></li>
                <li><a href="#">Ruby 1</a></li>
                <li><a href="#">Framework 12</a></li>
            </ul>
        </div>
    </div>

    <hr/>

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