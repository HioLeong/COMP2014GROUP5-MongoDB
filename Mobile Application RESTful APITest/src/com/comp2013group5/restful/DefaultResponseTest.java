package com.comp2013group5.restful;

import org.junit.*;
import static org.junit.Assert.*;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;

/**
 * The class <code>DefaultResponseTest</code> contains tests for the class <code>{@link DefaultResponse}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:57 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class DefaultResponseTest {
	/**
	 * Run the DefaultResponse(Context) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testDefaultResponse_1()
		throws Exception {
		Context context = new Context();

		DefaultResponse result = new DefaultResponse(context);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getApplication());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getAuthor());
		assertEquals(null, result.getOwner());
		assertEquals("com.comp2013group5.restful.DefaultResponse@31be6372", result.getName());
		assertEquals(true, result.isStopped());
		assertEquals(false, result.isStarted());
	}

	/**
	 * Run the void handle(Request,Response) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:57 AM
	 */
	@Test
	public void testHandle_1()
		throws Exception {
		DefaultResponse fixture = new DefaultResponse(new Context());
		Request request = new Request();
		Response response = Response.getCurrent();

		fixture.handle(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.comp2013group5.restful.DefaultResponse.handle(DefaultResponse.java:17)
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
		new org.junit.runner.JUnitCore().run(DefaultResponseTest.class);
	}
}