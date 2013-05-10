package com.hospital.androidui2;

import org.junit.*;
import android.os.Bundle;
import static org.junit.Assert.*;

/**
 * The class <code>SettingsActivityTest</code> contains tests for the class <code>{@link SettingsActivity}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:41 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class SettingsActivityTest {
	/**
	 * Run the void onCreate(Bundle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:41 AM
	 */
	@Test
	public void testOnCreate_1()
		throws Exception {
		SettingsActivity fixture = new SettingsActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at com.hospital.androidui2.SettingsActivity.<init>(SettingsActivity.java:9)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/10/13 1:41 AM
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
	 * @generatedBy CodePro at 5/10/13 1:41 AM
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
	 * @generatedBy CodePro at 5/10/13 1:41 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SettingsActivityTest.class);
	}
}