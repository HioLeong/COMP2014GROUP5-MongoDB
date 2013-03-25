package com.comp2014group5.model.nhs;

import org.json.JSONException;
import org.json.JSONObject;

import com.mongodb.DBObject;

public class Patient {

	public static final String KEY_NAME = "name";
	public static final String KEY_HOSPITAL_NUMBER = "hospital-number";
	public static final String KEY_ADMISSION_DATE = "admission-date";

	private String name;
	private String hospitalNumber;
	private String admissionDate;

	public String getHospitalNumber() {
		return hospitalNumber;
	}

	public void setHospitalNumber(String hospitalNumber) {
		this.hospitalNumber = hospitalNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public JSONObject toJSONObject() throws JSONException {

		JSONObject patientObject = new JSONObject();
		patientObject.put(KEY_NAME, name);
		patientObject.put(KEY_HOSPITAL_NUMBER, hospitalNumber);
		patientObject.put(KEY_ADMISSION_DATE, admissionDate);

		return patientObject;
	}

}
