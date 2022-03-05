package com.cg.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hospitalmanagement.model.Doctor;
import com.cg.hospitalmanagement.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository doctorRepository;
	
	
	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
		
	}


	@Override
	public void saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.save(doctor);
		
		
	}


	@Override
	public Doctor getDoctorById(long id) {
		// TODO Auto-generated method stub
		Optional<Doctor> optional = doctorRepository.findById(id);
		Doctor doctor = null;
		if(optional.isPresent())
		{
			doctor = optional.get();
		}else {
			throw new RuntimeException("Doctor not found for id :: "+ id);
		}
		
		return doctor;
	}


	@Override
	public void deleteDoctorById(long id) {
		// TODO Auto-generated method stub
		this.doctorRepository.deleteById(id);
		
	}
}
