<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
	import="sec01.ex01.MemberBean" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="m1" class="sec01.ex01.MemberBean" />
<jsp:setProperty name="m1" property="*" />
<jsp:useBean id="membersList" class="java.util.ArrayList" scope="session" />
<jsp:useBean id = "memberMap" class="java.util.HashMap"/>

<%
	memberMap.put("id", "park");
	memberMap.put("pwd","1234");
	memberMap.put("name","박지성");
	memberMap.put("email","park@email.com");
    // 입력된 값을 가진 빈을 리스트에 추가
    membersList.add(m1);

    // 직접 생성한 빈을 리스트에 추가
    MemberBean m2 = new MemberBean("son", "1234", "손흥민", "son@test.com");
    membersList.add(m2);
    
    memberMap.put("membersList", membersList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
    <table border=1 align="center">
        <tr align=center bgcolor="#99ccff">
            <td width="20%"><b>아이디</b></td>
            <td width="20%"><b>비밀번호</b></td>
            <td width="20%"><b>이름</b></td>
            <td width="20%"><b>이메일</b></td>
        </tr>
        <tr align=center>
            <td>${memberMap.id}</td>
            <td>${memberMap.pwd }</td>
            <td>${memberMap.name }</td>
            <td>${memberMap.email }</td>
           
        </tr>
        <tr align=center>
            <td>${memberMap.membersList[0].id }</td>
            <td>${memberMap.membersList[0].pwd}</td>
            <td>${memberMap.membersList[0].name}</td>
            <td>${memberMap.membersList[0].email}</td>
        </tr>
        <tr align=center>
            <td>${memberMap.membersList[1].id }</td>
            <td>${memberMap.membersList[1].pwd}</td>
            <td>${memberMap.membersList[1].name}</td>
            <td>${memberMap.membersList[1].email}</td>
        </tr>
    </table>
</body>
</html>