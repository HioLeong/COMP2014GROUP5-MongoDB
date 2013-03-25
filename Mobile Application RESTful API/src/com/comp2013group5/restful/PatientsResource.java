package com.comp2013group5.restful;

import org.restlet.resource.Post;

import com.comp2014.group5.patient_database.PatientAccessor;

public class PatientsResource extends BaseResource {

	private PatientAccessor accessor;
	
	@Post 
	public void getPatientWeeklyNST() {
	}

}
