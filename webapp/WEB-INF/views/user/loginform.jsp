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
}

#content {
	text-align: center;
	height: 100px;
	line-height: 100px;
}

label {
	font-size: 20px;
	font-weight: bold;
	margin-right:30px;
}

.btn1 {
	background-color: cadetblue;
}
</style>
<script type="text/javascript">
	function cancel(){
		window.location.href='/board/main';
	}
</script>
</head>
<body>
	<div id="container">
		<div id="content">
			<form id="login-form" name="loginform" method="post" action="/board/user?a=login">
				<label>ID:</label><input type="text" id="loginID" name="loginID" /><br />
				<label>PASSWORD:</label><input type="password" id="loginPW"
					name="loginPW" /> <br /> <input class="btn1" type="submit"
					value="로그인." />
					<input class="btn1" type="button" value="취소" onclick="cancel()">

			</form>



		</div>


	</div>

</body>
</html>