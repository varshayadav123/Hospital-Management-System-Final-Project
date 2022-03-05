package com.cg.hospitalmanagement.exception;

public class DoctorNotFoundException  extends Exception{
	private static final long serialVersionUID = 1L;

	public DoctorNotFoundException (String errorMessage) {
		super( errorMessage);
	}

}
