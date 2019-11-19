package com.lti.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="INSTITUTE_REGISTRATION")
public class InstituteRegistration {
	
	@Id
	@GeneratedValue
	private long instituteCode;
	
	private String instCategory;
	
	private long code;
	
	private String name;
	
	private String state;
	
	private String uniBoardName;
	
	private String password;
	
	private String discCode;
	
	private String district;
	
	private String category;
	
	private String location;
	
	private String address;
	
	private long pincode;
	
	private String principalName;
	
	private long contactNo;
	
	private String instType;
	
	private String affUniversity;
	
	private int admissionStartYear;
	
	
	
	
	public String getInstCategory() {
		return instCategory;
	}

	public void setInstCategory(String instCategory) {
		this.instCategory = instCategory;
	}


	public long getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(long instituteCode) {
		this.instituteCode = instituteCode;
	}
	
	@OneToMany(mappedBy="instituteRegistration")
    private Set<StudentRegistration> studentRegistration;

	
	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getUniBoardName() {
		return uniBoardName;
	}

	public void setUniBoardName(String uniBoardName) {
		this.uniBoardName = uniBoardName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDiscCode() {
		return discCode;
	}

	public void setDiscCode(String discCode) {
		this.discCode = discCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
