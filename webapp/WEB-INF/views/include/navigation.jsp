<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<style>
	.nav-div{
		float:left;
		width:150px;
	}
		ul li{
			list-style:none;
			font-size:15px;
			text-align:left;
		}
		h2{
			text-align:right;
		}
		a{
			color:black;
		}
		
	</style>
</head>
<body>
	<div class="nav-div">
		<h2>게시판</h2>
		<ul>
			<li><a href="/board/anony?a=anonylist">익명게시판</a></li>
			<li><a href="/board/free?a=freelist">자유게시판</a></li>
			<li><a href="/board/noti?a=notilist">공지게시판</a></li>
		</ul>
	</div>
</body>
</html>