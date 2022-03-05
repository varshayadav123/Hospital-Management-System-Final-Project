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

import com.cg.hospitalmanagement.model.Doctor;
import com.cg.hospitalmanagement.service.DoctorService;

@Controller
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	//Display List of Doctors
	@GetMapping("/doctorList")
	public String viewHomePage(Model model) {
		model.addAttribute("listDoctors",doctorService.getAllDoctors());
		return "/doctorList";
		
	}
	
	
	@GetMapping("/listofdoctors")
	public String viewDoctorList(Model model) {
		model.addAttribute("listDoctors",doctorService.getAllDoctors());
		return "/listofdoctors";
		
	}
	
	
	@GetMapping("/showNewDoctorForm")
	public String showNewDoctorForm(Model model) {
		Doctor doctor = new Doctor();
		model.addAttribute("doctor",doctor);
		return "new_doctor";
	}
	
	@PostMapping("/saveDoctor")
	public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
		//save Doctor to database
		doctorService.saveDoctor(doctor);
		return "redirect:/doctorList";
				}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value= "id") long id, Model model)
	{
		Doctor doctor = doctorService.getDoctorById(id);
		model.addAttribute("doctor",doctor);
		return "update_doctor";
		
	}
	
	@GetMapping("/deleteDoctor/{id}")
	public String deleteDoctor(@PathVariable (value= "id") long id) {
		this.doctorService.deleteDoctorById(id);
		return "redirect:/doctorList";
		
	}
	
	@RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
	public String logoutDo(HttpServletRequest request,HttpServletResponse response)
	{
		
	  
	    return "redirect:/signIn";
	}
}
