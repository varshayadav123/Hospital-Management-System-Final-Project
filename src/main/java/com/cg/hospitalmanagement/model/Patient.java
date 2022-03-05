package com.cg.hospitalmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;


@Entity
@Table(name = "Patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="patient_id")
	private long id;
	
	@Column(name="patient_name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="disease")
	private String disease;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="contactNumber")
	private long contactNumber;
	
	@Column(name="bloodGroup")
	private String bloodGroup;

	
	@OneToOne
	@JoinColumn(foreignKey=@ForeignKey(name="Doctor_id"))
	private Doctor doctor;
	


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDisease() {
		return disease;
	}


	public void setDisease(String disease) {
		this.disease = disease;
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



	
	

	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", disease="
				+ disease + ", emailId=" + emailId + ", contactNumber=" + contactNumber + ", bloodGroup=" + bloodGroup
				+ ", doctor=" + doctor.getId()+ "]";
	}
	
	
	
	


	
	
	
	
	

}
