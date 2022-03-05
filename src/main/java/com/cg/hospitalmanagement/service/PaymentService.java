package com.cg.hospitalmanagement.service;

import java.util.List;

import com.cg.hospitalmanagement.model.Payment;

public interface PaymentService {
	
	
	List<Payment> getAllPayments();
	void makePayment(Payment payment);
	//Appointment getAppointmentById(long id);
	void cancelPaymentById(long id);


}
