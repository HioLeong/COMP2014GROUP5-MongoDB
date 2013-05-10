package com.comp2014group5.model.nhs;

import org.json.JSONObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NSTTest</code> contains tests for the class <code>{@link NST}</code>.
 *
 * @generatedBy CodePro at 5/10/13 1:20 PM
 * @author root
 * @version $Revision: 1.0 $
 */
public class NSTTest {
	/**
	 * Run the NST() constructor test.
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testNST_1()
		throws Exception {
		NST result = new NST();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the int getAppetiteScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetAppetiteScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		int result = fixture.getAppetiteScore();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the float getHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetHeight_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		float result = fixture.getHeight();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the int getIntakeScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetIntakeScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		int result = fixture.getIntakeScore();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getNeurologicalScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetNeurologicalScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		int result = fixture.getNeurologicalScore();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Patient getPatient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetPatient_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		Patient result = fixture.getPatient();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getAdmissionDate());
		assertEquals(null, result.getHospitalNumber());
	}

	/**
	 * Run the int getPhysicalAppearenceScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetPhysicalAppearenceScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		int result = fixture.getPhysicalAppearenceScore();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getWeekNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetWeekNumber_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		int result = fixture.getWeekNumber();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the float getWeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetWeight_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		float result = fixture.getWeight();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the int getWeightLossScore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testGetWeightLossScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		int result = fixture.getWeightLossScore();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setAppetiteScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetAppetiteScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		int appetiteScore = 1;

		fixture.setAppetiteScore(appetiteScore);

		// add additional test code here
	}

	/**
	 * Run the void setHeight(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetHeight_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		float height = 1.0f;

		fixture.setHeight(height);

		// add additional test code here
	}

	/**
	 * Run the void setIntakeScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetIntakeScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		int intakeScore = 1;

		fixture.setIntakeScore(intakeScore);

		// add additional test code here
	}

	/**
	 * Run the void setNeurologicalScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetNeurologicalScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		int neurologicalScore = 1;

		fixture.setNeurologicalScore(neurologicalScore);

		// add additional test code here
	}

	/**
	 * Run the void setPatient(Patient) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetPatient_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		Patient patient = new Patient();

		fixture.setPatient(patient);

		// add additional test code here
	}

	/**
	 * Run the void setPhysicalAppearenceScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetPhysicalAppearenceScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		int physicalAppearenceScore = 1;

		fixture.setPhysicalAppearenceScore(physicalAppearenceScore);

		// add additional test code here
	}

	/**
	 * Run the void setWeekNumber(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetWeekNumber_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		int weekNumber = 1;

		fixture.setWeekNumber(weekNumber);

		// add additional test code here
	}

	/**
	 * Run the void setWeight(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetWeight_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		float weight = 1.0f;

		fixture.setWeight(weight);

		// add additional test code here
	}

	/**
	 * Run the void setWeightLossScore(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testSetWeightLossScore_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());
		int weightLossScore = 1;

		fixture.setWeightLossScore(weightLossScore);

		// add additional test code here
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_1()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_2()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_3()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_4()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_5()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_6()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_7()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_8()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_9()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
	}

	/**
	 * Run the JSONObject toJSONObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/10/13 1:20 PM
	 */
	@Test
	public void testToJSONObject_10()
		throws Exception {
		NST fixture = new NST();
		fixture.setWeightLossScore(1);
		fixture.setHeight(1.0f);
		fixture.setWeekNumber(1);
		fixture.setNeurologicalScore(1);
		fixture.setPhysicalAppearenceScore(1);
		fixture.setWeight(1.0f);
		fixture.setIntakeScore(1);
		fixture.setAppetiteScore(1);
		fixture.setPatient(new Patient());

		JSONObject result = fixture.toJSONObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("{\"physical-appearence\":1,\"height\":1,\"weight\":1,\"intake\":1,\"weight-loss\":1,\"neurological\":1,\"week-number\":1,\"appetite\":1}", result.toString());
		assertEquals(8, result.length());
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
		new org.junit.runner.JUnitCore().run(NSTTest.class);
	}
}