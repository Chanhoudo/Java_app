<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"
    isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현 언어로 여러 가지 데이터 출력하기</title>
</head>
<body>
	<h2>여러 가지 산술 연산자</h2>
	<h1>
		\${(10=10) && (20 == 20)} : ${(10 == 10)&&(20 == 20)}<br>
		\${(10=10) and (201=20)} : ${(10 == 10) and (20 != 20)}<br>
		\${(10=10) || (201=30)} : ${(10 == 10)||(20 != 30)}<br>
		\${(10 != 10) or (201=20)} : ${(10 != 10) or (20 != 20)}<br>
		\${! (20=10)} : ${! (20-10)}<br>
		\${not (20 == 10)} : ${not (20=10)}<br>
		\${!(201=10)} : ${!(201=10)}<br>
		\${not(20 != 10)} : ${not(20 != 10)}<br>
		
	</h1>
</body>
</html>