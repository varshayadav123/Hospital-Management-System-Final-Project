package com.cg.hospitalmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserTable")
public class User {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private Long id;
		
		@Column
		private String username;
		
		@Column
		private String password;
		
		@Column
		private String role;
		
		@Column
		private String email;
		
	public User()
	{
		
	}

	public User(Long id, String username, String password, String role, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}	
		
		
		
		
		
		
		
		
		

		



