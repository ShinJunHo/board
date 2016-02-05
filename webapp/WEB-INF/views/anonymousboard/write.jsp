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
		<form method="post" action="/board/anony">
		<input type="hidden" name="a" value="insert">
		<input type="hidden" name="boardname" value="Anony">
		
		<table class="tbl-ex">
			<tr>
				<th colspan="2">글쓰기</th>
			</tr>
			<tr>
				<td class="label">제목</td>
				<td><input type="text" name="title" value=""></td>
			</tr>
			<tr>
				<td class="label">내용</td>
				<td>
					<div class="view-content">
						<textarea id="content" name="content" rows="10" cols="50"></textarea>
					</div>
				</td>
			</tr>
		</table>
		
		<div class="bottom" >
			<input type="submit" value="등록">
			<a href="/board/anony?a=anonylist">취소</a>
		</div>
		</form>
	</div>
</body>
</html>