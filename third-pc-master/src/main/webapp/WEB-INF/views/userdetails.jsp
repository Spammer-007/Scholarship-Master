<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>${name}</h1>
<br>
<h1>${studentReligion}</h1> --%>
<center>
<c:forEach items="${lists}" var="student">
    <p>${student.studentName}</p><br/>
    <p>${student.studentGender}</p><br/>
    <p>${student.studentDomicileState}</p><br/>
    <p>${student.instituteCode}</p><br/>
</c:forEach>
</center>
</body>
</html>