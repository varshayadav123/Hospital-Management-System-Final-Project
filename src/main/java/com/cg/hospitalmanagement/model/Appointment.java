package com.cg.hospitalmanagement.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Appointment")
public class Appointment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="app_Id")
	private Long id;
	
	@Column(name="AppointmentDate")
	private String appointmentDate;
	
	@Column(name="AppointmentTime")
	private String appointmentTime;
	
	@OneToOne
	@JoinColumn(foreignKey=@ForeignKey(name="patient_id"))
	private Patient patient;
	
	
	

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	

	public String getAppointmentDate() {
		return appointmentDate;
	}




	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}




	public String getAppointmentTime() {
		return appointmentTime;
	}




	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}




	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}




	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime
				+ ", patient=" + patient.getId()+ "]";
	}




	





	
	
	
	

}
