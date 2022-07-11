<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>성적 구하기</title>
</head>
<body>
<form action="score" method="post">
	<label for="name">이름</label>
	<input type="text" name="name" id="name"><br>
	<label for="korean">국어</label>
	<input type="text" name="korean" id="korean"><br>
	<label for="english">영어</label>
	<input type="text" name="english" id="english"><br>
	<label for="math">수학</label>
	<input type="text" name="math" id="math"><br>
	<input type="submit" value="입력완료">
</form>
</body>
</html>