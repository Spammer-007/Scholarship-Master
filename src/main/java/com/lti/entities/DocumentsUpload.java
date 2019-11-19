package com.lti.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="DOCUMENTS_UPLOAD")
public class DocumentsUpload {
	@Id
	@GeneratedValue
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
	
	
	
	
	
	
}
