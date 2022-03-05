package com.cg.hospitalmanagement.service;

import java.util.List;

import com.cg.hospitalmanagement.model.Appointment;

public interface AppointmentService {
	
	
	List<Appointment> getAllAppointments();
	void saveAppointment(Appointment appointment);
	Appointment getAppointmentById(long id);
	void deleteAppointmentById(long id);

}
