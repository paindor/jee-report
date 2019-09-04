<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>

<body>
<h1>로그인</h1>
<div>
	<form  id = "login_form"action="<%=request.getContextPath()%>/student.do">
		아이디<input type="text"name = "cid" /> <br />
		비밀번호<input type="text"name = "cid" /> <br />
		<input type="text"name = "cid" /> <br />
		<input type="submit"value = "로그인" /> <br />
	
	
	</form>


</div>
<script>
$('#login_form').submit(function() {
	alert('들어가자');
	
});
</script>
</body>

</html>