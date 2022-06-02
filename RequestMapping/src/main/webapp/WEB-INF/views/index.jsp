<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Second MVC</title>
</head>
<body>
<h1>Welcome Spring!</h1>
	<form method="post" action="test2">
		<input type="text" name="text"/>
		<button type="submit">test2 전송하기</button>
	</form>
	<a href="test3">test3 get post</a>
	<br>
	<a href="test4">test4 get</a>
	<form method="post" action="test5">
		<input type="text" name="text"/>
		<button type="submit">test5 전송하기</button>
	</form>
</body>
</html>