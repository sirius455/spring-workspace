<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>

<h3># 연습문제</h3>
<ul>
	<li>다양한 회원정보를 입력받는다.</li>
	<li>POST방식으로 회원정보와 함께 요청하면 
		전달한 회원 정보를 서버의 /data/user에 파일형태로 저장한다.</li>
	<li>파일 이름은 중복이 생기지 않도록 조심해야한다.</li>
	<li>누락된 정보가 있는경우 회원가입 실패 페이지로 넘어가야 한다.</li>
	<li>회원가입에 성공하면 회원가입 성공페이지를 5초간 보여준 후 다시 홈으로 이동한다.</li>
</ul>

<hr>

이곳에서 회원 정보를 입력하세요.
	
	<form id="user_info" action="data/user" method="POST"></form>
	<ul type="none">
		<li>아이디 : <input type ="text" name="id" form="user_info"></li>
		<li>비밀번호 : <input type ="text" name="password" form="user_info"></li>
		<li>이름 : <input type ="text" name="name" form="user_info"></li>
		<li>나이 : <input type ="text" name="age" form="user_info"></li>
		<li>생일 : <input type ="date" name="birthday" form="user_info"></li>
		<li>이메일 : <input type ="text" name="email" form="user_info"></li>
		<li>
		  	   <input type="radio" name="gender" id="man" value="남" form="user_info" checked>
               <label for="man"> 남 </label>
               <input type="radio" name="gender" value="여" id="woman" form="user_info">
               <label for="woman"> 여 </label>
		</li>
		<li><input type="submit" value="등록" form="user_info"></li>
	</ul>
	
</body>
</html>