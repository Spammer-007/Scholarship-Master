package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@SequenceGenerator(name = "docsseq", sequenceName = "docsseq", initialValue = 1, allocationSize = 100)
@Table(name="DOCUMENTS_UPLOAD")
public class DocumentsUpload {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "docsseq")
	private int documentID;
	
	private String domicileCertificate;
	
	private String studentPhotograph;
	
	private String instituteIDCard;
	
	private String casteIncomeCertificate;
	
	private String previousYearMarksheet;
	
	private String currentYearFeeReceipt;
	
	private String bankPassbook;
	
	private String aadharCard;
	
	private String tenMarksheet;
	
	private String twelveMarksheet;
	
	private int studentId;
	
	@OneToOne
	@JoinColumn(name="studentId", insertable = false, updatable = false)
	private StudentRegistration studentRegistration;

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	public int getDocumentID() {
		return documentID;
	}

	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}

	public String getDomicileCertificate() {
		return domicileCertificate;
	}

	public void setDomicileCertificate(String domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}

	public String getStudentPhotograph() {
		return studentPhotograph;
	}

	public void setStudentPhotograph(String studentPhotograph) {
		this.studentPhotograph = studentPhotograph;
	}

	public String getInstituteIDCard() {
		return instituteIDCard;
	}

	public void setInstituteIDCard(String instituteIDCard) {
		this.instituteIDCard = instituteIDCard;
	}

	public String getCasteIncomeCertificate() {
		return casteIncomeCertificate;
	}

	public void setCasteIncomeCertificate(String casteIncomeCertificate) {
		this.casteIncomeCertificate = casteIncomeCertificate;
	}

	public String getPreviousYearMarksheet() {
		return previousYearMarksheet;
	}

	public void setPreviousYearMarksheet(String previousYearMarksheet) {
		this.previousYearMarksheet = previousYearMarksheet;
	}

	public String getCurrentYearFeeReceipt() {
		return currentYearFeeReceipt;
	}

	public void setCurrentYearFeeReceipt(String currentYearFeeReceipt) {
		this.currentYearFeeReceipt = currentYearFeeReceipt;
	}

	public String getBankPassbook() {
		return bankPassbook;
	}

	public void setBankPassbook(String bankPassbook) {
		this.bankPassbook = bankPassbook;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getTenMarksheet() {
		return tenMarksheet;
	}

	public void setTenMarksheet(String tenMarksheet) {
		this.tenMarksheet = tenMarksheet;
	}

	public String getTwelveMarksheet() {
		return twelveMarksheet;
	}

	public void setTwelveMarksheet(String twelveMarksheet) {
		this.twelveMarksheet = twelveMarksheet;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	
	
	
	
	
	
}
