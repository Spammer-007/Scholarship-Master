<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Documents</title>
</head>
<body align="center">
<h1>Upload your Documents</h1>
<form action="DocumentsUpload.nsp" method="post">
<br><br><br>
    <br>    Domicile Certificate 
    <button class="upload1" name="domicileCertificate">Upload</button>
    
    <div>
    <br>    Student Photograph
       <button class="upload2" name="studentPhotograph">Upload</button>
    </div><div>
    <br>   Institute ID card
    <button class="upload3" name="instituteIDCard">Upload</button>
    </div><div>
    <br>    Caste Income Certificate
    <button class="upload4" name="casteIncomeCertificate">Upload</button>
    </div><div>
    <br>    Previous Year Marksheet
    <button class="upload5" name="previousYearMarksheet">Upload</button>
    </div><div>
    <br>    Fee Reciept of Current Year
    <button class="upload6" name="currentYearFeeReceipt">Upload</button>
    </div><div>
    <br>    Bank Passbook(Front Page)
    <button class="upload7" name="bankPassbook">Upload</button>
    </div><div>
    <br>    Aadhar Card
    <button class="upload8" name="aadharCard">Upload</button>
    </div><div>
    <br>    10th Class Marksheet
    <button class="upload9" name="tenMarksheet">Upload</button>
    </div><div>  
    <br>    12th Class Marksheet
    <button class="upload10" name="twelveMarksheet">Upload</button>
    </div>
    
  <!--   <button name="Previous" onclick="StudentMarks_12">Previous</button> -->
     <button name="SUBMIT" onclick="submit">SUBMIT APPLICATION</button>
<!-- <button name="Cancel">Cancel</button> -->

<input type="text" id="studentId" name="studentId" value="${sessionScope.studentId}" hidden/> 
</form>
</body>
</html>