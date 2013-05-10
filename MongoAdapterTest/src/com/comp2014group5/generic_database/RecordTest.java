package com.comp2014group5.generic_database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import com.comp2014group5.generic_database.exception.InvalidKeyException;

/**
 * The class <code>RecordTest</code> contains tests for the class <code>{@link Record}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:20 PM
 * @author root
 * @version $Revision: 1.0 $
 */
public class RecordTest {
	/**
	 * Run the Record() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testRecord_1()
		throws Exception {

		Record result = new Record();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Record(List<String>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testRecord_2()
		throws Exception {
		List<String> validKeys = new ArrayList<String>();

		Record result = new Record(validKeys);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object get(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		Record fixture = new Record(new ArrayList<String>());
		String key = "";

		Object result = fixture.get(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<String, Object> getFields() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetFields_1()
		throws Exception {
		Record fixture = new Record(new ArrayList<String>());

		Map<String, Object> result = fixture.getFields();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void put(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test(expected = com.comp2014group5.generic_database.exception.InvalidKeyException.class)
	public void testPut_1()
		throws Exception {
		Record fixture = new Record(new ArrayList<String>());
		String key = "";
		Object value = new Object();

		fixture.put(key, value);

		// add additional test code here
	}

	/**
	 * Run the void put(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test(expected = com.comp2014group5.generic_database.exception.InvalidKeyException.class)
	public void testPut_2()
		throws Exception {
		Record fixture = new Record(new ArrayList<String>());
		String key = "";
		Object value = new Object();

		fixture.put(key, value);

		// add additional test code here
	}

	/**
	 * Run the void putAll(Map<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testPutAll_1()
		throws Exception {
		Record fixture = new Record(new ArrayList<String>());
		Map<String, Object> values = new HashMap<String, Object>();

		fixture.putAll(values);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(RecordTest.class);
	}
}