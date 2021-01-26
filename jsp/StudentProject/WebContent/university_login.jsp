<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">
	*{
		margin: 0;
		padding: 0;
	}
</style>
</head>
<body>
	<div class="container">
		<h3>xx대학 학적관리프로그램</h3>
		<h3>허가된 교직원만 접근할수 있습니다</h3>
		<form method="post" action="login.do">
			<input type="text" name="id" id="id" placeholder="아이디를 입력하세요"><br> 
			<input type="password" name="pass" id="sabun" placeholder="암호를 입력하세요"><br>
			<p><button type="submit">로그인</button></p>
		</form>
	</div>
		
</body>
</html>




