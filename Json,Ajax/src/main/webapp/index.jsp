<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#btnOk1").click(function() {
			$.ajax({
				url : "list",
				type : "GET",
				data : {
					"name" : "tom"
				},
				success : function(Data) {
				var str="";
				str+=Data.name+"<br>";
				str+=Data.skills[0]+" "+Data.skills[1];
				$("#showData").html(str);
				}
			});
		});

		$("#btnOk2").click(function() {
			$.ajax({
				url : "list2",
				type : "GET",
				dataType:"json",
				success : function(Data) {
				alert(Data);
				var str="<table>";
				var list= Data.datas;
				$(list).each(function(index,obj){
					str+="<tr>";
					str+="<td>"+obj["name"]+"</td>";
					str+="<td>"+obj["age"]+"</td>";
					str+="</tr>";
				});
				str+="</table>";
				console.log(str);
				$("#showData").html(str);
				}
			});
		});
	})
</script>
</head>
<body>
	<a href="list?name=james">json처리: 단일자료</a>
	<br>
	<input type="button" value="한 개 자료" id="btnOk1">
	<br>
	<input type="button" value="복수 자료" id="btnOk2">
	<br>
	<div id="showData"></div>
</body>
</html>
