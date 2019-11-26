package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.InstituteRegistration;
import com.lti.entity.StudentRegistration;;

@Component
public class InstituteDao{
	
	@PersistenceContext
	private EntityManager entityManager;


	@Transactional
	public List <StudentRegistration> fetchStudentByInstituteCode(int i){
		
		String ql="select s from StudentReg as s where s.institute=:inst";
		Query q =entityManager.createQuery(ql);
		
		q.setParameter("inst", i);

		List <StudentRegistration> students = q.getResultList();
		return students;
	}
	 
	@Transactional
	public List<InstituteRegistration> getinsdetail(){
	
		String ql="select i from Institute i";
		Query q =entityManager.createQuery(ql);
		
		List<InstituteRegistration> obj = q.getResultList();
				return obj;
		
	}
	
	@Transactional
	public int readLogin(int instituteCode, String password){
		//System.out.println("Here");
		String query = "Select s from InstituteRegistration as s where s.instituteCode=:instituteCode and s.password=:password";
		TypedQuery<InstituteRegistration> q1 = entityManager.createQuery(query, InstituteRegistration.class);
		q1.setParameter("instituteCode", instituteCode);
		q1.setParameter("password", password);
		List<InstituteRegistration> lists = q1.getResultList();
		
		return lists.size();
		
}
	
}