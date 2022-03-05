package com.cg.hospitalmanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.hospitalmanagement.model.Patient;
import com.cg.hospitalmanagement.service.PatientService;


@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	//Display List of Patients
	@GetMapping("/patientlist")
	public String viewHomePage(Model model) {
		model.addAttribute("listpatients",patientService.getAllPatients());
		return "patientlist";
		
	}
	
	
	 @GetMapping("/showNewPatientForm") 
	 public String showNewPatientForm(Model model) {
		 Patient patient = new Patient();
	  model.addAttribute("patient",patient);
	  return "new_patient"; 
	  }
	  
	 @PostMapping("/savePatient") 
	 public String savePatient(@ModelAttribute("patient") Patient patient) {
		 //save Doctor to database 
		 patientService.savePatient(patient); 
	 return "redirect:/patientlist"; 
	 }
	 
	 @GetMapping("/showFormForPatientUpdate/{id}") 
	 public String showFormForPatientUpdate(@PathVariable (value= "id") long id, Model model) { 
		 Patient patient = patientService.getPatientById(id);
	 model.addAttribute("patient",patient); 
	    return "update_patient";
	  
	  }
	 
	  @GetMapping("/deletePatient/{id}") 
	  public String deletePatient(@PathVariable(value= "id") long id) { 
		  this.patientService.deletePatientById(id);
		  return "redirect:/patientlist";
	  
	  }
	 
	  @RequestMapping(value = {"/patientlogout"}, method = RequestMethod.POST)
		public String patientLogout(HttpServletRequest request,HttpServletResponse response)
		{
		    return "redirect:/signIn";
		}
}
