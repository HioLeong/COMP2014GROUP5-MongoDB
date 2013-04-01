package com.comp2014.group5.webservices;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.comp2013group5.form.model.CheckGroup;
import com.comp2013group5.form.model.DatePicker;
import com.comp2013group5.form.model.DropDown;
import com.comp2013group5.form.model.Form;
import com.comp2013group5.form.model.FormWidget;
import com.comp2013group5.form.model.RadioGroup;
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

	public Form getForm() {
		Form form = new Form();
		StringTokenizer tokenizer = new StringTokenizer(queryString, "&");
		while (tokenizer.hasMoreTokens()) {
			String nextToken = tokenizer.nextToken();
			if (nextToken.contains("form-name")) {
				form.setName(getSingleValue(nextToken));	
			}
		}

		for (FormWidget widget : getFormComponents()) {
			form.addFormWidget(widget);
		}
		return form;
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
		if (type.contains("radio-group")) {
			return getRadioGroup(tokenizer);
		}

		if (type.contains("date-picker")) {
			return getDatePicker(tokenizer);
		}

		if (type.contains("drop-down")) {
			return getDropDown(tokenizer);
		}
		return null;
	}

	private FormWidget getDatePicker(StringTokenizer tokenizer) {
		DatePicker datePicker = new DatePicker();
		for (int i = 0; i < NUMBER_OF_PARAMETERS; i++) {

			String nextToken = tokenizer.nextToken();

			if (nextToken.contains("id")) {
				datePicker.setId(getSingleValue(nextToken));
			}

			if (nextToken.contains("name")) {
				datePicker.setName(getSingleValue(nextToken));
			}

			if (nextToken.contains("starting-date")) {
				datePicker.setStartDate(getSingleValue(nextToken));
			}
		}

		return datePicker;
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

	private RadioGroup getRadioGroup(StringTokenizer tokenizer) {
		RadioGroup radioGroup = new RadioGroup();
		for (int i = 0; i < NUMBER_OF_PARAMETERS; i++) {

			String nextToken = tokenizer.nextToken();

			if (nextToken.contains("id")) {
				radioGroup.setId(getSingleValue(nextToken));
			}
			if (nextToken.contains("name")) {
				radioGroup.setName(getSingleValue(nextToken));
			}
			if (nextToken.contains("options")) {
				radioGroup.setOptions(getListValues(nextToken));
			}

		}

		return radioGroup;
	}

	private DropDown getDropDown(StringTokenizer tokenizer) {
		DropDown dropDown = new DropDown();
		for (int i = 0; i < NUMBER_OF_PARAMETERS; i++) {
			String nextToken = tokenizer.nextToken();

			if (nextToken.contains("id")) {
				dropDown.setId(getSingleValue(nextToken));
			}

			if (nextToken.contains("name")) {
				dropDown.setName(getSingleValue(nextToken));
			}

			if (nextToken.contains("options")) {
				dropDown.setOptions(getListValues(nextToken));
			}

		}
		return dropDown;
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
