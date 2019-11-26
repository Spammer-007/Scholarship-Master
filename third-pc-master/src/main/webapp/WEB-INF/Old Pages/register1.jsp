<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: black;
}

* {
	box-sizing: border-box;
}
/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
}
/* Full-width input fields */
input[type=text], input[type=password] {
	width: 30%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}
/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}
/* Set a style for the submit button */
.registerbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}
/* Add a blue text color to links */
a {
	color: dodgerblue;
}
/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>

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
			document.getElementById('error-studentId').innerHTML = "studentId cannot be blank";
			return false
		} else if (studentAadharNo == '') {
			document.getElementById('error-studentAadharNo').innerHTML = "studentAadharNo cannot be blank";
		} else if (studentName == '') {
			document.getElementById('error-studentName').innerHTML = "studentName Code cannot be blank";
			return false
		} else if (studentGender == '') {
			document.getElementById('error-studentGender').innerHTML = "studentGender Code cannot be blank";
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
</script>
</head>

<body>
<center><img align="middle" alt="logo" src="/images/logo.jpg"/></center>
	<form action="register.nsp" method="post" onsubmit="return validate() ">
		<div class="container">
			

			<nav id="navbar">
				<a href="index.jsp" class="menu">HOME</a> <a href="#" class="menu">ABOUT
					US</a> <a href="index.jsp" class="menu">CONTACT US</a>
			</nav>

			<center>
				<h1>Fresh Student Registration Form</h1>
			</center>

			<h4>State Of Domicile</h4>
			<div class="dropdown">
				<select>
					<option value="rajasthan">Rajasthan</option>
					<option value="karnataka">Karnataka</option>
					<option value="maharashtra">Maharashtra</option>
					<option value="chennai">Chennai</option>
				</select>
			</div>

			<h4>Gender</h4>
			<div class="dropdown">
				<select>
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="others">Others</option>
				</select>
			</div>

			<br>
			<br>
			<br> <label for="name"><b>Name</b></label> <input type="text"
				placeholder="Enter Name" name="name" requiredwidth: 10px;>

			<br> <label for="emailid"><b>Email ID</b></label> <input
				type="text" placeholder="Enter Email ID" name="emailid" required>

			<label for="institutecode"><b>Institute Code</b></label> <input
				type="text" placeholder="Institute Code" name="institutecode"
				required> <br> <label for="aadharno"><b>Aadhar
					Number</b></label> <input type="text" placeholder="Aadhar Number"
				name="aadharno" required> <label for="bankifsc"><b>Bank
					IFSC</b></label> <input type="text" placeholder="Bank IFSC" name="bankifsc"
				required> <br> <label for="bankaccno"><b>Bank
					Account Number</b></label> <input type="text" placeholder="Bank Account Number"
				name="bankaccno" required> <label for="bankname"><b>Bank
					Name</b></label> <input type="text" size="30" placeholder="Bank Name"
				name="bankname" required> <br> <label for="pass"><b>Set
					Password</b></label> <input type="password" placeholder="Set Password"
				name="pass" required> <label for="cnfpass"><b>Confirm
					Password</b></label> <input align="right" type="password" size="30"
				placeholder="Confirm Password" name="cnfpass" required> <br>
			<br>
			<br> <input type="checkbox" name="selected"
				value="${studentinfo.studentreginfo}">All the above
			information is furnished by me is correct and is true by my knowledge<br>

			<br>
			<br>
			<br>
			<center>
				<button style="width: 150px; height: 50px;" type="submit"
					class="registerbtn">Register</button>
				<button style="width: 150px; height: 50px;" type="reset"
					class="registerbtn">Reset</button>
			</center>
			
		</div>
	</form>

</body>
</html>