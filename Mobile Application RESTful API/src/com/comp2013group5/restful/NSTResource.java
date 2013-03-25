package com.comp2013group5.restful;

import org.json.JSONException;
import org.restlet.resource.Get;

import com.comp2014.group5.patient_database.PatientAccessor;

public class NSTResource extends BaseResource {

	private static final String DB_IP = "localhost";

	public String hospitalNumber;
	public int weekNumber;
	public PatientAccessor accessor;

	@Override
	public void doInit() {
		accessor = new PatientAccessor(DB_IP);
		hospitalNumber = (String) getRequestAttributes().get("hospitalNumber");
		weekNumber = Integer.valueOf((String) getRequestAttributes().get(
				"weekNumber"));
	}

	@Get
	public String getNST() {
		try {
			return accessor.getNST(hospitalNumber, weekNumber).toJSONObject()
					.toString();
		} catch (JSONException e) {
			return null;
		}
	}

}
