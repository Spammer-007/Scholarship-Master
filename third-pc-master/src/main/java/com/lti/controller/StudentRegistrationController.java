package com.lti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.InstituteRegistration;
import com.lti.entity.ScholarshipBasic;
import com.lti.entity.StudentRegistration;
import com.lti.service.InstituteService;
import com.lti.service.StudentService;
import com.lti.service.StateService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

		@Controller
		public class StudentRegistrationController {
			public int studentId;

			HttpSession session;
	    
			@Autowired
			private StudentService studService;
			
			@RequestMapping(path="/Scholarship/studRegister.nsp")
			public ModelAndView addStudent(@ModelAttribute("regnow") StudentRegistration student ){
		
				studService.addStudent(student);
				
				ModelAndView mv=new ModelAndView("confirmpage","Id",student.getStudentId());
				return mv;
			}
			
			
			@RequestMapping("/StudRegister")
		    public ModelAndView StudDetailsForm() {
		        return new ModelAndView("studentRegister", new HashMap<>());
	  
			}
			
			
			@RequestMapping("/log-in.nsp")
		    public ModelAndView logintoform() {
		        return new ModelAndView("index", new HashMap<>()); 
	  
			}
			
			

			@RequestMapping("/ministryLogin")
		    public ModelAndView ministryLogin() {
		        return new ModelAndView("ministryLogin", new HashMap<>());
	  
			}
			
			@RequestMapping("/userdetails")
		    public ModelAndView viewDetails() {
		        return new ModelAndView("userdetails", new HashMap<>());
	  
			}
			@SuppressWarnings("unchecked")
			@RequestMapping(path="/studentlogin")
			public ModelAndView instituteLogin(@RequestParam("studentId") String studentId, @RequestParam("studentPassword") String studentPassword, HttpServletRequest request ){
				List<StudentRegistration> list;
				boolean i=studService.checkLogin(Integer.parseInt(studentId), studentPassword);
				
				ModelAndView mv=new ModelAndView("StudentDashboard");
				ModelAndView mv2=new ModelAndView("#");

				if(i){
					session=request.getSession(true);
					list=studService.fetchByStudentId(Integer.parseInt(studentId));
					session.setAttribute("studentId", list.get(0).getStudentId());
					System.out.println("Student id " +studentId+ " just logged in");
					return mv;
				}
				else{
					System.out.println("Student id" +studentId+ "Login Failed");
					return mv2;

				}
			}
			
			@RequestMapping("/studentLogout")
		    public ModelAndView studentLogout(HttpServletRequest request) {
				session=request.getSession(false);
				session.invalidate();
		        return new ModelAndView("Homepage", new HashMap<>());
	  
			}
			
		}
		

	   