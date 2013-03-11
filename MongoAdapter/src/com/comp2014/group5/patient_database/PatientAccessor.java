package com.comp2014.group5.patient_database;

import java.net.UnknownHostException;
import java.util.List;

import org.json.JSONObject;

import com.comp2014group5.generic_database.Collection;
import com.comp2014group5.generic_database.FormDatabaseMongoImpl;
import com.comp2014group5.model.nhs.Patient;
import com.mongodb.MongoClient;

public class PatientAccessor {

	private static final String PATIENT_COLLECTION = "patients";

	private Collection patientsCollection;

	public PatientAccessor(String ip) {
		MongoClient mongoClient;
		try {
			mongoClient = new MongoClient(ip);
			FormDatabaseMongoImpl fDb = new FormDatabaseMongoImpl(mongoClient);
			fDb.setDatabase("nhs_db");
			patientsCollection = fDb.getCollection(PATIENT_COLLECTION);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void savePatientDetails(JSONObject patientData) {
		
	}
	
	public void saveWeekly(JSONObject weekly) {
		
	}
	
	public List<Patient> getAllPatients() {
		return null;
	}

}
