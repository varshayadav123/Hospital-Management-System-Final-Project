package com.cg.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hospitalmanagement.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

	
	
}
