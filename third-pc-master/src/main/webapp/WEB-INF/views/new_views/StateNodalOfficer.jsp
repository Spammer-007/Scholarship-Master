<!DOCTYPE html>
<html>
<title>State Nodal Officer</title>
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
</div>

<div class="header">
  <h2>STATE NODAL OFFICER PORTAL</h2>  
</div>  
</div>

<div class="row">
  <div class="leftcolumn">
    <div class="card">
     <center><input class="button" type="submit" value="View Institues Registered"/></center>
     <br><br>
     <center><input class="button" type="submit" value="View Student Application Form"/></center>
     <!-- <center><input class="button" type="submit" value="Verify Institute Requests"/></center> -->
    </div>
    
    <!-- <div class="card">
      <center><h2>LIST OF INSTITUTES REGISTERED</h2></center>
      <center><h5>Below are the institutes registered for the scholarship</h5></center>
   	  <center><form>
  		<ol>1 <input type="text" name="institute1"><br></ol>
  		<ol>2<input type="text" name="institute2"><br></ol>
  		<ol>3<input type="text" name="institute3"><br></ol>
  		<ol>4<input type="text" name="institute4"><br></ol>
  		<ol>5<input type="text" name="institute5"><br></ol>
  		<ol>6<input type="text" name="institute6"><br></ol>
      </form></center>
      
     </div>
  </div>
  <div class="rightcolumn">
    <div class="card">
    <ol><center>Student Application Form 1<input class="button" type="submit" value="View"/></center></ol>
     <ol><center>Student Application Form 2<input class="button" type="submit" value="View"/></center></ol>
     <ol><center>Student Application Form 3<input class="button" type="submit" value="View"/></center></ol>
  </div>
   </div>
  </div>
</div> 

<div class="footer">
<center><input class="button" type="submit" value="Log Out"/></center>
</div> -->

</body>
</html>
