package com.cg.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hospitalmanagement.model.Appointment;
import com.cg.hospitalmanagement.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	

	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	@Override
	public void saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		this.appointmentRepository.save(appointment);
	}

	@Override
	public Appointment getAppointmentById(long id) {
		// TODO Auto-generated method stub
		Optional<Appointment> optional = appointmentRepository.findById(id);
		Appointment appointment = null;
		if(optional.isPresent())
		{
			appointment = optional.get();
		}else {
			throw new RuntimeException("Appointment Id is not found for id :: "+ id);
		}
		
		return appointment;
	}

	@Override
	public void deleteAppointmentById(long id) {
		// TODO Auto-generated method stub
		this.appointmentRepository.deleteById(id);
		
	}
}
