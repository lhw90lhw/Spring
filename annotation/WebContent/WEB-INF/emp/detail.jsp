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
				<td>ȸ�����̵�</td>
				<td><input type="text" name="id" value="<%= emp.getId() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>ȸ���н�����</td>
				<td><input type="text" name="pass" value="<%= emp.getPass() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>ȸ������</td>
				<td><input type="text" name="name" value="<%= emp.getName() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>ȸ���ּ�</td>
				<td><input type="text" name="addr" value="<%= emp.getAddr() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>ȸ���μ��ڵ�</td>
				<td><input type="text" name="deptno" value="<%= emp.getDeptno() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td>���</td>
				<td><input type="text" name="grade" value="<%= emp.getGrade() %>" size="7" readonly></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="�����ϱ�"/>
					<input type="button" value="�����ϱ�"/>
					<input type="button" value="��Ϻ���"
						onclick="location.href='member_list.do'"/>
				</td>
			</tr>
		</table>
	</div>
	</form>
</body>
</html>









