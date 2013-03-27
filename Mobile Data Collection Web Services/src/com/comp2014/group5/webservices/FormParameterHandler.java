package com.comp2014.group5.webservices;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.comp2013group5.form.model.CheckGroup;
import com.comp2013group5.form.model.FormWidget;
import com.comp2013group5.form.model.TextField;

public class FormParameterHandler {

	private static final int NUMBER_OF_PARAMETERS = 9;

	private String queryString;

	public FormParameterHandler(String queryString) {
		try {
			this.queryString = URLDecoder.decode(queryString, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public List<FormWidget> getFormComponents() {
		List<FormWidget> formWidgets = new ArrayList<FormWidget>();
		StringTokenizer tokenizer = new StringTokenizer(queryString, "&");
		while (tokenizer.hasMoreTokens()) {
			FormWidget nextWidget = getNextFormWidget(tokenizer);
			if (nextWidget != null) {
				formWidgets.add(nextWidget);
			}
		}
		return formWidgets;
	}

	private FormWidget getNextFormWidget(StringTokenizer tokenizer) {
		String type = tokenizer.nextToken();
		if (type.contains("text-field")) {
			return getTextField(tokenizer);
		}
		if (type.contains("check-group")) {
			return getCheckGroup(tokenizer);
		}
		
		// If no types matcheds
		return null;
	}

	private TextField getTextField(StringTokenizer tokenizer) {
		TextField textField = new TextField();
		for (int i = 0; i < NUMBER_OF_PARAMETERS; i++) {

			String nextToken = tokenizer.nextToken();

			if (nextToken.contains("id")) {
				textField.setId(getSingleValue(nextToken));
			}

			if (nextToken.contains("name")) {
				textField.setName(getSingleValue(nextToken));
			}

			if (nextToken.contains("default-text")) {
				textField.setDefaultText(getSingleValue(nextToken));
			}

			if (nextToken.contains("input-type")) {
				textField.setInputType(getSingleValue(nextToken));
			}
		}
		return textField;
	}

	private CheckGroup getCheckGroup(StringTokenizer tokenizer) {
		CheckGroup checkGroup = new CheckGroup();
		for (int i = 0; i < NUMBER_OF_PARAMETERS; i++) {

			String nextToken = tokenizer.nextToken();

			if (nextToken.contains("id")) {
				checkGroup.setId(getSingleValue(nextToken));
			}
			if (nextToken.contains("name")) {
				checkGroup.setName(getSingleValue(nextToken));
			}
			if (nextToken.contains("options")) {
				checkGroup.setOptions(getListValues(nextToken));
			}

		}
		return checkGroup;
	}

	private String getSingleValue(String statement) {
		int valueIndex = statement.indexOf("=") + 1;
		return statement.substring(valueIndex);
	}

	private List<String> getListValues(String statement) {
		List<String> values = new ArrayList<String>();
		String value = getSingleValue(statement);

		StringTokenizer tokenizer = new StringTokenizer(value, ",");
		while (tokenizer.hasMoreTokens()) {
			String nextToken = tokenizer.nextToken();
			values.add(nextToken);
		}

		return values;
	}
	
}
