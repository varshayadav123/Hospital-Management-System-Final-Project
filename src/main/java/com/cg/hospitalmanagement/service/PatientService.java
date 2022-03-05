package com.cg.hospitalmanagement.service;

import java.util.List;

import com.cg.hospitalmanagement.model.Patient;

public interface PatientService {
	
	
	List<Patient> getAllPatients();
	void savePatient(Patient patient);
	Patient getPatientById(long id);
	void deletePatientById(long id);
	

}
