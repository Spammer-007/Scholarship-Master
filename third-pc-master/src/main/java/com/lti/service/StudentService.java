package com.lti.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.GenericDao;
import com.lti.dao.StudentDao;
import com.lti.entity.InstituteRegistration;
import com.lti.entity.ScholarshipBasic;
import com.lti.entity.StudentRegistration;

@Service
public class StudentService {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private GenericDao genericDao;
	
	@Autowired
	private StudentDao studentDao;
	
	
	public void addStudent(StudentRegistration st){
		genericDao.upsert(st);
		
	}

	public boolean checkLogin(int studentId, String studentPassword) {
		
			int result=studentDao.readLogin(studentId, studentPassword);
		
		if(result==1){
			return true;
		}
		else 
			return false;
	}
	
	@SuppressWarnings("unchecked")								//used in student lOgin
	public List fetchByStudentId(int studentId){
			List list=genericDao.fetchByStudentId(studentId);
			return list;
	   	 }

	public int pullSchemeId(int studentId) {
		return studentDao.pullSchemeId(studentId);
	}

	public void addSchemeId(int studentId,int scheme_Id) {
		studentDao.addSchemeId(studentId, scheme_Id);
	}

	public StudentRegistration findUserById(int id) {
		StudentRegistration user= studentDao.findUserById(id);
	       return user;
	    }
	
	/*public List readStudentDetails(int studentId) {								under Fetching
		return studentDao.readStudentDetails(studentId);
	}
	public List findUsers() {
		List users= studentDao.findUsers();
	       return users;
	}*/

}
