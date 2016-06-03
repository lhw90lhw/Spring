<%@page import="emp.dto.MyEmpDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=euc-kr">
<title>회원정보수정</title>
<% 	MyEmpDTO userInfo  =
			(MyEmpDTO)request.getAttribute("userInfo"); %>
</head>

<body bgcolor="white" text="black" link="blue" vlink="purple" alink="red">
<form name="form1" method="post" 
					action="member_update.do">
<table align="center" cellpadding="0" cellspacing="0" width="479">
    <tr>
        <td width="469" colspan="2" height="42">
            <p align="center"><code><b><span style="font-size:20pt;">회원가입</span></b></code></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <hr></td>
    </tr>
 
    <tr>
        <td width="104">
            <p><code><b>아이디</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="id" 
            value="<%=userInfo.getId() %>" size="5" readonly></code></p>
        </td>
    </tr>
   <tr>
        <td width="104">
            <p><code><b>비밀번호</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="pass" 
            value="<%= userInfo.getPass()%>" size="5"></code></p>
        </td>
    </tr>
    <tr>
        <td width="104">
            <p><code><b>성명</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="name" 
            value="<%=userInfo.getName() %>" size="5" readonly></code></p>
        </td>
    </tr>
    <tr>
        <td width="104">
            <p><code><b>주소</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="addr"
            value="<%= userInfo.getAddr()%>" size="5"></code></p>
        </td>
    </tr>
 
    <tr>
        <td width="104">
            <p><code><b>등급</b></code></p>
        </td>
        <td width="359">
            <p><input type="text" name="grade"  
            value="<%= userInfo.getGrade()%>" size="5"></input></p>
        </td>
    </tr>
   
   
    <tr>
        <td width="479" colspan="2">
            <hr>        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <p align="center"><input type="submit" name="formbutton1" value="수정"></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2" height="9" valign="bottom">            
                <p><code><a href="">리스트(L)</a></code></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2" height="57" valign="bottom">            <p align="right"><code><input type="hidden" name="jumin"><input type="hidden" name="ilsi"></code></p>
        </td>
    </tr>
</table>
</form>
</body>

</html>
