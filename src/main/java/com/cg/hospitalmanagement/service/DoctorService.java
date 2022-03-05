package com.cg.hospitalmanagement.service;

import java.util.List;

import com.cg.hospitalmanagement.model.Doctor;

public interface DoctorService {
	
	List<Doctor> getAllDoctors();
	void saveDoctor(Doctor doctor);
	Doctor getDoctorById(long id);
	void deleteDoctorById(long id);
	static Object addJDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
