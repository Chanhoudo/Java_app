<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입창</title>
</head>
<body>
    <form method="post" action="member5.jsp">
        <h1 style= "text-align:center">회원 가입창</h1>
        아이디 <input type="text" name="id"> <br><br>
        비밀번호 <input type="password" name="pwd"><br><br>
        이름 <input type="text" name="name"><br><br>
        이메일 <input type="email" name="email"><br><br>
        <input type="submit" value="가입하기">
        <input type="reset" value="다시입력">
    </form>
</body>
</html>