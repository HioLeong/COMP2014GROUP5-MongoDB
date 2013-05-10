package com.comp2013group5.operation;

import java.io.FileNotFoundException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JSONReaderTest</code> contains tests for the class <code>{@link JSONReader}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:48 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class JSONReaderTest {
	/**
	 * Run the String fileToJSONString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToJSONString_1()
		throws Exception {
		JSONReader fixture = new JSONReader();
		String path = "";

		String result = fixture.fileToJSONString(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String fileToJSONString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToJSONString_2()
		throws Exception {
		JSONReader fixture = new JSONReader();
		String path = "";

		String result = fixture.fileToJSONString(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String fileToJSONString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToJSONString_3()
		throws Exception {
		JSONReader fixture = new JSONReader();
		String path = "";

		String result = fixture.fileToJSONString(path);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String fileToJSONString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:48 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testFileToJSONString_4()
		throws Exception {
		JSONReader fixture = new JSONReader();
		String path = "";

		String result = fixture.fileToJSONString(path);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(JSONReaderTest.class);
	}
}