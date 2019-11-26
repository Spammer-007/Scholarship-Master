<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Institute Registration</title>
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
	<div class=" container">
		<form action="/Scholarship/instRegister.nsp" modelAttribute = "regnow" method="post"> <!--onsubmit="return validate()"-->
			<h2 align="center">Institute Registration Request Form</h2>
			<div class="card-layout">
				<table id="table1" cellspacing="5px" cellpadding="5%" align="center">
					<tr>
						<td align="right">Institute Category :</td>
						<td><select class="card" name="instCategory">
								<option value="">------------Select Institute
									Category------------</option>
								<option value="Autonomous">Autonomous</option>
								<option value="Non-Autonomous">Non-Autonomous</option>
								<option value="Aided">Aided</option>
								<option value="Un-Aided">Un-Aided</option>
						</select></td>
					</tr>
					<tr>
						<td align="right">Name:</td>
						<td><input id="name" type="text" name="name"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-name" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">State :</td>
						<td><select id="input" name="state" onchange="optionCheck()">
								<option value="">------------Select State------------</option>
								<option value="Andaman and Nicobar Islands">Andaman and
									Nicobar Islands</option>
								<option value="Karnataka">Karnataka</option>
								<option value="Kerala">Kerala</option>
								<option value="Lakshadweep">Lakshadweep</option>
								<option value="Madhya Pradesh">Madhya Pradesh</option>
								<option value="Maharashtra">Maharashtra</option>
								<option value="Manipur">Manipur</option>
						</select></td>
					</tr>
					<tr>
						<td align="right">District</td>
						<td><input type="text" id="district" name="district"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-district" style="color: red;"></div></td>
					</tr>
					<!--  <tr>
						<td align="right">Institute Code:</td>
						<td><input id="instituteCode" type="text" name="instituteCode"
							style="width: 200px;"></td>
					</tr>-->
					<tr>
						<td></td>
						<td><div id="error-instituteCode" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">DISE Code:</td>
						<td><input id="diseCode" type="text" name="discCode"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-diseCode" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">Location :</td>
						<td><select id="instituteLocation" name="location"
							onchange="optionCheck()">
								<option value="">------------Select
									Location------------</option>
								<option value="Urban">Urban</option>
								<option value="Rural">Rural</option>
						</select></td>
					</tr>
					<tr>
						<td align="right">Admission Start Year</td>
						<td><input id="admissionStartYear" type="text" name="admissionStartYear"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-admissionStartYear" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">Affiliated University/Board Name:</td>
						<td><input id="affUniversity" type="text" name="affUniversity"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-affUniversity" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">Set your Password:</td>
						<td><input type="password" style="width: 200px;" name="password"
							id="Password" /></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-password" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">Confirm your Password:</td>
						<td><input type="password" style="width: 200px;"
							name="confPassword" id="confPassword" />
					</tr>
					<tr>
						<td></td>
						<td><div id="error-confPassword" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">Address:</td>
						<td><input id="address" type="text" name="address"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-address" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">Pincode:</td>
						<td><input id="pincode" type="text" name="pincode"
							style="width: 200px;"></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-pincode" style="color: red;"></div></td>
					</tr>
					<tr>
						<td align="right">Principal Name:</td>
						<td><input id="principalName" type="text"
							name="principalName" style="width: 200px;"></td>
					</tr>
					<tr>
						<td></td>
						<td><div id="error-principalName" style="color: red;"></div></td>
					</tr>
					
					
					<tr>
						<td align="right"><input type="checkbox" value="confirm">
						</td>
						<td>ALL THE INFORMATION FURNISHED BY ME <br> IS TRUE TO
							BEST OF MY KNOWLEDGE.
						</td>
					</tr>
				</table>
				<div class="button-layout">
					<button id="submit" type="submit">Submit</button>
					<button id="reset" type="reset">Reset</button>
				</div>
				<tr>
                    <td><input type="text" name="status" value="PENDING" hidden/></td>
                </tr>
			</div>
		</form>
	</div>
</body>
</html>