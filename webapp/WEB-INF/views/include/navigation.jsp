<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    
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
			text-decoration: none;
			
		}
	</style>
	<script type="text/javascript">
		var emptys = document.getElementsByClassName("empty");
		var elems =  document.getElementsByClassName("time");
		for(var i = 0; i < emptys.length; i++)
		{
			emptys[i].onclick=function(){alert("1234");};
		}
		function empty(){
			confirm("로그인 후 이용해주시기 바랍니다.");
			
		}
		
		
	</script>
</head>
<body>
	<div class="nav-div">
		<h2>게시판</h2>
		<ul>
			<c:choose>
				<c:when test="${empty authUser }">
					<li><a href="#" onclick="empty();">익명게시판</a></li>
					<li><a href="#" onclick="empty();">자유게시판</a></li>
					<li><a href="#" onclick="empty();">공지게시판</a></li>
					
				</c:when>
				<c:otherwise>
					<li><a href="/board/anony?a=anonylist">익명게시판</a></li>
					<li><a href="/board/free?a=freelist">자유게시판</a></li>
					<li><a href="/board/noti?a=notilist">공지게시판</a></li>
				</c:otherwise>
			</c:choose>		
		</ul>
	</div>
</body>
</html>