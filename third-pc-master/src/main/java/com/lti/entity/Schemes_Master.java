package com.lti.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="SCHEMES_MASTER")
public class Schemes_Master {

	@Id
	private int scheme_Id;

	private String scheme_Name;
	
	private String scheme_Description;

	
	
	@OneToMany(mappedBy="schemeMaster", cascade=CascadeType.ALL)
	 private Set<ScholarshipBasic> scholarshipBasic = new HashSet<>();

	public Set<ScholarshipBasic> getScholarshipBasic() {
		return scholarshipBasic;
	}

	public void setScholarshipBasic(Set<ScholarshipBasic> scholarshipBasic) {
		this.scholarshipBasic = scholarshipBasic;
	}

	@OneToMany(mappedBy="schemeMast", cascade=CascadeType.ALL)
	 private Set<StudentRegistration> studentRegistration = new HashSet<>();
	
	public int getScheme_Id() {
		return scheme_Id;
	}
	
	public void setScheme_Id(int scheme_Id) {
		this.scheme_Id = scheme_Id;
	}

	public String getScheme_Name() {
		return scheme_Name;
	}

	public void setScheme_Name(String scheme_Name) {
		this.scheme_Name = scheme_Name;
	}

	public String getScheme_Description() {
		return scheme_Description;
	}

	public void setScheme_Description(String scheme_Description) {
		this.scheme_Description = scheme_Description;
	}
	
	public Set<StudentRegistration> getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(Set<StudentRegistration> studentRegistration) {
		this.studentRegistration = studentRegistration;
	}
	
	
}
