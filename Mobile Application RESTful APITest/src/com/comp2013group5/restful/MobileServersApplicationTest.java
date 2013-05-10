package com.comp2013group5.restful;

import org.junit.*;
import static org.junit.Assert.*;
import org.restlet.Restlet;

/**
 * The class <code>MobileServersApplicationTest</code> contains tests for the class <code>{@link MobileServersApplication}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:57 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class MobileServersApplicationTest {
	/**
	 * Run the MobileServersApplication() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testMobileServersApplication_1()
		throws Exception {

		MobileServersApplication result = new MobileServersApplication();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFinderClass());
		assertEquals(null, result.getOutboundRoot());
		assertEquals(null, result.createOutboundRoot());
		assertEquals(null, result.getApplication());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getAuthor());
		assertEquals(null, result.getOwner());
		assertEquals("Mobile Server Application", result.getName());
		assertEquals(null, result.getContext());
		assertEquals(true, result.isStopped());
		assertEquals(false, result.isStarted());
	}

	/**
	 * Run the Restlet createInboundRoot() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testCreateInboundRoot_1()
		throws Exception {
		MobileServersApplication fixture = new MobileServersApplication();

		Restlet result = fixture.createInboundRoot();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getApplication());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getAuthor());
		assertEquals(null, result.getOwner());
		assertEquals("org.restlet.routing.Router@143bacac", result.getName());
		assertEquals(null, result.getContext());
		assertEquals(true, result.isStopped());
		assertEquals(false, result.isStarted());
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
		new org.junit.runner.JUnitCore().run(MobileServersApplicationTest.class);
	}
}