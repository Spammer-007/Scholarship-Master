package com.lti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.InstituteRegistration;
import com.lti.service.InstituteService;

@Controller
public class InstituteController {
	
	HttpSession session;
	
	@Autowired
	private InstituteService instService;
	
	@RequestMapping(path="/Scholarship/instRegister.nsp")
	public ModelAndView addinst(@ModelAttribute("regnow") InstituteRegistration institute ){
		System.out.println("adag");
		instService.addInstitute(institute);
		Map<String,Object>map=new HashMap<>();
		map.put("Id",institute.getInstituteCode());
		ModelAndView mv=new ModelAndView("confirmpage",map);
		return mv;

	}
	
	
	@RequestMapping("/InstRegister")
    public ModelAndView InstDetailsForm() {
        return new ModelAndView("instituteRegister", new HashMap<>());

	}
	
	@RequestMapping("/InstituteLogin")
    public ModelAndView instituteLogin() {
        return new ModelAndView("institutelogin", new HashMap<>());

	}
	
	@RequestMapping(path="/InstituteLogin.nsp")
	public ModelAndView instituteLogin(@RequestParam("instituteCode") String instituteCode, @RequestParam("password") String password, HttpServletRequest request ){
		boolean i=instService.checkLogin(Integer.parseInt(instituteCode), password);
		List list;
		/*
		 * Map<String,Object>map=new HashMap<>(); if(i) { map.put("Id",instituteCode); }
		 */
		ModelAndView mv=new ModelAndView("new_views/Institute Dashboard");
		ModelAndView mv2=new ModelAndView("#");

		if(i){
			session=request.getSession(true);
			list=instService.fetchByInstituteCode(Integer.parseInt(instituteCode));
			System.out.println(" Institute Login Success");
			return mv;
		}
		else{
			System.out.println("Institute Login Failed");
			return mv2;

		}
	}
	
	@RequestMapping("/instituteLogout")
    public ModelAndView studentLogout(HttpServletRequest request) {
		session=request.getSession(false);
		session.invalidate();
        return new ModelAndView("Homepage", new HashMap<>());

	}
}
