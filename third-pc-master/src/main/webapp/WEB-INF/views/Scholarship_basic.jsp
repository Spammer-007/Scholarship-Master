<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scholarship Application</title>
</head>
<body align="center">

<form id="ScholarshipBasicForm" action="ScholarshipBasic.nsp"  method="post"><!-- //modelAttribute="scholarshipnow" -->
  <div class="container">
 <center><a href="/"><img src="/images/logo.jpg"/></a></center>
    <h1>Scholarship Form</h1>
    <p>Please fill in this form to fill your details.</p>
    <br><hr><br>
    
    <div class="dropdown">
    <label><h1>Choose Scheme:-</h1></label><br><br>
    <select name="scheme_Id">
  <option>--Select Scheme--</option>
  <option value="101">Post Matric Scholarship</option>
  <option value="201">Scholarship Meant for Girls</option>  
  <option value="301">Merit Based Scholarship</option>
  </select>
  </div>
  
  <br>
  <hr>
  <br>  <p><h1>BASIC DETAILS</h1></p>

    <div><label for="StudentAadharNo"><b>Aadhar Number</b></label><br><br>
    <input type="text" placeholder="Aadhar number" name="studentAadharNo" required></div>
</div>

<div>
<br><h4> Religion</h4> 
  <select name="studentReligion">
  <option>--Select Religion--</option>
  <option>Hindu</option>
  <option>Muslim</option>
  <option>Sikh</option>
  </select>
    <br><br><br>
    
   
    <label for="Category"><br><b>Category</b></label><br><br>
    <input type="text" placeholder="Enter your Category" name="studentCategory" required>

<br>    <label for="StudentFathername"><br><b>Father's Name</b></label><br><br>
    <input type="text" placeholder="Father's Name" name="studentFatherName" required>
    
<br>    <label for="StudentMothername"><br><b>Mother's Name</b></label><br><br>
    <input type="text" placeholder="Mother's Name" name="studentMotherName" required>
    
<br>    <label for="StudentFamincome"><br><b>Family Income</b></label><br><br>
    <input type="text" placeholder="Family income" name="studentFamIncome" required>

<br>    <br>

<hr>
<br>    <p><h1>CONTACT DETAILS</h1></p>
    
   
<br>   <h4>State</h4>
  <select name="studentState">
  <option>--Select State--</option>
  <option>Maharasthra</option>
  <option>Madhya Pradesh</option>  
  <option>Rajasthan</option>
  <option>Delhi</option>
  <option>Karnataka</option>
  </select>

    <br><br><br>
   
   
<br>    <h4>District</h4>
 <select name="studentDistrict">
  <option>--Select District--</option>
  <option>Maharasthra</option>
  <option>Madhya Pradesh</option>  
  <option>Rajasthan</option>
  <option>Delhi</option>
  <option>Karnataka</option>
  </select>

    <br><br><br>
   
 
      <h4>Block/Taluka</h4>
  <select name="studentTaluka">
  <option>--Select Block/Taluka--</option>
  <option>Kurla</option>
  <option></option>  
  <option></option>
  <option></option>
  <option></option>
  </select>
</div>

    <br><br><br>
    
   <label for="StudentHousenumber"><b><br>House Number</b></label><br><br>
   <input type="text" placeholder="House_number" name="studentHouseNo" required>
    
   <br><label for="StudentStreetno"><b><br>Street Number</b></label><br><br>
   <input type="text" placeholder="Street Number" name="studentStreetNo" required>
    
   <br><label for="Studentpincode"><b><br>Pincode </b></label><br>
   <input type="text" placeholder="Pincode" name="studentPincode" required>

<br><br>
<hr>
<br>    <p><h1>Other Personal Details.</h1></p>    
<br>    <h4> Disability</h4>
  <select name="disability">
  <option>--Select if Disability Exists--</option>
  <option>Yes</option>
  <option>No</option>  
  </select>

    <br><br><br>
    
<br>    <label for="TypeofDisability"><b>Type of Disability</b></label>
    <input type="text" placeholder="Type of Disability" name="TypeofDisability">
   
<br>    <label for="Percentageofdisability"><b>% of Disability</b></label>
    <input type="text" placeholder="% of Disability" name="percentageOfDisability" >
 
<%--  <input type="text" id="studentId" name="studentId" value="${studentId}" hidden/> --%>
<br><br>    
<button type="submit" name="Next" onclick="submit">Next</button>
<button name="Cancel">Cancel</button> 


</form>    
<textarea rows="1" cols="1" name="studentId" id="studentId" form="ScholarshipBasicForm" hidden>${sessionScope.studentId}</textarea>
</body>
</html>