package com.cg.hospitalmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Doctor_id")
	private long id;
	
	@Column(name="doctor_Name")
	private String doctorName;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="degree")
	private String degree;
	
	@Column(name="experience")
	private int experience;
	
	@Column(name="address")
	private String address;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="contact_Number")
	private long contactNumber;

	@Column(name="DoctorAvailability")
	private String doctorAvailability;
	
	public Doctor() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	

	public String getDoctorAvailability() {
		return doctorAvailability;
	}

	public void setDoctorAvailability(String doctorAvailability) {
		this.doctorAvailability = doctorAvailability;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", designation=" + designation + ", degree=" + degree
				+ ", experience=" + experience + ", address=" + address + ", emailId=" + emailId + ", contactNumber="
				+ contactNumber + ", doctorAvailability=" + doctorAvailability + "]";
	}

}

	
	
	

