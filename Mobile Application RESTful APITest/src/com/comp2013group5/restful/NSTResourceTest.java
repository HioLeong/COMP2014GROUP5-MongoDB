package com.comp2013group5.restful;

import org.junit.*;
import static org.junit.Assert.*;
import com.comp2014.group5.patient_database.PatientAccessor;

/**
 * The class <code>NSTResourceTest</code> contains tests for the class <code>{@link NSTResource}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:57 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class NSTResourceTest {
	/**
	 * Run the NSTResource() constructor test.
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testNSTResource_1()
		throws Exception {
		NSTResource result = new NSTResource();
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
		NSTResource fixture = new NSTResource();
		fixture.accessor = new PatientAccessor("");
		fixture.hospitalNumber = "";
		fixture.weekNumber = 1;

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
	}

	/**
	 * Run the void doInit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testDoInit_2()
		throws Exception {
		NSTResource fixture = new NSTResource();
		fixture.accessor = new PatientAccessor("");
		fixture.hospitalNumber = "";
		fixture.weekNumber = 1;

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
	}

	/**
	 * Run the String getNST() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testGetNST_1()
		throws Exception {
		NSTResource fixture = new NSTResource();
		fixture.accessor = new PatientAccessor("");
		fixture.hospitalNumber = "";
		fixture.weekNumber = 1;

		String result = fixture.getNST();

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
		assertNotNull(result);
	}

	/**
	 * Run the String getNST() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testGetNST_2()
		throws Exception {
		NSTResource fixture = new NSTResource();
		fixture.accessor = new PatientAccessor("");
		fixture.hospitalNumber = "";
		fixture.weekNumber = 1;

		String result = fixture.getNST();

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
		new org.junit.runner.JUnitCore().run(NSTResourceTest.class);
	}
}