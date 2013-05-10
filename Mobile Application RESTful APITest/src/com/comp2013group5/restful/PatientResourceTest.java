package com.comp2013group5.restful;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PatientResourceTest</code> contains tests for the class <code>{@link PatientResource}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:57 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class PatientResourceTest {
	/**
	 * Run the PatientResource() constructor test.
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testPatientResource_1()
		throws Exception {
		PatientResource result = new PatientResource();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void doInit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testDoInit_1()
		throws Exception {
		PatientResource fixture = new PatientResource();

		fixture.doInit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: _out shouldn't be null
		//       at com.mongodb.DBPort.go(DBPort.java:110)
		//       at com.mongodb.DBPort.call(DBPort.java:74)
		//       at com.mongodb.DBTCPConnector.innerCall(DBTCPConnector.java:286)
		//       at com.mongodb.DBTCPConnector.call(DBTCPConnector.java:257)
		//       at com.mongodb.DBApiLayer$MyCollection.__find(DBApiLayer.java:310)
		//       at com.mongodb.DB.command(DB.java:274)
		//       at com.mongodb.DB.command(DB.java:256)
		//       at com.mongodb.DB.command(DB.java:313)
		//       at com.mongodb.Mongo.getDatabaseNames(Mongo.java:393)
		//       at com.comp2014group5.generic_database.FormDatabaseMongoImpl.<init>(FormDatabaseMongoImpl.java:24)
		//       at com.comp2014.group5.patient_database.PatientAccessor.<init>(PatientAccessor.java:28)
		//       at com.comp2013group5.restful.PatientResource.doInit(PatientResource.java:17)
	}

	/**
	 * Run the String getPatientDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testGetPatientDetails_1()
		throws Exception {
		PatientResource fixture = new PatientResource();

		String result = fixture.getPatientDetails();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2013group5.restful.PatientResource.getPatientDetails(PatientResource.java:24)
		assertNotNull(result);
	}

	/**
	 * Run the String getPatientDetails() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testGetPatientDetails_2()
		throws Exception {
		PatientResource fixture = new PatientResource();

		String result = fixture.getPatientDetails();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2013group5.restful.PatientResource.getPatientDetails(PatientResource.java:24)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
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
	 * @generatedBy CodePro at 5/10/13 1:57 AM
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
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PatientResourceTest.class);
	}
}