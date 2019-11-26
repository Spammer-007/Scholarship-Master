<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to National Scholarship Portal!</title>
<link rel="stylesheet" type="text/css" href="/css/NewFile2.css">

<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/animate.min.css"> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   
</head>

<body>

<center><a href="/"><img src="/images/logo.jpg"/></a></center>
<header>
<nav>
<div>
 <div class="navbar">
  <a href="#home">Home</a>
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

<div class="right" align="center">
<form class="login100-form validate-form" modelAttribute = "loginnow" method="post" action="/studentlogin">
					<span class="login100-form-title">
						<b><h1 align="center">Student Login</h1></b>
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<br><input class="input100" type="text" name="studentId" placeholder="Student ID">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div><br>

					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<input class="input100" type="password" name="studentPassword" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div><br>
					
					<div class="container-login100-form-btn">
						<button class="login100-form-btn" onclick="submit">
							Login
						</button>
					</div><br>

					
					<div class="text-center p-t-136">
						<a class="txt2" href="InstituteLogin">
							Institute
							<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
					
					<br>
					
					
					<div class="text-center p-t-136">
						<a class="txt2" href="StateLogin">
							State Nodal Officer / Ministry 
							<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
				
				</div>
				<div class="left"><form class="latest100-form validate-form">
					<span class="latest100-form-title">
						Latest Update
						</span>
						</form>
						</div>
<div class="main-content-header">

  <h1>
  <center><span class="color-change">Detailed Description</span></center></h1>


</div>
</header>

<script type="text/javascript">
function slideshow(){
	var x =document.getElementsbyId("check-class");
	if(x.style.display == "none"){x.style.display=="block";}
	else{
		x.style.display="none"
	}
}
</script>
</body>
</html>