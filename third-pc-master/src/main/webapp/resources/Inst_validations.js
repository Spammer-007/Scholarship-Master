function validate() {
		console.log("HELLO")
		var insitituteCode = document.getElementById('insitituteCode').value;//
		var instCategory = document.getElementyId('instCategory').value;//
		var name = document.getElementById('name').value;//
		var state = document.getElementyId('state').value;//
		var password = document.getElementById('password').value;//
		var diseCode = document.getElementById('diseCode').value;//
		var district = document.getElementById('district').value;//
		var category = document.getElementById('category').value;
		var location = document.getElementById('location').value;//
		var address = document.getElementById('address').value;//
		var pincode = document.getElementById('pincode').value;//
		var principalName = document.getElementById('principalName').value;//
		var affUniversity = document.getElementById('affUniversity').value;//
		var admissionStartYear = document.getElementById('admissionStartYear').value;

		if (insitituteCode == '') {
			document.getElementById('error-insitituteCode').innerHTML = "insitituteCode cannot be blank";
			return false
		} else if (instCategory == '') {
			document.getElementById('error-instCategory').innerHTML = "instCategory cannot be blank";
		} else if (code == '') {
			document.getElementById('error-code').innerHTML = "code cannot be blank";
			return false
		} else if (name == '') {
			document.getElementById('error-name').innerHTML = "name cannot be blank";
			return false
		} else if (state == '') {
			document.getElementById('error-state ').innerHTML = "state cannot be blank";
			return false
		} else if (password == '') {
			document.getElementById('error-password').innerHTML = "password cannot be blank";
			return false
		} else if (diseCode == '') {
			document.getElementById('error-diseCode').innerHTML = "diseCode cannot be blank";
			return false
		} else if (district == '') {
			document.getElementById('error-district').innerHTML = "district cannot be blank";
			return false
		} else if (category == '') {
			document.getElementById('error-category').innerHTML = "category cannot be blank";
			return false
		} else if (location == '') {
			document.getElementById('error-location').innerHTML = "location cannot be blank";
			return false
		} else if (address == '') {
			document.getElementById('error-address').innerHTML = "address cannot be blank";
			return false
			
		} else if (pincode == '') {
			document.getElementById('error-pincode').innerHTML = "pincode cannot be blank";
			return false

		} else if (principalName == '') {
			document.getElementById('error-principalName').innerHTML = "principalName cannot be blank";
			return false
			
		} else if (instType == '') {
			document.getElementById('error-instType').innerHTML = "instType cannot be blank";
			return false
			
		} else if (affUniversity == '') {
			document.getElementById('error-affUniversity').innerHTML = "affUniversity cannot be blank";
			return false
			
		}  else if (admissionStartYear == '') {
			document.getElementById('error-admissionStartYear').innerHTML = "admissionStartYear cannot be blank";
			return false 
		}else {
			return true
		}

	}