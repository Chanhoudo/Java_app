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
		\${10+10}: ${10+10}<br>
		\${20-10}: ${20-10}<br>
		\${10*10}: ${10*10 }<br>
		\${100/9}: ${100/9 }<br>
		\${10 / 9}: ${100 / 9}<br>
		\${100%9}: ${100%9 }<br>
		\${100 mod 9}: ${100 mod 9 }<br>
		
	</h1>
</body>
</html>