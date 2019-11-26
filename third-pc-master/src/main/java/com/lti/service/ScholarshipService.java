package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.GenericDao;
import com.lti.dao.StudentDao;
import com.lti.entity.AcademicDetails;
import com.lti.entity.DocumentsUpload;
import com.lti.entity.ScholarshipBasic;
import com.lti.entity.StudentMarks10;
import com.lti.entity.StudentMarks12;

@Service
public class ScholarshipService {
	
	
	@Autowired
	private GenericDao genericDao;
	
	@Autowired
	private StudentDao studentDao;
	
	public void addScholarshipBasic(ScholarshipBasic scholarshipBasic) {
		genericDao.upsert(scholarshipBasic);
	}

	public void addAcademic(AcademicDetails academicDetails) {
		
		genericDao.upsert(academicDetails);
	}

	public void addMarks10(StudentMarks10 studentMarks10) {
			
		genericDao.upsert(studentMarks10);
		
	}

	public void addMarks12(StudentMarks12 studentMarks12) {

		genericDao.upsert(studentMarks12);
		
	}

	public void addDocuments(DocumentsUpload documentsUpload) {
		
		genericDao.upsert(documentsUpload);
		
	}

}
