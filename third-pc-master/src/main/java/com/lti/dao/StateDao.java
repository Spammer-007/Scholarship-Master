package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.AdminMaster;
import com.lti.entity.StudentRegistration;

@Component
public class StateDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public int readLogin(String AdminId, String Password){
		String query = "Select s from AdminMaster as s where s.AdminId=:AdminId and s.Password=:Password";
		TypedQuery<AdminMaster> q1 = entityManager.createQuery(query, AdminMaster.class);
		q1.setParameter("AdminId", AdminId);
		q1.setParameter("Password", Password);
		List<AdminMaster> lists = q1.getResultList();
		
		return lists.size();

	}
}
