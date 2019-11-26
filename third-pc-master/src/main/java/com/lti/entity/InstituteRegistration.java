package com.lti.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

@Entity
@SequenceGenerator(name="instseq", sequenceName="instseq12s", initialValue=1, allocationSize=150)
@Table(name="INSTITUTE_REGISTRATION")
public class InstituteRegistration {
	

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="instseq")
	private int instituteCode;
	
	private String instCategory;
	
	private String name;
	
	private String state;
	
	private String password;
	
	private String discCode;
	
	private String district;
	
	private String category;
	
	private String location;
	
	private String address;
	
	private long pincode;
	
	private String principalName;
	
	private long contactNo;
	
	private String affUniversity;
	
	private int admissionStartYear;
	
	private String status;
	


	public String getAffUniversity() {
		return affUniversity;
	}

	public void setAffUniversity(String affUniversity) {
		this.affUniversity = affUniversity;
	}

	public int getAdmissionStartYear() {
		return admissionStartYear;
	}

	public void setAdmissionStartYear(int admissionStartYear) {
		this.admissionStartYear = admissionStartYear;
	}

	public String getInstCategory() {
		return instCategory;
	}

	public void setInstCategory(String instCategory) {
		this.instCategory = instCategory;
	}

	
	public int getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}




	@OneToMany(mappedBy="instRegist", cascade=CascadeType.ALL)
	 private Set<StudentRegistration> studentRegistration = new HashSet<>();
	 

	

	public Set<StudentRegistration> getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(Set<StudentRegistration> studentRegistration) {
		this.studentRegistration = studentRegistration;
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
	
	public void addStudent(StudentRegistration student) {
		student.setInstRegist(this);	//avoids nested cascade
		this.getStudentRegistration().add(student);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
