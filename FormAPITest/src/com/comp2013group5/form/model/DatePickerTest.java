package com.comp2013group5.form.model;

import org.json.JSONObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DatePickerTest</code> contains tests for the class <code>{@link DatePicker}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:48 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class DatePickerTest {
	/**
	 * Run the DatePicker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testDatePicker_1()
		throws Exception {

		DatePicker result = new DatePicker();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStartDate());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the DatePicker(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testDatePicker_2()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		DatePicker result = new DatePicker(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStartDate());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the DatePicker(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testDatePicker_3()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		DatePicker result = new DatePicker(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStartDate());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the DatePicker(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testDatePicker_4()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		DatePicker result = new DatePicker(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStartDate());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the DatePicker(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testDatePicker_5()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		DatePicker result = new DatePicker(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStartDate());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the DatePicker(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testDatePicker_6()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		DatePicker result = new DatePicker(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStartDate());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the String getStartDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetStartDate_1()
		throws Exception {
		DatePicker fixture = new DatePicker();
		fixture.setStartDate("");

		String result = fixture.getStartDate();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setStartDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testSetStartDate_1()
		throws Exception {
		DatePicker fixture = new DatePicker();
		fixture.setStartDate("");
		String startDate = "";

		fixture.setStartDate(startDate);

		// add additional test code here
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testToJSONObject_1()
		throws Exception {
		DatePicker fixture = new DatePicker();
		fixture.setStartDate("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"date-picker\":{\"start-date\":\"\"}}", result.toString());
		assertEquals(1, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testToJSONObject_2()
		throws Exception {
		DatePicker fixture = new DatePicker();
		fixture.setStartDate("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"date-picker\":{\"start-date\":\"\"}}", result.toString());
		assertEquals(1, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testToJSONObject_3()
		throws Exception {
		DatePicker fixture = new DatePicker();
		fixture.setStartDate("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"date-picker\":{\"start-date\":\"\"}}", result.toString());
		assertEquals(1, result.length());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
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
	 * @generatedBy CodePro at 5/10/13 1:48 AM
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
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DatePickerTest.class);
	}
}