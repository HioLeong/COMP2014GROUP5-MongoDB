package com.comp2014.group5.patient_database;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;

import com.comp2014group5.generic_database.Collection;
import com.comp2014group5.generic_database.FormDatabaseMongoImpl;
import com.comp2014group5.model.nhs.NST;
import com.comp2014group5.model.nhs.Patient;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
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

	public void savePatientDetails(Patient patient) {
		try {
			patientsCollection.saveRecordFromJSONObject(patient.toJSONObject());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public void saveNST(NST nstForm) throws JSONException {
		patientsCollection.saveRecordFromJSONObject(nstForm.toJSONObject());
	}

	public List<String> getAllHospitalNumbers() {
		List<String> hospitalNumbers = new ArrayList<String>();

		DBCursor patientCursor = patientsCollection.getDBCollection().find();
		while (patientCursor.hasNext()) {
			DBObject patientDBObject = patientCursor.next();
			DBObject patientWrapper = (DBObject) patientDBObject.get("patient");
			String patientHospitalNumber = (String) patientWrapper
					.get("hospital-number");
			hospitalNumbers.add(patientHospitalNumber);
		}

		return hospitalNumbers;
	}

	public Patient getPatientDetail(String hospitalNumber) {
		DBObject query = new BasicDBObject();
		query.put(Patient.KEY_HOSPITAL_NUMBER, hospitalNumber);

		DBCursor patientCursor = patientsCollection.getDBCollection().find(
				query);
		if (patientCursor.hasNext()) {
			DBObject patientDBObj = patientCursor.next();
			return getPatientFromDBObj(patientDBObj);
		} else {
			return null;
		}
	}

	public NST getNST(String hospitalNumber, int weekNumber) {
		DBObject query = new BasicDBObject();
		query.put(NST.KEY_HOSPITAL_NUMBER, hospitalNumber);
		query.put(NST.KEY_WEEK_NUMBER, Integer.valueOf(weekNumber));

		DBCursor nstCursor = patientsCollection.getDBCollection().find(query);
		if (nstCursor.hasNext()) {
			DBObject nstDBObject = nstCursor.next();
			return getNSTFromDBObj(nstDBObject);
		} else {
			return null;
		}
	}

	private Patient getPatientFromDBObj(DBObject patientDBObj) {
		Patient patient = new Patient();
		patient.setHospitalNumber((String) patientDBObj
				.get(Patient.KEY_HOSPITAL_NUMBER));
		patient.setAdmissionDate((String) patientDBObj
				.get(Patient.KEY_ADMISSION_DATE));
		patient.setName((String) patientDBObj.get(Patient.KEY_NAME));
		return patient;
	}

	private NST getNSTFromDBObj(DBObject nstDBObject) {
		NST nst = new NST();
		Patient patient = new Patient();
		patient.setHospitalNumber((String) nstDBObject
				.get(NST.KEY_HOSPITAL_NUMBER));
		nst.setPatient(patient);

		nst.setHeight((Float) nstDBObject.get(NST.KEY_HEIGHT));
		nst.setWeight((Float) nstDBObject.get(NST.KEY_WEIGHT));
		nst.setWeekNumber((Integer) nstDBObject.get(NST.KEY_WEEK_NUMBER));
		nst.setAppetiteScore((Integer) nstDBObject.get(NST.KEY_APPETITE_SCORE));
		nst.setNeurologicalScore((Integer) nstDBObject.get(NST.KEY_NEURO_SCORE));
		nst.setPhysicalAppearenceScore((Integer) nstDBObject
				.get(NST.KEY_PHYS_APPR_SCORE));
		nst.setWeightLossScore((Integer) nstDBObject
				.get(NST.KEY_WEIGHT_LOSS_SCORE));
		nst.setIntakeScore((Integer) nstDBObject.get(NST.KEY_INTAKE_SCORE));

		return nst;
	}

}
