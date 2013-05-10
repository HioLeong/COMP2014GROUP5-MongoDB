package com.comp2013group5.form.model;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CheckGroupTest</code> contains tests for the class <code>{@link CheckGroup}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:48 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class CheckGroupTest {
	/**
	 * Run the CheckGroup() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testCheckGroup_1()
		throws Exception {

		CheckGroup result = new CheckGroup();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOptions());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CheckGroup(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testCheckGroup_2()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		CheckGroup result = new CheckGroup(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOptions());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CheckGroup(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testCheckGroup_3()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		CheckGroup result = new CheckGroup(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOptions());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CheckGroup(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testCheckGroup_4()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		CheckGroup result = new CheckGroup(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOptions());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CheckGroup(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testCheckGroup_5()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		CheckGroup result = new CheckGroup(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOptions());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CheckGroup(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testCheckGroup_6()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		CheckGroup result = new CheckGroup(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOptions());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CheckGroup(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testCheckGroup_7()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		CheckGroup result = new CheckGroup(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOptions());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CheckGroup(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testCheckGroup_8()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		CheckGroup result = new CheckGroup(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOptions());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the List<String> getOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetOptions_1()
		throws Exception {
		CheckGroup fixture = new CheckGroup();
		fixture.setOptions(new ArrayList<String>());

		List<String> result = fixture.getOptions();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setOptions(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testSetOptions_1()
		throws Exception {
		CheckGroup fixture = new CheckGroup();
		fixture.setOptions(new ArrayList<String>());
		List<String> options = new ArrayList<String>();

		fixture.setOptions(options);

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
		CheckGroup fixture = new CheckGroup();
		fixture.setOptions(new ArrayList<String>());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"check-group\":{\"options\":[]}}", result.toString());
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
		CheckGroup fixture = new CheckGroup();
		fixture.setOptions(new ArrayList<String>());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"check-group\":{\"options\":[]}}", result.toString());
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
		CheckGroup fixture = new CheckGroup();
		fixture.setOptions(new ArrayList<String>());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"check-group\":{\"options\":[]}}", result.toString());
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
		new org.junit.runner.JUnitCore().run(CheckGroupTest.class);
	}
}