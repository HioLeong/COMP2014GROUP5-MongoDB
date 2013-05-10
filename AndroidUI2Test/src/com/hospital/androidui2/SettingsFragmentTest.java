package com.hospital.androidui2;

import org.junit.*;
import android.os.Bundle;
import static org.junit.Assert.*;

/**
 * The class <code>SettingsFragmentTest</code> contains tests for the class <code>{@link SettingsFragment}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:41 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class SettingsFragmentTest {
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
		SettingsFragment fixture = new SettingsFragment();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.app.Fragment.<init>(Fragment.java:19)
		//       at android.preference.PreferenceFragment.<init>(PreferenceFragment.java:9)
		//       at com.hospital.androidui2.SettingsFragment.<init>(SettingsFragment.java:12)
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
		new org.junit.runner.JUnitCore().run(SettingsFragmentTest.class);
	}
}