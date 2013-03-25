package test.comp2014.group5.form_database;

import static org.junit.Assert.*;

import org.junit.Test;

import com.comp2013group5.form.model.Form;

public class FormAccessorTest {

	@Test
	public void testStoringForm() {
	}

	@Test
	public void testRetrievingForm() {
		Form expectedForm = new Form();
		Form actualForm = new Form(); // Get the form from the database.
		
		assertEquals(expectedForm, actualForm);
	}
}
