<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>State Nodal Officer / Ministry Login</title>

<link rel="stylesheet" type="text/css" href="/css/NewFile2.css">

<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/animate.min.css"> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<center><a href="/"><img src="/images/logo.jpg"/></a></center><br>
<div class="navbar">
  <a href="/">Home</a>
  <a href="#news">News</a>
 <!--  <div class="dropdown" align="right">
    <button class="dropbtn">New registration 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="StudRegister">Student</a>
      <a href="InstRegister">Institute</a>
    </div> 
  </div> -->
</div>

<center>
<h1>State Nodal Officer / Ministry Login</h1>
<form action="StateLogin.nsp" method="post">
<input type="text" name="AdminId" placeholder="Your Id"/>
<br><br>

<input type="password" name="Password" placeholder="password"/>
<br><br>

<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
</center>
</form>
</body>
</html>