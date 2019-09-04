<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트대학교</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
	<h1>학생등록</h1>
	<form id = "register_form" action="<%=request.getContextPath()%>/student.do">
	이름<input type="text" name = "name" /> <br />
	학번<input type="text" name = "stuNum" /><br />
	주민번호<input type="text" name = "ssn" /><br />
	<input type="hidden" name = "action" value = "register" />
	<input type="hidden" name = "dest" value = "login" />
	<input type="submit"value = "등록" />
	
	</form>
</div>
<script>
$('#register_form').submit(function() {
	alert('등록완료');
	
});

</script>
</body>
</html>