<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ministry Login</title>
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
	<script>
                function validate(){
                    var code=document.getElementById("mcode").value;
                    var pass=document.getElementById("password").value;
                 
                    var p1="minister1234"; var p2="hellominister";
                    if(code==p1 && pass==p2){
                    	  window.open("ministerFetching.jsp");
                        
                    }
                    else{
                    	alert("Invalid Credentials");
                    	//window.open("minister.jsp");
                    	return false;
                    }
                }
                      
          </script>
	<form onsubmit="return validate()">
		Enter your code:<input type="text" id="mcode"> Enter your
		password:<input type="password" id="password">
		<button type="submit">Submit</button>
	</form>
</body>
</html>