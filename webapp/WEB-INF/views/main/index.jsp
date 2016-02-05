<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board</title>
<style type="text/css">
#container {
	width: 800px;
	height: 800px;
	margin: 0 auto;
	border: 1px solid #cccccc;
	padding: 10px;
	box-sizing: border-box;
	overflow: hidden;
}

img {
	width: 500px;
	height: 300px;
	margin: 0 auto;
	border-radius: 30px 30px 30px 30px;
}

#container p:nth-child(1) {
	text-align: center;
	height: 100px;
	line-height: 100px;
	text-decoration: underline;
}

#container p:nth-child(2) {
	text-align: left;
}

#container #from {
	font-size: 20px;
	text-align: right;
}
#content{
	width:600px;
	height:600px;
	float:left;
}
#navigation{
	width:150px;
	margin:0px 5px 5px 5px;
	height:500px;
	float:left;
}
</style>
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp"></jsp:include>
		<div id="content">
			<p>환영합니다. BIT ACADEMY</p>
			<img src="/board/assets/images/main.jpg" />
			<p>To. all member</p>
			<p>Web Programming JSP&SERVLET HTML5 CSS3 Study very fun, and
				Have a good Day</p>
			<p id="from">From. Administrator</p>
		</div>
		<div id="navigation">
			<jsp:include page="/WEB-INF/views/include/navigation.jsp"></jsp:include>
			</div>
		<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
	</div>
</body>
</html>