package com.lti.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.StudentRegistration;;

@Component
public class StudentDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public int readLogin(int studentId, String studentPassword){
		//System.out.println("Here");
		String query = "Select s from StudentRegistration as s where s.studentId=:studentId and s.studentPassword=:password";
		TypedQuery<StudentRegistration> q1 = entityManager.createQuery(query, StudentRegistration.class);
		q1.setParameter("studentId", studentId);
		q1.setParameter("password", studentPassword);
		List<StudentRegistration> lists = q1.getResultList();
		
		return lists.size();
		}
	
	@Transactional
	public int pullSchemeId(int studentId) {
		String query = "Select s.scheme_Id from ScholarshipBasic as s where s.studentId=:studentId";
		TypedQuery<Integer> q1 = entityManager.createQuery(query, Integer.class);
		q1.setParameter("studentId", studentId); 
		int schemeId = q1.getSingleResult();
		return schemeId;
	}
	@Transactional
	public void addSchemeId(int studentId,int scheme_Id) {
		Query query = entityManager.createQuery("UPDATE StudentRegistration s SET s.scheme_Id=:scheme_Id where s.studentId=:studentId");	
		query.setParameter("scheme_Id", scheme_Id);
		query.setParameter("studentId", studentId);
		query.executeUpdate();
		//entityManager.getTransaction().commit();
		//entityManager.close();
	}

}
