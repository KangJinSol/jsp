<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보를 입력</title>
<!-- 238p -->
</head>
<body>
	<h2>정보를 입력하세요.</h2>
	
	<form method="get" action="ex7_03Pro.jsp">
		학번 : <input type="text" name="hak"><br>
		이름 : <input type="text" name="name" ><br>
		전공 : <select name="major">
			  <option value="0" selected>=선택하세요=</option>
			  <option value="컴퓨터공학" selected>컴퓨터공학</option>
			  <option value="전자공학" selected>=전자공학=</option>
			  <option value="기계공학" selected>=기계공학=</option>
			  </select>
	</form>
</body>
</html>