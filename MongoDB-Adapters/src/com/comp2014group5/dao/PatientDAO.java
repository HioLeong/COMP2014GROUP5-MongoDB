package com.comp2014group5.dao;

import java.util.List;

import com.comp2014group5.model.nhs.Patient;

public interface PatientDAO {

	public List<Patient> getAll();

	public void add(Patient patient);

	public void update(Patient patient);

	public void remove(Patient patient);

	public Patient getByNHSNumber(long nhsNumber);

}
