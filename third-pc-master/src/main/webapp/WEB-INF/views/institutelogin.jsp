<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Institute Login</title>

<link rel="stylesheet" type="text/css" href="/css/NewFile2.css">

<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/animate.min.css"> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
<br><br>

<center>
<h1>Institute Login</h1>
<form action="/InstituteLogin.nsp" method="post">
<input type="text" name="instituteCode" placeholder="INSTITUTE CODE"/>
<br><br>

<input type="password" name="password" placeholder="password"/>

<br><br>
<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
</center>
</form>

<br><br>
<center>New user? Register <a href="/InstRegister">here</a></center>

</body>
</html>