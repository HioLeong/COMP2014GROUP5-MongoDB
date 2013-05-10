package com.comp2013group5.form.model;

import java.util.List;
import org.json.JSONObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FormTest</code> contains tests for the class <code>{@link Form}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:48 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class FormTest {
	/**
	 * Run the Form() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testForm_1()
		throws Exception {

		Form result = new Form();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
	}

	/**
	 * Run the Form(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testForm_2()
		throws Exception {
		JSONObject jsonObject = new JSONObject();

		Form result = new Form(jsonObject);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
	}

	/**
	 * Run the Form(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testForm_3()
		throws Exception {
		JSONObject jsonObject = new JSONObject();

		Form result = new Form(jsonObject);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
	}

	/**
	 * Run the Form(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testForm_4()
		throws Exception {
		JSONObject jsonObject = new JSONObject();

		Form result = new Form(jsonObject);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
	}

	/**
	 * Run the Form(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testForm_5()
		throws Exception {
		JSONObject jsonObject = new JSONObject();

		Form result = new Form(jsonObject);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
	}

	/**
	 * Run the Form(JSONObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testForm_6()
		throws Exception {
		JSONObject jsonObject = new JSONObject();

		Form result = new Form(jsonObject);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
	}

	/**
	 * Run the void addFormWidget(FormWidget) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testAddFormWidget_1()
		throws Exception {
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());
		FormWidget formWidget = new CheckGroup();

		fixture.addFormWidget(formWidget);

		// add additional test code here
	}

	/**
	 * Run the List<JSONObject> getFormWidgetJSONObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetFormWidgetJSONObjects_1()
		throws Exception {
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		List<JSONObject> result = fixture.getFormWidgetJSONObjects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<JSONObject> getFormWidgetJSONObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetFormWidgetJSONObjects_2()
		throws Exception {
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		List<JSONObject> result = fixture.getFormWidgetJSONObjects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<JSONObject> getFormWidgetJSONObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetFormWidgetJSONObjects_3()
		throws Exception {
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		List<JSONObject> result = fixture.getFormWidgetJSONObjects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the List<FormWidget> getFormWidgets() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetFormWidgets_1()
		throws Exception {
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		List<FormWidget> result = fixture.getFormWidgets();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());
		String name = "";

		fixture.setName(name);

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
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"form\":[{\"check-group\":{\"options\":[]}}],\"name\":\"\"}", result.toString());
		assertEquals(2, result.length());
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
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"form\":[{\"check-group\":{\"options\":[]}}],\"name\":\"\"}", result.toString());
		assertEquals(2, result.length());
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
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"form\":[{\"check-group\":{\"options\":[]}}],\"name\":\"\"}", result.toString());
		assertEquals(2, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test
	public void testToJSONObject_4()
		throws Exception {
		Form fixture = new Form();
		fixture.setName("");
		fixture.addFormWidget(new CheckGroup());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"form\":[{\"check-group\":{\"options\":[]}}],\"name\":\"\"}", result.toString());
		assertEquals(2, result.length());
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
		new org.junit.runner.JUnitCore().run(FormTest.class);
	}
}