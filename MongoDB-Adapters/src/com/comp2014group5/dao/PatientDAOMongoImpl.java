package com.comp2014group5.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.comp2014group5.model.nhs.Patient;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class PatientDAOMongoImpl implements PatientDAO {

	private final static String DB_NAME = "nhs_db";
	private final static String PATIENTS_COLLECTION_NAME = "patients";
	private final static String PATIENT_FIRST_NAME = "first_name";
	private final static String PATIENT_LAST_NAME = "last_name";
	private final static String PATIENT_NHS_NUMBER = "nhs_number";

	private DB database;
	private DBCollection patientCollection;

	public PatientDAOMongoImpl() {
		try {

			MongoClient client = new MongoClient("localhost");
			database = client.getDB(DB_NAME);
			patientCollection = database
					.getCollection(PATIENTS_COLLECTION_NAME);

		} catch (UnknownHostException e) {

		}
	}

	@Override
	public List<Patient> getAll() {

		List<Patient> patients = new ArrayList<Patient>();

		for (DBObject patientDBObject : patientCollection.find()) {

			Patient patient = new Patient();

			patient.setFirstName((String) patientDBObject
					.get(PATIENT_FIRST_NAME));
			patient.setLastName((String) patientDBObject.get(PATIENT_LAST_NAME));
			patient.setNhsNumber((Long) patientDBObject.get(PATIENT_NHS_NUMBER));

			patients.add(patient);
		}

		return patients;
	}

	@Override
	public void add(Patient patient) {
		DBObject query = new BasicDBObject();
		query.put(PATIENT_NHS_NUMBER, patient.getNhsNumber());

		patientCollection.save(getPatientDBObject(patient));

	}

	@Override
	public void remove(Patient patient) {
		DBObject query = new BasicDBObject();
		query.put(PATIENT_NHS_NUMBER, patient.getNhsNumber());

		patientCollection.remove(query);
	}

	@Override
	public Patient getByNHSNumber(long nhsNumber) {
		DBObject query = new BasicDBObject();
		query.put(PATIENT_NHS_NUMBER, nhsNumber);

		Patient patient = new Patient();

		DBObject patientDBObject = patientCollection.findOne(query);
		if (patientDBObject != null) {
			patient.setFirstName((String) patientDBObject
					.get(PATIENT_FIRST_NAME));
			patient.setLastName((String) patientDBObject.get(PATIENT_LAST_NAME));
			patient.setNhsNumber((Long) patientDBObject.get(PATIENT_NHS_NUMBER));
		}
		return patient;
	}

	private DBObject getPatientDBObject(Patient patient) {
		DBObject patientDBObject = new BasicDBObject();

		patientDBObject.put(PATIENT_FIRST_NAME, patient.getFirstName());
		patientDBObject.put(PATIENT_LAST_NAME, patient.getLastName());
		patientDBObject.put(PATIENT_NHS_NUMBER, patient.getNhsNumber());

		return patientDBObject;
	}

	@Override
	public void update(Patient patient) {
		
	}

}
