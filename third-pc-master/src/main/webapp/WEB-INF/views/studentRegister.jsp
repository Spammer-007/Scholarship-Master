<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
<link rel="stylesheet" type="text/css" href="/css/NewFile2.css">

<link rel="stylesheet" href="/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/animate.min.css"> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- <base href="/Scholarship/"> -->

<script type="text/javascript">
	function validate() {
		console.log("HELLO")
	
		var studentId = document.getElementById('studentId').value;
		var studentAadharNo = document.getElementById('studentAadharNo').value;
		var studentName = document.getElementById('studentName').value;

		var studentGender = document.getElementById('studentGender').value;
		var studentMobileNo = document.getElementById('studentMobileNo').value;
		var studentEmail = document.getElementById('studentEmail').value;
		var studentDomicileState = document.getElementById('studentDomicileState').value;
		var studentDomicileDistrict = document.getElementById('studentDomicileDistrict').value;
		var studentPassword = document.getElementById('studentPassword').value;
		var studentBankName = document.getElementById('studentBankName').value;
		var studentBankIfsc = document.getElementById('studentBankIfsc').value;
		var studentBankAccNo = document.getElementById('studentBankAccNo').value;
		var studentDob = document.getElementById('studentDob').value;

		if (studentId == '') {
			document.getElementById('error-studentId').innerHTML = "ID cannot be blank";
			return false
		} else if (studentAadharNo == '') {
			document.getElementById('error-studentAadharNo').innerHTML = "Aadhar Number cannot be blank";
		} else if (studentName == '') {
			document.getElementById('error-studentName').innerHTML = "Student Name cannot be blank";
			return false
		} else if (studentGender == '') {
			document.getElementById('error-studentGender').innerHTML = "studentGender cannot be blank";
			return false
		} else if (studentMobileNo == '') {
			document.getElementById('error-studentMobileNo ').innerHTML = "studentMobileNo Name cannot be blank";
			return false
		} else if (studentEmail == '') {
			document.getElementById('error-studentEmail').innerHTML = "studentEmail cannot be blank";
			return false
		} else if (studentDomicileState == '') {
			document.getElementById('error-studentDomicileState').innerHTML = "studentDomicileState password cannot be blank";
			return false
		} else if (studentDomicileDistrict == '') {
			document.getElementById('error-studentDomicileDistrict').innerHTML = "studentDomicileDistrict cannot be blank";
			return false
		} else if (studentPassword == '') {
			document.getElementById('error-studentPassword').innerHTML = "studentPassword cannot be blank";
			return false
		} else if (studentBankName == '') {
			document.getElementById('error-studentBankName').innerHTML = "studentBankName Name cannot be blank";
			return false
		} else if (studentBankIfsc == '') {
			document.getElementById('error-studentBankIfsc').innerHTML = "studentBankIfsc Contact cannot be blank";
			return false
		} else if (studentBankAccNo == '') {
				document.getElementById('error-studentBankAccNo').innerHTML = "studentBankAccNo Contact cannot be blank";
				return false
		} else if (studentDob == '') {
				document.getElementById('error-studentDob').innerHTML = "studentDob Contact cannot be blank";
				return false
		} else {
			return true
		}

	};
	function checkPassword() {
		console.log('BYE');
		password1 = document.getElementById('set_pass').value;
		password2 = document.getElementById('conf_pass').value;

		if (password1 != password2) {
			document.getElementById('error-studentPassword').innerHTML = "Password does not match Confirm Password ";
			return false;
		} else {
			return true;
		}
	};

	function phoneNumber() {

		var test = /^\d{10}$/;
		var phoneNo = document.getElementById('contact_mobile').value;

		if (phoneNo.match(test)) {
			return true
		} else {
			document.getElementById('error-studentMobileNo').innerHTML = "Mobile Number 10 digtis only";
			return false
		}

	}
</script>
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

 

	<form action="/Scholarship/studRegister.nsp" modelAttribute = "regnow" method="post"> <!-- onsubmit="return (validate() && checkPassword()) && phoneNumber()" -->
		<h2 align="center">Fresh Student Application Form</h2>
		<div class="card-layout">
			<table id="table1" ; cellspacing="5px" cellpadding="5%"
				; align="center">
				<tr>
					<td align="right">State of Domicile :</td>
					<td><select id="input" name="studentDomicileState"
						onchange="optionCheck()">
							<option value="">------------Select State------------</option>
							<option value="Maharashtra">Maharashtra</option>
							<option value="Kerala">Kerala</option>
					</select></td>
				</tr>
				<tr>
					<td align="right">District:</td>
					<td><input id="studentDomicileDistrict" type="text"
						name="studentDomicileDistrict" style="width: 200px;"></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-studentDomicileDistrict"
							style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right">Name:</td>
					<td><input id="name" type="text" placeholder="AS IN MARKSHEET"
						name="studentName" style="width: 200px;"></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-name" style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right">Date Of Birth:</td>
					<td><input type="date" id="dob" name="studentDob"></td>
				</tr>
				<tr>
					<td align="right">Gender:</td>
					<td><select name="studentGender" style="width: 130px;">
							<option value="Male">Male</option>
							<option value="Female">Female</option>

					</select></td>
				</tr>
				<tr>
					<td align="right">Mobile Number:</td>
					<td><input type="number" style="width: 200px;"
						name="studentMobileNo" id="contact_mobile"></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-studentMobileNo" style="color: red;"></div></td>
				</tr>

				<tr>
					<td align="right">Email:</td>
					<td><input type="email" name="studentEmail"
						style="width: 200px;" id="contact_email" /></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-studentEmail" style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right">Institute Code:</td>
					<td><input type="text" style="width: 200px;"
						name="instituteCode" id="inst_code" /></td>
				</tr>
				  <tr>
					<td></td>
					<td><div id="error-instituteCode" style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right">Aadhar Number:</td>
					<td><input type="number" style="width: 200px;"
						name="studentAadharNo" id="aadhar_no" /></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-studentAadharNo" style="color: red;"></div></td>
				</tr>

				<tr>
					<td align="right">Bank IFSC Code:</td>
					<td><input type="text" style="width: 200px;"
						name="studentBankIfsc" id="bank_ifsc" /></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-studentBankIfsc" style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right">Bank Account Number:</td>
					<td><input type="number" style="width: 200px;"
						name="studentBankAccNo" id="acc_no" /></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-studentBankAccNo" style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right">Bank Name:</td>
					<td><input type="text" style="width: 200px;"
						name="studentBankName" id="bank" /></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-studentBankName" style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right">Set your Password:</td>
					<td><input type="password" style="width: 200px;"
						name="studentPassword" id="set_pass" /></td>
				</tr>
				<tr>
					<td></td>
					<td><div id="error-studentPassword" style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right">Confirm your Password:</td>
					<td><input type="password" style="width: 200px;"
						name="confpassword" id="conf_pass" />
				</tr>
				<tr>
					<td></td>
					<td><div id="error-confpassword" style="color: red;"></div></td>
				</tr>
				<tr>
					<td align="right"><input type="checkbox" value="confirm">
					</td>
					<td>ALL THE INFORMATION FURNISHED BY ME <br> IS TRUE TO
						BEST OF MY KNOWLEDGE.
					</td>
				</tr>
				
				<tr>
                    <td><input type="text" name="scheme_Id" value="0" hidden/></td>
                </tr>
				<tr>
                    <td><input type="text" name="status" value="PENDING" hidden/></td>
                </tr>

			</table>
			<div class="button-layout">
				<button id="submit" onclick="checkPassword()" type="submit">Submit</button>
				<button id="reset" type="reset">Reset</button>
			</div>
		</div>

	</form>


</body>
</html>