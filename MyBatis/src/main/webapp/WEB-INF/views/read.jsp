<%@page import="kr.hs.study.model.DataBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>read</title>
</head>
<body>
<table>
	<c:forEach var="value" items="${list }">
		<tr>
			<td>${value.data1 }</td>
			<td>${value.data2 }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>