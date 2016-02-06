
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.bit.board.vo.UserVo" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#header{
	width:800px;
	margin: 20px auto;
	overflow: hidden;
}
h1{
	text-align:center;
}
ul li {
	float: right;
	list-style: none;
	margin: 10px;
}

a {
	text-decoration: none;
}
#header > a{
	font-weight:bold;
	font-size:30px;
	margin: 0 auto;
}
</style>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div id="header">
	<a id="home" href="/board/main">Bit Academy Board</a>
	
		<ul>
		<c:choose>
			<c:when test="${empty authUser }">
				<li><a href="/board/user?a=loginform">로그인</a></li>
			<li><a href="/board/user?a=joinform">회원가입</a></li>
			</c:when>
			
			<c:otherwise>
			<li><a href="#">회원정보 수정</a></li>
			<li><a href="/board/user?a=logout">로그아웃</a></li>
			</c:otherwise>
		</c:choose>
				
		</ul>
	</div>
</body>
</html>