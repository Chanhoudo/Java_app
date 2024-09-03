<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
   request.setCharacterEncoding("UTF-8");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입창</title>
<style>
   .text_center{
     text-align:center;
   }
</style>
</head>
<body>
	<form method="post" action="${contextPath}/mem4.do?action=insertMember2" onsubmit="return validateForm()">
    <h1 class="text_center">회원 가입창</h1>
    <table align="center">
        <tr>
            <td width="200"><p align="right">아이디</td>
            <td width="400"><input type="text" name="id" required></td>
        </tr>
        <tr>
            <td width="200"><p align="right">비밀번호</td>
            <td width="400"><input type="password" name="pwd" required></td>
        </tr>
        <tr>
            <td width="200"><p align="right">이름</td>
            <td width="400"><input type="text" name="name" required></td>
        </tr>
        <tr>
            <td width="200"><p align="right">이메일</td>
            <td width="400"><input type="email" name="email" required></td>
        </tr>
        <tr>
            <td width="200"><p>&nbsp;</p></td>
            <td width="400"><input type="submit" value="가입하기"><input type="reset" value="다시입력"></td>
        </tr>
    </table>
</form>

<script>
function validateForm() {
    const id = document.forms[0]["id"].value;
    const pwd = document.forms[0]["pwd"].value;
    const name = document.forms[0]["name"].value;
    const email = document.forms[0]["email"].value;

    if (id === "" || pwd === "" || name === "" || email === "") {
        alert("모든 필드를 입력해주세요.");
        return false;
    }
    return true;
}
</script>
</body>
