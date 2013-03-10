package com.comp2013group5.form.test;

import java.util.logging.Logger;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.comp2013group5.form.model.TextField;

public class JsonTest {

	Logger logger = Logger.getLogger("JSON test");

	@Test
	public void testToJSONObject() {
		TextField textField = new TextField();
		textField.setName("name");
		textField.setInputType(TextField.TYPE_TEXT);

		try {
			JSONObject jsonObj = textField.toJSONObject();
			String outStr = jsonObj.toString();
			System.out.print(outStr);
		} catch (JSONException e) {
			System.out.println("Invalid JSON object");
		}

	}

}
