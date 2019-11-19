package com.lti.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

@Entity
@Table(name="STUDENT_REGISTRATION")
public class StudentRegistration {

	@Id
	@GeneratedValue
	private int studentId;
	
	private long studentAadharNo;
	
	private String studentName;
	
	private String studentGender;
	
	private long studentMobileNo;
	
	private String studentEmail;
	
	private String studentDomicileState;	
	
	private String studentDomicileDistrict;

	private String studentPassword;
	
	private String studentBankName;
	
	private String studentBankIfsc;
	
	private long studentBankAccNo;
	
	private String studentDob;
	
	//@OneToOne(mappedBy="studentRegistration", optional=false)
	//private StudentMarks10 studentMarks10;
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public long getStudentAadharNo() {
		return studentAadharNo;
	}

	public void setStudentAadharNo(long studentAadharNo) {
		this.studentAadharNo = studentAadharNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(long studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentDomicileState() {
		return studentDomicileState;
	}

	public void setStudentDomicileState(String studentDomicileState) {
		this.studentDomicileState = studentDomicileState;
	}

	public String getStudentDomicileDistrict() {
		return studentDomicileDistrict;
	}

	public void setStudentDomicileDistrict(String studentDomicileDistrict) {
		this.studentDomicileDistrict = studentDomicileDistrict;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getStudentBankName() {
		return studentBankName;
	}

	public void setStudentBankName(String studentBankName) {
		this.studentBankName = studentBankName;
	}

	public String getStudentBankIfsc() {
		return studentBankIfsc;
	}

	public void setStudentBankIfsc(String studentBankIfsc) {
		this.studentBankIfsc = studentBankIfsc;
	}

	public long getStudentBankAccNo() {
		return studentBankAccNo;
	}

	public void setStudentBankAccNo(long studentBankAccNo) {
		this.studentBankAccNo = studentBankAccNo;
	}
	
	@ManyToOne
    @JoinColumn(name="instituteCode", nullable=false)
    private InstituteRegistration instituteRegistration;

	public String getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(String localDate) {
		this.studentDob = localDate;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	/*public StudentMarks10 getStudentMarks10() {
		return studentMarks10;
	}

	public void setStudentMarks10(StudentMarks10 studentMarks10) {
		this.studentMarks10 = studentMarks10;
	}*/
	
	
	
	
}
