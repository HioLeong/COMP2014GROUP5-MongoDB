package com.comp2013group5.restful;

import org.restlet.resource.Put;

import com.comp2014.group5.patient_database.PatientAccessor;
import com.comp2014group5.model.nhs.NST;

public class PatientsResource extends BaseResource {

	private PatientAccessor accessor;

	@Put("string")
	public void getPatientWeeklyNST(String jsonString) {
		System.out.println("Posted");
		accessor = new PatientAccessor("localhost");
		
	}

}
