package com.cg.hospitalmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Payment_Table")
public class Payment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Payment_Id")
	private Long id;
	
	@Column(name="PaymentDate")
	private String paymentDate;
	
	@Column(name="Amount")
	private float amount;
	
	@Column(name="PaymentMode")
	private String paymentMode;
	
	@Column(name="PaymentStatus")
	private String paymentStatus;

	
	@OneToOne
	@JoinColumn(foreignKey=@ForeignKey(name="app_Id"))
	private Appointment appointment;

	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	
	

	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public Appointment getAppointment() {
		return appointment;
	}


	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


	@Override
	public String toString() {
		return "Payment [id=" + id + ", paymentDate=" + paymentDate + ", amount=" + amount + ", paymentMode="
				+ paymentMode + ", paymentStatus=" + paymentStatus + ", appointment=" + appointment.getId()+ "]";
	}

}
	
	
	
	
	
