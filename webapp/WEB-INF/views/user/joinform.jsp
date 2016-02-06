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
<script type="text/javascript">

	function calcel(){
		
		window.location.href='/board/main';
		
	}
	
	
	/*
	var cancel = document.getElementById("cancel");
	cancel.onclick=function(){
		
	};*/
		


	function join(){
		 var id = document.getElementById("UID");
         var pw1 = document.getElementById("UPW");
         var email = document.getElementById("UEMAIL");

         var idReg = new RegExp("^[a-z0-9]{4,10}");
         var pwReg = new RegExp("^[a-z0-9]{6,20}");
         var mailReg = new RegExp("^[a-z0-9_-]{3,10}@[a-z]{3,10}[/.]?[a-z]{0,3}$");

         var idOk = idReg.test(id.value);
         if (idOk) {
             
         } else {
             alert("아이디 잘못 4자리 이상 10자리 이하 영소문자 숫자 조합");
        	 return false;
         }

         var pwOk = pwReg.test(pw1.value);
         if (pwOk) {

         } else {
             alert("비밀번호 잘못 6자리 이상 20자리 이하 영소문자 숫자 조합");
        	 return false;
         }


         var emailOk = mailReg.test(email.value);
         if (emailOk) {

         } else {
             alert("이메일 잘못");
        	 return false;
         }
	}

</script>
</head>
<body>

	<div id="container">
		<h1>회원가입</h1>
		<hr />
		<hr />
		<form method="post" action="/board/user" id="join-form" name="joinForm">
		<input type="hidden" name="a" value="join">
			ID :<input type="text" id="UID" name="ID"><br> Password:<input
				type="password" id="UPW" name="PW"><br> EMAIL :<input
				type="text" id="UEMAIL" name="EMAIL"><br> PHONE :<input type="text"
				name="PHONE"><br> AGE :<input type="text" name="AGE"
				maxlength="3"><br> <!--  Picture : <input type="file"
				name="picture"><br />-->
			<hr />
			<input type="submit" value="가입하기." onclick="return join()">
			<input id="cancel" type="button" value="취소" onclick="calcel()">
		</form>
	</div>
</body>
</html>