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
#container {
	width: 800px;
	border: 1px solid #cccccc;
	border-radius: 15px;
	margin: 0 auto;
}

.tbl-ex {
	width: 100%;
	margin: 10px auto;
	border-collapse: collapse;
	border-bottom: 2px solid #333;
}

.tbl-ex th, .tbl-ex td {
	padding: 8px;
	text-align: center;
}

.tbl-ex th {
	border-top: 2px solid #333;
	border-bottom: 2px solid #333;
	background-color: #999;
	font-size: 1.1em;
	color: #fff
}

.tbl-ex td {
	border-top: 1px dotted #333;
	border-bottom: 1px dotted #333;
}

.tbl-ex td.title {
	text-align: left;
}
a {
	text-decoration: none;
}

</style>


</head>
<body>
	<div id="container">
		<table class="tbl-ex">
			<tr>
				<th colspan="2">글보기</th>
			</tr>
			<tr>
				<td class="label">제목</td>
				<td>${board.title}</td>
			</tr>
			<tr>
				<td class="label">내용</td>
				<td>
					<div class="view-content">
						${board.content }
					</div>
				</td>
			</tr>
		</table>
		<div class="bottom">
			<a href="/board/free?a=freelist">글목록</a>
			<a href="/board/free?a=modify&no=${board.board_seq}">글수정</a>
			<c:if test="${authUser.id == board.id }">
				<a href="/board/free?a=delete&no=${board.board_seq}">글 삭제</a>
			</c:if>			
		</div>
	</div>
</body>
</html>