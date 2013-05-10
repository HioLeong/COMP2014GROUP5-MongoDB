package com.comp2014group5.generic_database;

import java.io.IOException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FormAccessorTerminalTest</code> contains tests for the class <code>{@link FormAccessorTerminal}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:20 PM
 * @author root
 * @version $Revision: 1.0 $
 */
public class FormAccessorTerminalTest {
	/**
	 * Run the FormAccessorTerminal() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testFormAccessorTerminal_1()
		throws Exception {

		FormAccessorTerminal result = new FormAccessorTerminal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FormAccessorTerminal() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testFormAccessorTerminal_2()
		throws Exception {

		FormAccessorTerminal result = new FormAccessorTerminal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInput(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetInput_1()
		throws Exception {
		FormAccessorTerminal fixture = new FormAccessorTerminal();
		String message = "";

		String result = fixture.getInput(message);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInput(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetInput_2()
		throws Exception {
		FormAccessorTerminal fixture = new FormAccessorTerminal();
		String message = "";

		String result = fixture.getInput(message);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetOption_1()
		throws Exception {
		FormAccessorTerminal fixture = new FormAccessorTerminal();

		int result = fixture.getOption();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetOption_2()
		throws Exception {
		FormAccessorTerminal fixture = new FormAccessorTerminal();

		int result = fixture.getOption();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testGetOption_3()
		throws Exception {
		FormAccessorTerminal fixture = new FormAccessorTerminal();

		int result = fixture.getOption();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void mainMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testMainMenu_1()
		throws Exception {
		FormAccessorTerminal fixture = new FormAccessorTerminal();

		fixture.mainMenu();

		// add additional test code here
	}

	/**
	 * Run the void mainMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testMainMenu_2()
		throws Exception {
		FormAccessorTerminal fixture = new FormAccessorTerminal();

		fixture.mainMenu();

		// add additional test code here
	}

	/**
	 * Run the void newFormMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testNewFormMenu_1()
		throws Exception {
		FormAccessorTerminal fixture = new FormAccessorTerminal();

		fixture.newFormMenu();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
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
	 * @generatedBy CodePro at 5/10/13 1:20 PM
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
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FormAccessorTerminalTest.class);
	}
}