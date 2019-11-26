<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Homepage</title>
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

.button{
  width: 150px;
  text-align: center;
  margin:0 auto;
}
</style>
</head>
<body>

<div class="header">
  <h2>NATIONAL SCHOLARSHIP PORTAL</h2>
  </div>

<div class="topnav">
  <a href="#">Home</a>
  <a href="#">About Us</a>
  <a href="#">Contact Us</a>
</div>

<div class="row">
  <div class="leftcolumn">
    <div class="card">
      <h2>SCHEMES</h2>
      <h5>Click below on the scheme to see its description </h5>
      
      <center><ol><a href="#">SCHEME 1</a></ol></center>
  	  <center><ol><a href="#">SCHEME 2</a></ol></center>
  	  <center><ol><a href="#">SCHEME 3</a></ol></center>
      
    </div>
    <div class="card">
      <h2>MY PROFILE</h2>
       <center><input class="button" type="submit" value="My Profile"/></center>
        <center><input class="button" type="submit" value="Check Status"/></center>
         <center><input class="button" type="submit" value="Update"/></center>
          <center><input class="button" type="submit" value="Logout"/></center>
    </div>
  </div>
  <div class="rightcolumn">
    <div class="card">
      <h2>GUIDELINES</h2>
      <p>Some text about me in culpa qui officia deserunt mollit anim v..</p>
    </div>
     </div>
</div>

  <div class="card">
      <center><h3>Scheme Description</h3></center>
      <center><input class="button" type="submit" value="Apply"/></center>
  </div>
</div>

</body>
</html>
