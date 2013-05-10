package com.comp2014group5.model.nhs;

import org.json.JSONObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PatientTest</code> contains tests for the class <code>{@link Patient}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:20 PM
 * @author root
 * @version $Revision: 1.0 $
 */
public class PatientTest {
	/**
	 * Run the Patient() constructor test.
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testPatient_1()
		throws Exception {
		Patient result = new Patient();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getAdmissionDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetAdmissionDate_1()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");

		String result = fixture.getAdmissionDate();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getHospitalNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetHospitalNumber_1()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");

		String result = fixture.getHospitalNumber();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setAdmissionDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetAdmissionDate_1()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");
		String admissionDate = "";

		fixture.setAdmissionDate(admissionDate);

		// add additional test code here
	}

	/**
	 * Run the void setHospitalNumber(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetHospitalNumber_1()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");
		String hospitalNumber = "";

		fixture.setHospitalNumber(hospitalNumber);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_1()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"hospital-number\":\"\",\"admission-date\":\"\",\"name\":\"\"}", result.toString());
		assertEquals(3, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_2()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"hospital-number\":\"\",\"admission-date\":\"\",\"name\":\"\"}", result.toString());
		assertEquals(3, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_3()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"hospital-number\":\"\",\"admission-date\":\"\",\"name\":\"\"}", result.toString());
		assertEquals(3, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_4()
		throws Exception {
		Patient fixture = new Patient();
		fixture.setAdmissionDate("");
		fixture.setHospitalNumber("");
		fixture.setName("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"hospital-number\":\"\",\"admission-date\":\"\",\"name\":\"\"}", result.toString());
		assertEquals(3, result.length());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PatientTest.class);
	}
}