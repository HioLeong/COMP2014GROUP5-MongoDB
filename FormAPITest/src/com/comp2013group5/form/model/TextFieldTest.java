package com.comp2013group5.form.model;

import org.json.JSONObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TextFieldTest</code> contains tests for the class <code>{@link TextField}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:48 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class TextFieldTest {
	/**
	 * Run the TextField() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testTextField_1()
		throws Exception {

		TextField result = new TextField();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputType());
		assertEquals(null, result.getDefaultText());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the TextField(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testTextField_2()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		TextField result = new TextField(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputType());
		assertEquals(null, result.getDefaultText());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the TextField(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testTextField_3()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		TextField result = new TextField(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputType());
		assertEquals(null, result.getDefaultText());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the TextField(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testTextField_4()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		TextField result = new TextField(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputType());
		assertEquals(null, result.getDefaultText());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the TextField(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testTextField_5()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		TextField result = new TextField(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputType());
		assertEquals(null, result.getDefaultText());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the TextField(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testTextField_6()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		TextField result = new TextField(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputType());
		assertEquals(null, result.getDefaultText());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the TextField(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testTextField_7()
		throws Exception {
		JSONObject jsonWrapperObj = new JSONObject();

		TextField result = new TextField(jsonWrapperObj);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getInputType());
		assertEquals(null, result.getDefaultText());
		assertEquals(null, result.getName());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the String getDefaultText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetDefaultText_1()
		throws Exception {
		TextField fixture = new TextField();
		fixture.setInputType("");
		fixture.setDefaultText("");

		String result = fixture.getDefaultText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getInputType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetInputType_1()
		throws Exception {
		TextField fixture = new TextField();
		fixture.setInputType("");
		fixture.setDefaultText("");

		String result = fixture.getInputType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setDefaultText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testSetDefaultText_1()
		throws Exception {
		TextField fixture = new TextField();
		fixture.setInputType("");
		fixture.setDefaultText("");
		String defaultText = "";

		fixture.setDefaultText(defaultText);

		// add additional test code here
	}

	/**
	 * Run the void setInputType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testSetInputType_1()
		throws Exception {
		TextField fixture = new TextField();
		fixture.setInputType("");
		fixture.setDefaultText("");
		String inputType = "";

		fixture.setInputType(inputType);

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
		TextField fixture = new TextField();
		fixture.setInputType("");
		fixture.setDefaultText("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"text-field\":{\"default-text\":\"\",\"input-type\":\"\"}}", result.toString());
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
		TextField fixture = new TextField();
		fixture.setInputType("");
		fixture.setDefaultText("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"text-field\":{\"default-text\":\"\",\"input-type\":\"\"}}", result.toString());
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
		TextField fixture = new TextField();
		fixture.setInputType("");
		fixture.setDefaultText("");

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"text-field\":{\"default-text\":\"\",\"input-type\":\"\"}}", result.toString());
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
		new org.junit.runner.JUnitCore().run(TextFieldTest.class);
	}
}