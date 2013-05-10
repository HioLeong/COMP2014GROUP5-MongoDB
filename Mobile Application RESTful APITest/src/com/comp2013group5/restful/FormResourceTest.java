package com.comp2013group5.restful;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FormResourceTest</code> contains tests for the class <code>{@link FormResource}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:57 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class FormResourceTest {
	/**
	 * Run the FormResource() constructor test.
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testFormResource_1()
		throws Exception {
		FormResource result = new FormResource();
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
		FormResource fixture = new FormResource();

		fixture.doInit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2013group5.restful.FormResource.doInit(FormResource.java:16)
	}

	/**
	 * Run the String getForm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testGetForm_1()
		throws Exception {
		FormResource fixture = new FormResource();

		String result = fixture.getForm();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2013group5.restful.FormResource.getForm(FormResource.java:22)
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
		new org.junit.runner.JUnitCore().run(FormResourceTest.class);
	}
}