package com.comp2014group5.database;

import com.comp2014group5.dao.PatientDAO;
import com.comp2014group5.dao.PatientDAOMongoImpl;
import com.comp2014group5.model.nhs.Patient;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PatientDAO patientDao = new PatientDAOMongoImpl();

		Patient patient = patientDao.getAll().get(0);
		patientDao.remove(patient);

	}

}
