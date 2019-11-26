package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "scholarseq", sequenceName = "scholarseq12", initialValue = 1, allocationSize = 100)
@Table(name="SCHOLARSHIP_BASIC")
public class ScholarshipBasic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scholarseq")
	private int stuFamId;
	
	private String studentFatherName;
	
	private String studentMotherName;
	
	private String studentFamIncome;
	
	private String studentReligion;
	
	private String studentCategory;
	

	private String studentState;
	
	private String studentDistrict;
	
	private String studentTaluka;
	
    private String studentHouseNo; 
	
    private String studentStreetNo; 
	
	private int studentPincode;
	
	private String disability;
	
	private String TypeofDisability;
	
	private String percentageOfDisability;
	
	private int studentId;
	
	//private String scheme_Name;
	
	private int scheme_Id; 
	
	@ManyToOne
	@JoinColumn(name="scheme_Id",insertable=false,updatable=false)
	private Schemes_Master schemeMaster;
	
	
	public Schemes_Master getSchemeMaster() {
		return schemeMaster;
	}

	public void setSchemeMaster(Schemes_Master schemeMaster) {
		this.schemeMaster = schemeMaster;
	}

	@OneToOne
	@JoinColumn(name="studentId",insertable=false,updatable=false)
	private StudentRegistration studentRegistration;
	
	
	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

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

	public String getStudentCategory() {
		return studentCategory;
	}

	public void setStudentCategory(String studentCategory) {
		this.studentCategory = studentCategory;
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
	
	
	public String getTypeofDisability() {
		return TypeofDisability;
	}

	public void setTypeofDisability(String typeofDisability) {
		TypeofDisability = typeofDisability;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getScheme_Id() {
		return scheme_Id;
	}

	public void setScheme_Id(int scheme_Id) {
		this.scheme_Id = scheme_Id;
	}

	/* public String getScheme_Name() {
		return scheme_Name;
	}

	public void setScheme_Name(String scheme_Name) {
		this.scheme_Name = scheme_Name;
	} */
	
	
	
}
