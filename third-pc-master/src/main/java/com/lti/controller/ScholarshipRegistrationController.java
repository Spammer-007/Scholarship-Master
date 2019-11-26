package com.lti.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.ScholarshipBasic;

import com.lti.entity.StudentMarks10;
import com.lti.entity.StudentMarks12;
import com.lti.entity.DocumentsUpload;
import com.lti.entity.StudentRegistration;
import com.lti.entity.AcademicDetails;
import com.lti.service.ScholarshipService;
import com.lti.service.StateService;
import com.lti.service.StudentService;

@Controller
@SessionAttributes("student")
public class ScholarshipRegistrationController {
	
	HttpSession session;
	
	@Autowired
	private ScholarshipService ScholarshipService;
	
	@Autowired
	private StudentService studentService;

	 private int i = 0;
		
		@RequestMapping("/ScholarshipBasic")
	    public ModelAndView StudDetailsForm(ModelMap model) {
		
			return new ModelAndView("Scholarship_basic",model);
		}
		
	 @RequestMapping(path = "ScholarshipBasic.nsp", method = RequestMethod.POST)
		public String addAcademic(ScholarshipBasic studBasic, ModelMap model,HttpServletRequest request)
		{
			        
			ScholarshipService.addScholarshipBasic(studBasic);
			
			session=request.getSession();
			int studid = (int) session.getAttribute("studentId");
			System.out.println("Student id= "+studid);
			
			int scheme_Id;
			scheme_Id=studentService.pullSchemeId(studid);
			System.out.println("Scheme id= "+scheme_Id);
			studentService.addSchemeId(studid,scheme_Id);
			
			return "AcademicDetails";
		}
	 
	 
	/*																					//Under fetching DATA
	 * @RequestMapping("/viewDetailsStudent") public ModelAndView
	 * ViewDetailsStudent(StudentRegistration studentRegistration,ModelMap model) {
	 * 
	 * List
	 * obj=studentService.readStudentDetails(studentRegistration.getStudentId());
	 * model.put("studentId", obj); return new ModelAndView("userdetails",model);
	 * 
	 * }
	 */
		
		@RequestMapping(path = "AcademicDetails.nsp", method = RequestMethod.POST)
		public String addAcademic(AcademicDetails AcademicDetails, ModelMap model, HttpServletRequest request)
		{
			StudentRegistration s=(StudentRegistration) model.get("student");
			AcademicDetails.setStudentRegistration(s);
			        
			ScholarshipService.addAcademic(AcademicDetails);
			return "StudentMarks_10";
		}
		
		@RequestMapping(path = "StudentMarks10.nsp", method = RequestMethod.POST)
		public String addStudentMarks10(StudentMarks10 StudentMarks10, ModelMap model)
		{   
			StudentRegistration s=(StudentRegistration) model.get("student");
			StudentMarks10.setStudentRegistration(s);
			
			ScholarshipService.addMarks10(StudentMarks10);
			return "StudentMarks_12";
		}
		
		@RequestMapping(path = "StudentMarks12.nsp", method = RequestMethod.POST)
		public String addStudentMarks12(StudentMarks12 StudentMarks12, ModelMap model)
		{   
			StudentRegistration s=(StudentRegistration) model.get("student");
			StudentMarks12.setStudentRegistration(s);
			
			ScholarshipService.addMarks12(StudentMarks12);
			return "DocumentsUpload";
		}
		
		@RequestMapping(path = "DocumentsUpload.nsp", method = RequestMethod.POST)
		public String addDoc(DocumentsUpload DocumentsUpload, ModelMap model)
		{        
			StudentRegistration s=(StudentRegistration) model.get("student");
			DocumentsUpload.setStudentRegistration(s);
			
			ScholarshipService.addDocuments(DocumentsUpload);
			return "StudentDashboard"; 												// It should go to Apply for schemes page
		}
	    
		
	}


