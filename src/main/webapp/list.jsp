<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css.css">
</head>
<body>
<table>
	<tr>
		<td>编号</td>
		<td>用户名</td>
		<td>练习方式</td>
	</tr>
	<c:forEach items="${list }" var="u">
	<tr>
		<td>${u.uid }</td>
		<td>${u.uname }</td>
		<td>${u.phone }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>