<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.container{
	width:600px;
	margin:0px auto;
	padding-top:30px;
	box-sizing: border-box;
}
#menu_bar{
	width:600px;
	box-sizing: border-box;
	text-align: center;
}
#menu_bar > input{
	width:200px;
	padding:5px;
	margin-right:5px;
}
#menu_bar > button{
	width:100px;
	padding:5px;
}
table{
	width:600px;
	border-collapse: collapse;
}
td{
	width:230px;
	text-align: center;
	padding:10px;
	box-sizing: border-box;
}
</style>
<script src="/lib/jquery-3.5.1.min.js"></script>
<script>
	location.href="main.do";
	
	$(function() {
		$("#btn_submit").click(function(e) {
			var data = $("#search").serialize();
			$.ajax({
				url : "studentSearch.do",
				data : data,
				method : 'get',
				dataType:'json',
				success : function(d){
					console.log(d);
					var arr = d.result;
					console.log(arr);
					var result = "<table>";
					for(i=0;i<arr.lenth;i++){
						result +=
							"<tr><td>"+arr[i].sno+"</td>"
							+"<td>"+arr[i].name+"</td>"
							+"<td>"+arr[i].major+"</td>"
							+"<td>"+arr[i].score+"</td></tr>";
					}
					arr += "</table>";
					$("#content_area").html(result);
				}
			});
		});
	});
}
</script>
</head>
<body>
<div id="container">
	<div id="menu_bar">
		<form id="search">
			<select name="kind">
				<option value="sno">학번</option>
				<option value="name">이름</option>
				<option value="major">학과</option>
			</select>
			<input type="text" name="search">
			<button id="btn_submit">검색</button><button>리셋</button>
		</form>
	</div>
	<hr>
	<div id="content_area">
		<table>
			<c:forEach var="student" items="${requestScope.list }">
				<tr>
					<td>${student.sno }</td>
					<td>${student.name }</td>
					<td>${student.major }</td>
					<td>${student.score }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
</body>
</html>