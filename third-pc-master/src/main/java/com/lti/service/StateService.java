package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.GenericDao;
import com.lti.dao.StateDao;

@Service
public class StateService {
	
	@Autowired
	private GenericDao genericDao;
	
	
	@Autowired
	private StateDao statedao;
	
	
	public boolean checkLogin(String AdminId, String Password) {
		int result=statedao.readLogin(AdminId, Password);
	
	if(result==1){
		
		return true;
	}
	else 
		return false;
}


	public List fetchByAdminId(String AdminId) {
		List list=genericDao.fetchByAdminId(AdminId);
		return list;
	}

}
