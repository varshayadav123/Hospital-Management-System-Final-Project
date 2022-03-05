package com.cg.hospitalmanagement;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.hospitalmanagement.model.Doctor;
import com.cg.hospitalmanagement.model.Patient;
import com.cg.hospitalmanagement.model.User;
import com.cg.hospitalmanagement.service.AppointmentService;
import com.cg.hospitalmanagement.service.DoctorService;
import com.cg.hospitalmanagement.service.PatientService;
import com.cg.hospitalmanagement.service.PatientServiceImpl;
import com.cg.hospitalmanagement.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
class HospitalManagementSystemApplicationTests {


	@Autowired
	private UserService userService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private AppointmentService appoinmentService;
	
	
	@Test
	public void testUser() {
		
		User user= new User();
		user.setUsername("user");
		user.setPassword("user");
		user.setEmail("usern@gmail.com");
		assertNotNull(userService.addUser(user));

		}
	@Test
	public void testDoctor() {
		Doctor doctor=new Doctor();
		doctor.setId(8);
		doctor.setDoctorName("sanyogita patil");
		doctor.setDesignation("doctor");
		doctor.setDegree("MBBS");
		doctor.setExperience(4);
		doctor.setAddress("satara");
		doctor.setEmailId("sanyo12@gmail.com");
		doctor.setContactNumber(78976787);
		doctor.setDoctorAvailability("yes");
		
	}
	
	
	
	
}
