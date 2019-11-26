<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully Registered</title>
<link rel="stylesheet" type="text/css" href="/css/NewFile2.css">

<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/animate.min.css"> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<head>
<meta charset="ISO-8859-1">

</head>
<body>
<center><a href="/"><img src="/images/logo.jpg"/></a></center>
	<div class="navbar">
  <a href="/">Home</a>
  <a href="#news">News</a>
  <div class="dropdown" align="right">
    <button class="dropbtn">New registration 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="StudRegister">Student</a>
      <a href="InstRegister">Institute</a>
    </div>
  </div> 
</div>

<form action="/"> <!-- enter the login page -->

<center><h1>You have successfully registered</h1></center>

<%-- <center><h1>Your user ID is ${studentId}</h1></center> --%>
<center>
    <button onclick="submit" style="width: 1000px; height: 50px;" type="login" class="loginbtn">Continue to login</button>
</center>
</form>
</body>
</html>