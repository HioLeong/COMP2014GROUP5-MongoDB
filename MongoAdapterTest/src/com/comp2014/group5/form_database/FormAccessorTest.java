package com.comp2014.group5.form_database;

import java.util.List;
import org.json.JSONObject;
import org.junit.*;
import static org.junit.Assert.*;
import com.comp2013group5.form.model.Form;

/**
 * The class <code>FormAccessorTest</code> contains tests for the class <code>{@link FormAccessor}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:20 PM
 * @author root
 * @version $Revision: 1.0 $
 */
public class FormAccessorTest {
	/**
	 * Run the FormAccessor(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testFormAccessor_1()
		throws Exception {
		String ip = "";

		FormAccessor result = new FormAccessor(ip);

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the FormAccessor(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testFormAccessor_2()
		throws Exception {
		String ip = "";

		FormAccessor result = new FormAccessor(ip);

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the FormAccessor(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testFormAccessor_3()
		throws Exception {
		String ip = "";

		FormAccessor result = new FormAccessor(ip);

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the void closeConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testCloseConnection_1()
		throws Exception {
		FormAccessor fixture = new FormAccessor("");

		fixture.closeConnection();

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
	}

	/**
	 * Run the List<String> getFormNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetFormNames_1()
		throws Exception {
		FormAccessor fixture = new FormAccessor("");

		List<String> result = fixture.getFormNames();

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getFormNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetFormNames_2()
		throws Exception {
		FormAccessor fixture = new FormAccessor("");

		List<String> result = fixture.getFormNames();

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the String getFormString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetFormString_1()
		throws Exception {
		FormAccessor fixture = new FormAccessor("");
		String formName = "";

		String result = fixture.getFormString(formName);

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the String getFormString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetFormString_2()
		throws Exception {
		FormAccessor fixture = new FormAccessor("");
		String formName = "";

		String result = fixture.getFormString(formName);

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the void saveForm(Form) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSaveForm_1()
		throws Exception {
		FormAccessor fixture = new FormAccessor("");
		Form form = new Form();

		fixture.saveForm(form);

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
	}

	/**
	 * Run the void saveForm(Form) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSaveForm_2()
		throws Exception {
		FormAccessor fixture = new FormAccessor("");
		Form form = new Form();

		fixture.saveForm(form);

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
	}

	/**
	 * Run the void saveFormFromJSONObject(JSONObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSaveFormFromJSONObject_1()
		throws Exception {
		FormAccessor fixture = new FormAccessor("");
		JSONObject formJSONObject = new JSONObject();

		fixture.saveFormFromJSONObject(formJSONObject);

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
		//       at com.comp2014.group5.form_database.FormAccessor.<init>(FormAccessor.java:31)
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
		new org.junit.runner.JUnitCore().run(FormAccessorTest.class);
	}
}