package com.hospital.androidui2;

import org.junit.*;
import android.content.Context;
import android.widget.ListView;
import android.view.View;
import android.os.Bundle;
import static org.junit.Assert.*;

/**
 * The class <code>FormListActivityTest</code> contains tests for the class <code>{@link FormListActivity}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:41 AM
 * @author root
 * @version $Revision: 1.0 $
 */
public class FormListActivityTest {
	/**
	 * Run the FormListActivity() constructor test.
	 *
	 * @generatedBy CodePro at 5/10/13 1:41 AM
	 */
	@Test
	public void testFormListActivity_1()
		throws Exception {
		FormListActivity result = new FormListActivity();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void onClick() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:41 AM
	 */
	@Test
	public void testOnClick_1()
		throws Exception {
		FormListActivity fixture = new FormListActivity();

		fixture.onClick();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at android.app.ListActivity.<init>(ListActivity.java:5)
		//       at com.hospital.androidui2.FormListActivity.<init>(FormListActivity.java:27)
	}

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
		FormListActivity fixture = new FormListActivity();
		Bundle savedInstanceState = new Bundle();

		fixture.onCreate(savedInstanceState);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at android.app.ListActivity.<init>(ListActivity.java:5)
		//       at com.hospital.androidui2.FormListActivity.<init>(FormListActivity.java:27)
	}

	/**
	 * Run the void onListItemClick(ListView,View,int,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:41 AM
	 */
	@Test
	public void testOnListItemClick_1()
		throws Exception {
		FormListActivity fixture = new FormListActivity();
		ListView l = new ListView(new MainActivity());
		View v = new View(new MainActivity());
		int position = 1;
		long id = 1L;

		fixture.onListItemClick(l, v, position, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Stub!
		//       at android.content.Context.<init>(Context.java:4)
		//       at android.content.ContextWrapper.<init>(ContextWrapper.java:5)
		//       at android.view.ContextThemeWrapper.<init>(ContextThemeWrapper.java:5)
		//       at android.app.Activity.<init>(Activity.java:6)
		//       at android.app.ListActivity.<init>(ListActivity.java:5)
		//       at com.hospital.androidui2.FormListActivity.<init>(FormListActivity.java:27)
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
		new org.junit.runner.JUnitCore().run(FormListActivityTest.class);
	}
}