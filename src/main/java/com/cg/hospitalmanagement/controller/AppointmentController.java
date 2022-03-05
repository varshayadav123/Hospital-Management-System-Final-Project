package com.cg.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.hospitalmanagement.model.Appointment;
import com.cg.hospitalmanagement.service.AppointmentService;


@Controller
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	
	@GetMapping("/appointmentlist")
	public String viewHomePage(Model model) {
		model.addAttribute("listAppointments",appointmentService.getAllAppointments());
		return "/appointmentlist";
		
	}
	
	  @GetMapping("/showNewAppointmentForm") 
	  public String showNewAppointmentForm(Model model) { 
		  Appointment appointment = new Appointment(); 
		  model.addAttribute("appointment",appointment);
	       return "new_appointment"; 
	  }
	  
	  @PostMapping("/saveAppointment")
	  public String saveAppointment(@ModelAttribute("appointment") Appointment appointment) { 
		  //save Appointment to database
		  System.out.println("Sava Appointment");
		  appointmentService.saveAppointment(appointment); 
		  return "redirect:/appointmentlist"; 
		  
	  }
	  
	  
	         @GetMapping("/showFormForAppointmentUpdate/{id}") 
	         public String showFormForAppointmentUpdate(@PathVariable (value= "id") long id, Model model) { 
	        	 Appointment appointment = appointmentService.getAppointmentById(id);
		      model.addAttribute("appointment",appointment); 
		      return "update_appointment";
		  }
		
		  @GetMapping("/deleteAppointment/{id}") 
		  public String deleteAppointment(@PathVariable (value= "id") long id) { 
			  this.appointmentService.deleteAppointmentById(id);
		  return "redirect:/appointmentlist";
		  
		  }
		  
}
