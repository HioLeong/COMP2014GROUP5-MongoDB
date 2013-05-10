package com.comp2014.group5.patient_database.test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import com.comp2014.group5.patient_database.PatientAccessor;

public class PatientAccessorTest {

	@Test
	public void testSavePatientDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveNST() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveNSTJSONObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllHospitalNumbers() {
		PatientAccessor accessor;
		accessor = new PatientAccessor("localhost");
		List<String> notNullList = accessor.getAllHospitalNumbers();
		assertNotSame(notNullList,null);
	}

	@Test
	public void testGetPatientDetail() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNST() {
		fail("Not yet implemented");
	}

}
