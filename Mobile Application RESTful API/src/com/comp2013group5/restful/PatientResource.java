package com.comp2013group5.restful;

import org.json.JSONException;
import org.restlet.resource.Get;

import com.comp2014.group5.patient_database.PatientAccessor;

public class PatientResource extends BaseResource {

	private static final String DB_IP = "localhost";

	private String hospitalNumber;
	private PatientAccessor accessor;

	@Override
	public void doInit() {
		accessor = new PatientAccessor(DB_IP);
		hospitalNumber = (String) getRequestAttributes().get("hospitalNumber");
	}

	@Get
	public String getPatientDetails() {
		try {
			return accessor.getPatientDetail(hospitalNumber).toJSONObject()
					.toString();
		} catch (JSONException e) {
			return null;
		}
	}

}
