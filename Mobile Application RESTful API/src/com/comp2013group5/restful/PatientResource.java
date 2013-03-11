package com.comp2013group5.restful;

import org.restlet.resource.Get;

public class PatientResource extends BaseResource {

	public String patientId;
	public int weekNumber;

	@Override
	public void doInit() {
		patientId = (String) getRequestAttributes().get("patientId");
		weekNumber = (Integer) getRequestAttributes().get("weekNum");
	}

	@Get
	public String getPatientDetails() {
		return "Not yet implemented";
	}

}
