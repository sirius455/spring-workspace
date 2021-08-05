<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추가하기</title>
</head>
<body>
	<form id="food_info" action="./plus" method="POST"></form>
	<ul type="none">
		<li>음식 번호 : <input type ="text" name="food_num" form="food_info"></li>
		<li>음식 이름 : <input type ="text" name="food_name" form="food_info"></li>
		<li>음식 가격 : <input type ="text" name="food_price" form="food_info"></li>
		<li><input type="submit" value="등록" form="food_info"></li>
	</ul>

</body>
</html>