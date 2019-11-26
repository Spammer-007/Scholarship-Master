package com.lti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

@Entity
@SequenceGenerator(name = "academicseq", sequenceName = "academicseq", initialValue = 1, allocationSize = 100)
@Table(name="ACADEMIC_DETAILS")
public class AcademicDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "academicseq")
	private int academicDetailsId;
	
	private String instituteName;
	
	private String presentClass;
	
	private int presentClassYear;
	
	private String modeOfStudy;
	
	private String universityBoardName;
	
	private String previousClass;
	
	private int previousPassingYear;
	
    private double previousPassingPercentage;
	
	private double admissionFee;
	
	private double tutionFee;
	
	private double otherFee;
	
	private int studentId;
	
	

	@OneToOne
	@JoinColumn(name="studentId", insertable = false, updatable = false)
	private StudentRegistration studentRegistration;
	
	public int getAcademicDetailsId() {
		return academicDetailsId;
	}

	public void setAcademicDetailsId(int studOtherDetailsId) {
		this.academicDetailsId = studOtherDetailsId;
	}

	public double getPreviousPassingPercentage() {
		return previousPassingPercentage;
	}

	public void setPreviousPassingPercentage(double previousPassingPercentage) {
		this.previousPassingPercentage = previousPassingPercentage;
	}

	public String getPresentClass() {
		return presentClass;
	}

	public void setPresentClass(String presentClass) {
		this.presentClass = presentClass;
	}

	public int getPresentClassYear() {
		return presentClassYear;
	}

	public void setPresentClassYear(int presentClassYear) {
		this.presentClassYear = presentClassYear;
	}

	public String getModeOfStudy() {
		return modeOfStudy;
	}

	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}

	public String getUniversityBoardName() {
		return universityBoardName;
	}

	public void setUniversityBoardName(String universityBoardName) {
		this.universityBoardName = universityBoardName;
	}

	public String getPreviousClass() {
		return previousClass;
	}

	public void setPreviousClass(String previousClass) {
		this.previousClass = previousClass;
	}

	public int getPreviousPassingYear() {
		return previousPassingYear;
	}

	public void setPreviousPassingYear(int previousPassingYear) {
		this.previousPassingYear = previousPassingYear;
	}

	

	public double getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}

	public double getTutionFee() {
		return tutionFee;
	}

	public void setTutionFee(double tutionFee) {
		this.tutionFee = tutionFee;
	}

	public double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}

	
	 public StudentRegistration getStudentRegistration() {
		 return  studentRegistration; 
	}
 
	 public void setStudentRegistration(StudentRegistration studentRegistration) {
		 	this.studentRegistration = studentRegistration; 
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
}
