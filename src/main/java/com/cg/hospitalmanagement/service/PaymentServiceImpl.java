package com.cg.hospitalmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hospitalmanagement.model.Payment;
import com.cg.hospitalmanagement.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;
	

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

	@Override
	public void makePayment(Payment payment) {
		// TODO Auto-generated method stub
		this.paymentRepository.save(payment);
		
	}

	@Override
	public void cancelPaymentById(long id) {
		// TODO Auto-generated method stub
		this.paymentRepository.deleteById(id);
		
	}

}