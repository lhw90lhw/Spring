<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>	
	<h1>스프링으로부터 응답된 JSP(ViewResolver)</h1>
	<hr/>
	<h3>JSP로 출력:<%= request.getAttribute("msg") %></h3>
	<h3>EL로 출력:</h3>
</body>
</html>