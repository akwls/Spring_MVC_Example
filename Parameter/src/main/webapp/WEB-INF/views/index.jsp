<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Second MVC</title>
</head>
<body>
<h1>hi Spring MVC~</h1>
<a href="test1?data1=100&data2=200">test1</a><br>
<a href="test2?data1=100&data2=200&data3=300&data3=400">test2</a><br>
<a href="test3?data1=500&data2=600">Web Request</a><br>
<a href="test4/700/800/900">@PathVariable</a><br>
<a href="test5?data1=10&data2=20&data3=30">@RequestParam</a><br>
<a href="test6?data1=40&data2=50&data3=60&data3=70">@RequestParam Array</a>
</body>
</html>