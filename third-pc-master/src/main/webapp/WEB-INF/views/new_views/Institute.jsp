<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Institute Home Page</title>
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

/* Fake image */
.fakeimg {
  background-color: #aaa;
  width: 100%;
  padding: 20px;
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

/* Footer */
.footer {
  padding: 20px;
  text-align: center;
  background: #ddd;
  margin-top: 20px;
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
    width: 100%;
  }
}
</style>
</head>
<body>

<div class="header">
  <h2>NATIONAL SCHOLARSHIP PORTAL</h2>
  <p>Government Of India</p>
</div>

<div class="header">
  <h2>STATE NODAL OFFICER PORTAL</h2>  
</div>  
</div>

<div class="row">
  <div class="leftcolumn">
    <div class="card">
    <center>Application Form 1 <input class="button" type="submit" value="View"/></center>
       <center>Application Form 2 <input class="button" type="submit" value="View"/></center>
       <center>Application Form 3 <input class="button" type="submit" value="View"/></center>
    </div>
    
    <div class="card">
        <center><input class="button" type="submit" value="Attach Bonafied Certificate"/></center>
     </div>
  </div>
  <div class="rightcolumn">
    <div class="card">
      <center><h2>Student Application</h2></center>
      <div class="card">
     <center><input class="button" type="submit" value="Verify"/></center>
     <center><input class="button" type="submit" value="Reject"/></center>
     <center><input class="button" type="submit" value="Upload"/></center>
    </div>
    </div>
   </div>
  </div>
</div>

<div class="footer">
<center><input class="button" type="submit" value="Log Out"/></center>
</div>

</body>
</html>
