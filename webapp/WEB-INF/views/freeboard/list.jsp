<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<th>글쓴이</th>
						<th>조회수</th>
						<th>작성일</th>
						<th>&nbsp;</th>

					</tr>
					<tr>
						<td>3</td>
						<td><a href="/mysite/board?a=view">세 번째 글입니다.</a></td>
						<td>둘리</td>
						<td>3</td>
						<td>2016-02-01 00:00:00</td>
						<td><a href="" class="del">삭제</a></td>
					</tr>
					<tr>
						<td>2</td>
						<td><a href="/mysite/board?a=view">두 번째 글입니다.</a></td>
						<td>둘리</td>
						<td>3</td>
						<td>2016-02-01 00:00:00</td>
						<td><a href="" class="del">삭제</a></td>
					</tr>
					<tr>
						<td>1</td>
						<td><a href="/mysite/board?a=view">첫 번째 글입니다.</a></td>
						<td>둘리</td>
						<td>3</td>
						<td>2016-02-01 00:00:00</td>
						<td><a href="" class="del">삭제</a></td>
					</tr>
					
				</table>
					<div class="bottom">
						<a id="bottom-a" href="/mysite/board?a=write" id="new-book">글쓰기</a>
					</div>
			</div>
					<jsp:include page="/WEB-INF/views/include/navigation.jsp"></jsp:include>
		
		</div>
		
		<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
		
	</div>
</body>
</html>