package com.comp2014group5.generic_database;

import java.util.List;
import org.json.JSONObject;
import org.junit.*;
import static org.junit.Assert.*;
import com.mongodb.DBCollection;

/**
 * The class <code>CollectionTest</code> contains tests for the class <code>{@link Collection}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:20 PM
 * @author root
 * @version $Revision: 1.0 $
 */
public class CollectionTest {
	/**
	 * Run the Collection(DBCollection) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testCollection_1()
		throws Exception {
		DBCollection collection = null;

		Collection result = new Collection(collection);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDBCollection());
	}

	/**
	 * Run the List<Record> getAllRecords() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetAllRecords_1()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);

		List<Record> result = fixture.getAllRecords();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2014group5.generic_database.Collection.getAllRecords(Collection.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the List<Record> getAllRecords() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetAllRecords_2()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);

		List<Record> result = fixture.getAllRecords();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2014group5.generic_database.Collection.getAllRecords(Collection.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the DBCollection getDBCollection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetDBCollection_1()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);

		DBCollection result = fixture.getDBCollection();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<String> getFieldNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetFieldNames_1()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);

		List<String> result = fixture.getFieldNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2014group5.generic_database.Collection.getFieldNames(Collection.java:24)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getFieldNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetFieldNames_2()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);

		List<String> result = fixture.getFieldNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2014group5.generic_database.Collection.getFieldNames(Collection.java:24)
		assertNotNull(result);
	}

	/**
	 * Run the Record getNewRecord() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetNewRecord_1()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);

		Record result = fixture.getNewRecord();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2014group5.generic_database.Collection.getFieldNames(Collection.java:24)
		//       at com.comp2014group5.generic_database.Collection.getNewRecord(Collection.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the int recordCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testRecordCount_1()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);

		int result = fixture.recordCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2014group5.generic_database.Collection.recordCount(Collection.java:66)
		assertEquals(0, result);
	}

	/**
	 * Run the void saveRecord(Record) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSaveRecord_1()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);
		Record record = new Record();

		fixture.saveRecord(record);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2014group5.generic_database.Collection.saveRecord(Collection.java:53)
	}

	/**
	 * Run the void saveRecordFromJSONObject(JSONObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSaveRecordFromJSONObject_1()
		throws Exception {
		Collection fixture = new Collection((DBCollection) null);
		JSONObject jsonObject = new JSONObject();

		fixture.saveRecordFromJSONObject(jsonObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2014group5.generic_database.Collection.saveRecordFromJSONObject(Collection.java:58)
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
		new org.junit.runner.JUnitCore().run(CollectionTest.class);
	}
}