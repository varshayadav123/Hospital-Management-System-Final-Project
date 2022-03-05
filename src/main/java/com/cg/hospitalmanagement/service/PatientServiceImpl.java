package com.cg.hospitalmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hospitalmanagement.model.Patient;
import com.cg.hospitalmanagement.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public void savePatient(Patient patient) {
		// TODO Auto-generated method stub
		this.patientRepository.save(patient);
	}

	@Override
	public Patient getPatientById(long id) {
		// TODO Auto-generated method stub
		Optional<Patient> optional = patientRepository.findById(id);
		Patient patient = null;
		if(optional.isPresent())
		{
			patient = optional.get();
		}else {
			throw new RuntimeException("Patient not found for id :: "+ id);
		}
		
		return patient;
	}

	@Override
	public void deletePatientById(long id) {
		// TODO Auto-generated method stub
	
		 this.patientRepository.deleteById(id);
	}
}
