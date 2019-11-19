package com.lti.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SCHOLARSHIP_BASIC")
public class ScholarshipBasic {
	
	@Id
	@GeneratedValue
	private int stuFamId;
	
	//Get Aadhar card details from Student_Registration table
	//Choose Scheme needs to be chosen from Schemes_Master table 
	
	private String studentFatherName;
	
	private String studentMotherName;
	
	private String studentFamIncome;
	
	private String studentReligion;
	
	private String studentCaste;
	
	private String studentFatherProff;
	
	private String studentMotherProff;

	private String studentState;
	
	private String studentDistrict;
	
	private String studentBlock;
	
	private String studentTaluka;
	
    private String studentHouseNo; 
	
    private String studentStreetNo; 
	
	private int studentPincode;
	
	private String studentMaritalStatus;
	
	private String disability;
	
	private String percentageOfDisability;
	
	public String getPercentageOfDisability() {
		return percentageOfDisability;
	}

	public void setPercentageOfDisability(String percentageOfDisability) {
		this.percentageOfDisability = percentageOfDisability;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	@OneToOne
	@JoinColumn(name="studentId")
	private StudentRegistration studentRegistration;
	

	public int getStuFamId() {
		return stuFamId;
	}

	public void setStuFamId(int stuFamId) {
		this.stuFamId = stuFamId;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public String getStudentMotherName() {
		return studentMotherName;
	}

	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}

	public String getStudentFamIncome() {
		return studentFamIncome;
	}

	public void setStudentFamIncome(String studentFamIncome) {
		this.studentFamIncome = studentFamIncome;
	}

	public String getStudentReligion() {
		return studentReligion;
	}

	public void setStudentReligion(String studentReligion) {
		this.studentReligion = studentReligion;
	}

	public String getStudentCaste() {
		return studentCaste;
	}

	public void setStudentCaste(String studentCaste) {
		this.studentCaste = studentCaste;
	}

	public String getStudentFatherProff() {
		return studentFatherProff;
	}

	public void setStudentFatherProff(String studentFatherProff) {
		this.studentFatherProff = studentFatherProff;
	}

	public String getStudentMotherProff() {
		return studentMotherProff;
	}

	public void setStudentMotherProff(String studentMotherProff) {
		this.studentMotherProff = studentMotherProff;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getStudentDistrict() {
		return studentDistrict;
	}

	public void setStudentDistrict(String studentDistrict) {
		this.studentDistrict = studentDistrict;
	}

	public String getStudentBlock() {
		return studentBlock;
	}

	public void setStudentBlock(String studentBlock) {
		this.studentBlock = studentBlock;
	}

	public String getStudentTaluka() {
		return studentTaluka;
	}

	public void setStudentTaluka(String studentTaluka) {
		this.studentTaluka = studentTaluka;
	}

	public String getStudentHouseNo() {
		return studentHouseNo;
	}

	public void setStudentHouseNo(String studentHouseNo) {
		this.studentHouseNo = studentHouseNo;
	}

	public String getStudentStreetNo() {
		return studentStreetNo;
	}

	public void setStudentStreetNo(String studentStreetNo) {
		this.studentStreetNo = studentStreetNo;
	}

	public int getStudentPincode() {
		return studentPincode;
	}

	public void setStudentPincode(int studentPincode) {
		this.studentPincode = studentPincode;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}
	
	public String getStudentMaritalStatus() {
		return studentMaritalStatus;
	}

	public void setStudentMaritalStatus(String studentMaritalStatus) {
		this.studentMaritalStatus = studentMaritalStatus;
	}
	
	
	
	
	
}
