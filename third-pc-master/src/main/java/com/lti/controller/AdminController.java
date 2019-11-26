package com.lti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.service.StateService;

@Controller
public class AdminController {
	 private int i = 0;
	 
	 HttpSession session;
	    
	    @RequestMapping("/")
	    public ModelAndView index() {
	       return new ModelAndView("index",new HashMap<>());
	    }
	    
	    @RequestMapping("#")
	    public ModelAndView hellopage() {
	       return new ModelAndView("index",new HashMap<>());
	    }
	    
	    @RequestMapping("/StateLogin")
	    public ModelAndView StateDetailsForm() {
	        return new ModelAndView("StateLogin", new HashMap<>());
  
		}
		
		@Autowired
		private StateService stateService;
		
	    @RequestMapping("/StateLogin.nsp")
        //return new ModelAndView("StateLogin", new HashMap<>());
		public ModelAndView StateLogin(@RequestParam("AdminId") String AdminId, @RequestParam("Password") String Password, HttpServletRequest request ){
			boolean i=stateService.checkLogin(AdminId, Password);
			List list;
		/*
		 * Map<String,Object>map=new HashMap<>(); if(i) { map.put("Id",AdminId); }
		 */
			
			ModelAndView mv1=new ModelAndView("new_views/Ministry");
			ModelAndView mv2=new ModelAndView("new_views/StateNodalOfficer");
			ModelAndView mv=new ModelAndView("#");

			if(i){
				session=request.getSession(true);
				list=stateService.fetchByAdminId(AdminId);
				System.out.println(" STATE Login Success");
				if(AdminId.equalsIgnoreCase("ministry")) return mv1;
			/* if(AdminId.equalsIgnoreCase("stateoff")) */return mv2;
			}
			else{
				System.out.println("STATE Login Failed");
				return mv;

			}
		}
	    
	    @RequestMapping("/stateLogout")
	    public ModelAndView studentLogout(HttpServletRequest request) {
			session=request.getSession(false);
			session.invalidate();
	        return new ModelAndView("index", new HashMap<>());
  
		}
	    
	    @RequestMapping("/Ministry")
	    public ModelAndView Ministry() {
	       return new ModelAndView("new_views/Ministry",new HashMap<>());
	    }
	    
	    @RequestMapping("/StateNodalOfficer")
	    public ModelAndView StateNodalOfficer() {
	       return new ModelAndView("new_views/StateNodalOfficer",new HashMap<>());
	    }
	    
	    @RequestMapping("/adminLogout")
	    public ModelAndView adminLogout(HttpServletRequest request) {
			session=request.getSession(false);
			session.invalidate();
	        return new ModelAndView("index", new HashMap<>());
  
		}
	}


