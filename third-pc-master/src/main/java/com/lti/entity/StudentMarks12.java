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

@Entity
@SequenceGenerator(name = "twelveseq", sequenceName = "twelveseq", initialValue = 1, allocationSize = 100)
@Table(name="STUDENTMARKS_12")
public class StudentMarks12 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "twelveseq")
	private int student12Id;
	
	private String rollnumber;
	
	private String boardname;
	
	private int passingyear;
	
	private double percentage;
	
	private int studentId;
	

	@OneToOne
	@JoinColumn(name="studentId", insertable = false, updatable = false)
	private StudentRegistration studentRegistration;

	public int getStudent12Id() {
		return student12Id;
	}

	public void setStudent12Id(int student12Id) {
		this.student12Id = student12Id;
	}

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getBoardname() {
		return boardname;
	}

	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}

	public int getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	
}
