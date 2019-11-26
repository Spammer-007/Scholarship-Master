<!DOCTYPE html>
<html>
<head>
<title>Homepage</title>
<link rel="stylesheet" type="text/css" href="/css/NewFile2.css">
<link rel="stylesheet" type="text/css" href="/css/HomePage.css">
<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/animate.min.css"> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<div class="header">
<center><img src="images/logo.jpg" ><center>
   <p><h2>Government Of India</h2></p>
</div>

<div class="navbar">
  <a href="#">Home</a>
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

<div class="row">
  <div class="leftcolumn">
    <div class="card">
      <h2>NATIONAL SCHOLARSHIP PORTAL</h2>
      <p>National Scholarships Portal is one-stop solution through which various services starting from student application, application receipt, processing, sanction and disbursal of various scholarships to Students are enabled. National Scholarships Portal is taken as Mission Mode Project under National e-Governance Plan (NeGP)

<b><h3><ol>VISION</b></h3></ol>
National Scholarships Portal is one-stop solution through which various services starting from student application, application receipt, processing, sanction and disbursal of various scholarships to Students are enabled.
This initiative aims at providing a Simplified, Mission-oriented, Accountable, Responsive & Transparent 'SMART' System for faster & effective disposal of Scholarships applications and delivery of funds directly into beneficiaries account without any leakages.

<b><h3><ol>MISSION</b></h3></ol>
The Mission Mode Project (MMP) of National Scholarships Portal under the National e-Governance Plan aims at providing common electronic portal for implementing various Scholarships schemes launched by Union Government, State Government and Union Territories across the country.

<b><h3><ol>OBJECTIVES</b></h3></ol>
Ensure timely disbursement of Scholarships to studentsProvide a common portal for various Scholarships schemes of Central and State GovernmentsCreate a transparent database of scholarsAvoid duplication in processingHarmonisation of different Scholarships schemes & normsApplication of Direct Benefit Transfer</p>
      <b><h3><ol>BENIFITS</b></h3></ol>
  <b><h4><ol>Simplified process for the students:</ol></h4></b>
	<ol>1: All scholarships information available under one umbrella.</ol>
	<ol>2: Single integrated application for all scholarships.</ol>

  <b><h4><ol>Improved transparency :</ol></h4></b>
	<ol>1:	System suggests the schemes for which a student is eligible.</ol>
	<ol>2:	Duplicates can be reduced to the maximum extent</ol>

 <b><h4><ol>Helps in standardisation :</ol></h4></b>
 	<ol>1: Master data for Institutions and courses at all India level</ol>
	<ol>2: Scholarships processing</ol>

  Serves as a decision support system (DSS) for Ministries and departments as up-to date information will be available on demand.
  Comprehensive MIS System to facilitate monitoring every stage of Scholarships distribution i.e. from student registration to delivery of funds.</p>
    </div>
    
  </div>
  <div class="rightcolumn">
      <center><div class="card">
      <div class="right">
      <form class="login100-form validate-form"  modelAttribute = "loginnow" method="post" action="/studentlogin">
					<span class="login100-form-title">
						<b>Student Login</b>
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
							Institute Login
							<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
					
					<br>
					
					<div class="text-center p-t-136">
						<a class="txt2" href="StateLogin">
							State Nodal Officer / Ministry Login
							<i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
						</a>
					</div>
				</form>
    </div>
  </div></center>
    
  </div>
</div>
</body>
</html>
