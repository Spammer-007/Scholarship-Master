package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.lti.controller.List;
import java.util.List; 

import com.lti.dao.GenericDao;
import com.lti.dao.InstituteDao;
import com.lti.entity.InstituteRegistration;
import com.lti.entity.StudentRegistration;

@Service
public class InstituteService {

	@Autowired
	private GenericDao instituteRegistrationDao;
	
	@Autowired
	private InstituteDao instituteDao;
	
	public void addInstitute(InstituteRegistration inst){
		instituteRegistrationDao.upsert(inst);
		
	}
	public boolean checkLogin(int instituteCode, String password) {
		int result=instituteDao.readLogin(instituteCode, password);
	
	if(result==1){
		
		return true;
	}
	else 
		return false;
}
	public List fetchByInstituteCode(int instituteCode) {
		List list=instituteRegistrationDao.fetchByInstituteCode(instituteCode);
		return list;
	}


}