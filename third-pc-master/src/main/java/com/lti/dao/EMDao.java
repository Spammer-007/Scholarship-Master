package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EMDao {
	@PersistenceContext
	private static EntityManager entityManager;

	public static EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
}
