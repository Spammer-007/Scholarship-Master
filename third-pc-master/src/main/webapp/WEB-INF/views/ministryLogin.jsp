<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ministry Login</title>
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
<h1>Ministry Login</h1>
<form>
<input type="text" id="email" placeholder="email id"/>
<br><br>

<input type="password" id="password" placeholder="password"/>
<br><br>

<input type="submit" value="Submit"/>
<input type="reset" value="Reset"/>
</center>
</form>
</body>
</html>