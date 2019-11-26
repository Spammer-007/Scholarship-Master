package com.lti.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import com.lti.dao.EMDao;

@Entity
@SequenceGenerator(name = "registerseq", sequenceName = "studseq12", initialValue = 1, allocationSize = 100)
@Table(name = "STUDENT_REGISTRATION")
public class StudentRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "registerseq")
	private int studentId;

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

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

	private int instituteCode;

	private String status;
	
	private int scheme_Id;
	
	
	@OneToOne(mappedBy="studentRegistration")
	private AcademicDetails AcademicDetails;
	
	@OneToOne(mappedBy="studentRegistration")
	private ScholarshipBasic ScholarshipBasic;
	
	@OneToOne(mappedBy="studentRegistration")
	private StudentMarks10 StudentMarks10;
	
	@OneToOne(mappedBy="studentRegistration")
	private StudentMarks12 StudentMarks12;
	
	@OneToOne(mappedBy="studentRegistration")
	private DocumentsUpload DocumentsUpload;

	
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="instituteCode",referencedColumnName="instituteCode", insertable=false, updatable=false)
	 private InstituteRegistration instRegist;
	 
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="scheme_Id",referencedColumnName="scheme_Id", insertable=false, updatable=false)
	 private Schemes_Master schemeMast;
	 
	 

	public int getInstituteCode() {
		return instituteCode;
	}
	

	public void setInstituteCode(int instituteCode) {
		
		this.instituteCode=instituteCode;
	
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

	
	
	public InstituteRegistration getInstRegist() {
		return instRegist;
	}

	public void setInstRegist(InstituteRegistration instRegist) {
		this.instRegist = instRegist;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public int getScheme_Id() {
		return scheme_Id;
	}


	public void setScheme_Id(int scheme_Id) {
		this.scheme_Id = scheme_Id;
	}

}
