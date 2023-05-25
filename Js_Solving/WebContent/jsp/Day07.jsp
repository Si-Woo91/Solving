<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="../js/Day07.js"></script>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
	margin : 0;
	padding : 0;
}
#wrap{
	width: 500px;
	height: 500px;
	background-color: black; 
}

h1 { 
	text-align: center; 
}

#explanation{
    justify-content: center;
    align-items: center;
    display: flex;
}
#reward{
    justify-content: center;
    align-items: center;
    display: flex;
    font-size: 20px
}

.area{
  margin: auto;
}

.dice1{
	width: 100px;
	height: 100px;
	border: 1px solid #FFFFFF;
	background-color: #FFFFFF;
	float: left;
	margin: 19px;
	box-sizing: border-box;
	text-align : center;
	line-height: 100px;
	
}

.dice2{
	width: 100px;
	height: 100px;
	border: 1px solid #FFFFFF;
	background-color: #FFFFFF;
	float: left;
	margin: 19px;
	box-sizing: border-box;
	text-align : center;
	line-height: 100px;
}

.dice3{
	width: 100px;
	height: 100px;
	border: 1px solid #FFFFFF;
	background-color: #FFFFFF;
	float: left;
	margin: 19px;
	box-sizing: border-box;
	text-align : center;
	line-height: 100px;
}
	
</style>

</head>
<body>
	<h1>3개의 주사위</h1><br>
	<span id = "explanation">버튼을 클릭하면 3개의 주사위가 랜덤으로 나오고, 상금이 계산 됩니다.</span><br><br>
	
	<br>
	<span id = "reward">
		<input type="button" value = "주사위를 굴린다." onclick = "randomDice()"/>&nbsp&nbsp&nbsp
		상금 : <span id = "money">0</span>
	</span><br><br>
	
	<div class = "area" id = "wrap">
		<div class = "dice1" id ="dice1">0</div>
		<div class = "dice2" id ="dice2">0</div>
		<div class = "dice3" id ="dice3">0</div>
	</div>
</body>
</html>