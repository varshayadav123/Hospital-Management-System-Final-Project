package com.cg.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hospitalmanagement.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

}
