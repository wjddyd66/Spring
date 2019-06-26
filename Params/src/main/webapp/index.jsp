<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
	요청 파라미터 연습*<br>
	<a href="kic/login?type=admin">관리자</a>
	<a href="kic/login?type=user">일반회원</a>
	<a href="kic/login">파라미터없음</a>
	<br>
	<form action="kic/login" method="post">
		data: <input type="text" name="type" value="Hwang">
		<input type="submit" value="전송">
	</form><br>
	<form action="kic/hello" method="post">
		data: <input type="text" name="type" value="Jeong">
		<input type="submit" value="전송2">
	</form>
	
	<form action="hello/get/world/Java" method="get">
		신곡: <input type="text" name="title" value="봄이 와요">
		<input type="submit" value="전송3">
	</form>
	
	<form action="hello/get/world/Spring" method="get">
		신곡: <input type="text" name="title" value="여름이 와요">
		<input type="submit" value="전송4">
	</form>
	
	</body>
</html>
