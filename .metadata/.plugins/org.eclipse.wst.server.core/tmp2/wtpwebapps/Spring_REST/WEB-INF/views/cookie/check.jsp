<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<c:if test="${login == '1'}">
<style>
	h1 {
		color:blue;
	}
</style>
</c:if>
<c:if test="${login != '1'}">
<style>
h1 {
		color: red;
	}
</style>
</c:if>
</head>

<h1>로그인 상태에서 파랑게 보이는 글씨</h1>
<body>




</body>
</html>