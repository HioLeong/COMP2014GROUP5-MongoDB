package com.comp2013group5.restful;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ValidKeyResourceTest</code> contains tests for the class <code>{@link ValidKeyResource}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:57 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class ValidKeyResourceTest {
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
		ValidKeyResource fixture = new ValidKeyResource();

		fixture.doInit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2013group5.restful.ValidKeyResource.doInit(ValidKeyResource.java:12)
	}

	/**
	 * Run the String getValidKeys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testGetValidKeys_1()
		throws Exception {
		ValidKeyResource fixture = new ValidKeyResource();

		String result = fixture.getValidKeys();

		// add additional test code here
		assertEquals("To be implemented", result);
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
		new org.junit.runner.JUnitCore().run(ValidKeyResourceTest.class);
	}
}