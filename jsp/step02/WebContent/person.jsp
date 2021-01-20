<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 
	실행은 person.jsp
	person.jsp : 데이터 입력을 받아서 전송 -> html로 해도 무방
	person_process.jsp가 받아서 처리
	person_result.jsp에서 결과를 받아서 화면에 출력
 -->
</head>
<body>
<!-- 이름, 나이 입력 받는 폼 -->
<form action="person_process.jsp">
	이름 : <input type="text" name="name"><br>
	나이 : <input type="text" name="age"><br>
	<button>전송</button>
</form>
</body>
</html>