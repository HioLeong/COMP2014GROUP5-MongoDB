package com.hospital.androidui2;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/10/13 1:41 AM
 * @author root
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	FormListActivityTest.class,
	SettingsFragmentTest.class,
	MainActivityTest.class,
	SecondActivityTest.class,
	SettingsActivityTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/10/13 1:41 AM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAllFiles.class });
	}
}
