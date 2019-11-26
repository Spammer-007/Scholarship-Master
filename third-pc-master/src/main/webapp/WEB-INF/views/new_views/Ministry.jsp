
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Ministry</title>
<head>
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial;
  padding: 10px;
  background: #f1f1f1;
}

/* Header/Blog Title */
.header {
  padding: 30px;
  text-align: center;
  background: white;
}

.header h1 {
  font-size: 50px;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Create two unequal columns that floats next to each other */
/* Left column */
.leftcolumn {   
  float: left;
  width: 75%;
}

/* Right column */
.rightcolumn {
  float: left;
  width: 25%;
  background-color: #f1f1f1;
  padding-left: 20px;
}


/* Add a card effect for articles */
.card {
  background-color: white;
  padding: 20px;
  margin-top: 20px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}



/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 800px) {
  .leftcolumn, .rightcolumn {   
    width: 100%;
    padding: 0;
  }
}

/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
  .topnav a {
    float: none;
    width: 150%;
  }
}

.button{
  width: 165px;
  text-align: center;
  margin:0 auto;
}
</style>
<link rel="stylesheet" type="text/css" href="/css/StudentDashboard_css.css">
<link rel="stylesheet" type="text/css" href="/css/NewFile2.css">

<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/animate.min.css"> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<center><a href="/"><img src="/images/logo.jpg"/></a></center>
<div>
 <div class="navbar">
  <a href="/">Home</a>
  <a href="#news">News</a>
  <div style="position:fixed; right:2%;">
  <a href="/stateLogout">Logout</a>
</div>

<div class="header">
  <h2>MINISTRY PORTAL</h2>  
</div>  

<div class="row">
  <div class="leftcolumn">
    <div class="card">
     <center><input class="button" type="submit" value="Go to HomePage"/></center>
     <center><input class="button" type="submit" value="View Student Application Form"/></center>
     <center><input class="button" type="submit" value="View Institute Registration Form"/></center>
    </div>
    
<div class="card">
      <center><h2>Student Applications</h2></center>
      <div class="card">
       <center>Student Form 1 <input class="button" type="submit" value="View"/></center>
       <center>Student Form 2 <input class="button" type="submit" value="View"/></center>
       <center>Student Form 3 <input class="button" type="submit" value="View"/></center>
    </div>
            
    </div>
  </div>
  
  <div class="rightcolumn">
    <div class="card">
      <center><h2>Institute Registration</h2></center>
      <div class="card">
     <center><input class="button" type="submit" value="Grant"/></center>
     <center><input class="button" type="submit" value="Reject"/></center>
     <center><input class="button" type="submit" value="Cancel"/></center>
    </div>
    </div>
   </div>
   
</div>



</body>
</html>
