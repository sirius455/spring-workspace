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

<h1>�α��� ���¿��� �Ķ��� ���̴� �۾�</h1>
<body>




</body>
</html>