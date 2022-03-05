package com.cg.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hospitalmanagement.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{

}
