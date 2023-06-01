<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script type="text/javascript" src="../js/Day08.js"></script>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.area{
	margin: auto;
	width: 300px;
	height: 500px;
	border: 1px solid black;
}

</style>
</head>
<body>

<input id = 'dan' onfocus="this.value='';" value = '단을 입력하세요' ></input>
<input type = 'button' value = '실행' onclick = "gugudan()"></input><br>

	<div class = "area" id ='gugudan'>
	구구단 출력
	</div>

</body>
</html>