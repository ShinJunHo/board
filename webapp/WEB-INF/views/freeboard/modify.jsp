<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</style>


</head>
<body>
	<div id="container">
		<form method="post" action="/board/free">
			<input type="hidden" name="a" value="update">
			<input type="hidden" name="id" value="${authUser.id}">
			<input type="hidden" name="no" value="${board.board_seq }">
		<table class="tbl-ex">
			<tr>
				<th colspan="2">글수정</th>
			</tr>
			<tr>
				<td class="label">제목</td>
				<td><input type="text" name="title" value="${board.title}"></td>
			</tr>
			<tr>
				<td class="label">내용</td>
				<td>
					<div class="view-content">
						<textarea rows="10" cols="50" id="content" name="content">
						${board.content }
						</textarea>
					</div>
				</td>
			</tr>
		</table>
		<div class="bottom">
			<a href="/board/free?a=freelist">글목록</a>
			<input type="submit" value="수정">
		</div>
		</form>
	</div>
</body>
</html>