package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SCHOLARSHIP_STUDENT_STATUS")
public class ScholarshipStudentStatus {
	
	@Id
	@GeneratedValue
	private int schStudStatusId;
	
	private String status;
	
	private int studentId;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getSchStudStatusId() {
		return schStudStatusId;
	}

	public void setSchStudStatusId(int schStudStatusId) {
		this.schStudStatusId = schStudStatusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
