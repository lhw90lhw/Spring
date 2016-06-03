<%@page import="emp.dto.MyEmpDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% MyEmpDTO emp = (MyEmpDTO)request.getAttribute("emp"); %>
	<form name="form" method="post" action="update.do">
	<div align="center">
		<table width="300" border="1">
			<tr>
				<td>회원아이디</td>
				<td><input type="text" name="id" value="<%= emp.getId() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>회원패스워드</td>
				<td><input type="text" name="pass" value="<%= emp.getPass() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>회원성명</td>
				<td><input type="text" name="name" value="<%= emp.getName() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>회원주소</td>
				<td><input type="text" name="addr" value="<%= emp.getAddr() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>회원부서코드</td>
				<td><input type="text" name="deptno" value="<%= emp.getDeptno() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>등급</td>
				<td><input type="text" name="grade" value="<%= emp.getGrade() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="수정하기"/>
					<input type="button" value="삭제하기"/>
					<input type="button" value="목록보기"
						onclick="location.href='member_list.do'"/>
				</td>
			</tr>
		</table>
	</div>
	</form>
</body>
</html>









