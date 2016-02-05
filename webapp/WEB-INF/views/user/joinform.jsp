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
	height: 500px;
	margin: 0 auto;
	border: 10px solid #cccccc;
	border-radius: 10px;
	text-align: center;
	line-height: 50px;
}

h1 {
	font-size: 45px;
}
</style>
</head>
<body>

	<div id="container">
		<h1>회원가입</h1>
		<hr />
		<hr />
		<form method="post" action="/board/user" id="join-form" name="joinForm">
		<input type="hidden" name="a" value="join">
			ID :<input type="text" name="ID"><br> Password:<input
				type="password" name="PW"><br> EMAIL :<input
				type="text" name="EMAIL"><br> PHONE :<input type="text"
				name="PHONE"><br> AGE :<input type="text" name="AGE"
				maxlength="3"><br> <!--  Picture : <input type="file"
				name="picture"><br />-->
			<hr />
			<input type="submit" value="가입하기.">
		</form>
	</div>
</body>
</html>