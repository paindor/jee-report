<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>성적표</title>
</head>
<body>
<form id = "report" action="<%=request.getContextPath() %>/report.do">
	이름<input type="text"name = "name" /> <br />
	주민번호<input type="text"name = "ssn" /> <br />
	국어<input type="text"name = "kor" /> <br />
	영어<input type="text"name = "eng"/> <br />
	수학<input type="text"name = "math" /> <br />
	사회<input type="text"name = "sciety"/> <br />
	<input type="submit" value = "작성 "/> 
</form>
<script>
$('#report').submit(function () {
	alert('입력완료');
});
</script>
</body>
</html>