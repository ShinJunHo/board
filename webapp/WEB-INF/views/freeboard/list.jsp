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
.list-container{
width:800px;
margin: 20px auto;
overflow:hidden;
}

#board {
	
	width: 550px;
	float:left;
}

#search_form {
	width: 100%;
	margin: 50px auto 20px auto;
	text-align: center;
}

input[type="text"] {
	padding: 5px;
	border: 1px solid #aaa
}

input[type="submit"] {
	padding: 5px;
	border: 1px solid #aaa;
	background-color: #aaa;
	font-weight: bold;
	color: #fff;
}

.tbl-ex {
	width: 100%;
	margin: 10px auto;
	border-collapse: collapse;
	border-bottom: 2px solid #333;
}

a.del {
	display: block;
	width: 20px;
	height: 20px;
	font-size: 0;
}
#bottom-a{
	display:inline-block;
	width:50px;
	text-align:right;
}
</style>

</head>
<body>
	<div>
		<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
		<div class="list-container">
			<div id="board">
				<form id="search_form">
					<input type="text" id="kwd" name="kwd" value=""> <input
						type="submit" value="찾기">
				</form>
				<table class="tbl-ex">
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>작성일</th>
						<th>&nbsp;</th>

					</tr>
					<c:set var="count" value="${fn:length(list) }"/>
					<c:forEach items="${list }" var="vo" varStatus="status">
					<tr>
						<td>${count - status.index }</td>
						<td><a href="/board/free?a=view&no=${vo.board_seq}">${vo.title }</a></td>
						<td>${vo.id }</td>
						<td>3</td>
						<td>${vo.modi_date }</td>
						<td><a href="" class="del">삭제</a></td>
					</tr>
					</c:forEach>
				</table>
					<div class="bottom">
						<a id="bottom-a" href="/board/free?a=write" id="new-book">글쓰기</a>
					</div>
			</div>
					<jsp:include page="/WEB-INF/views/include/navigation.jsp"></jsp:include>
		
		</div>
		
		<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
		
	</div>
</body>
</html>