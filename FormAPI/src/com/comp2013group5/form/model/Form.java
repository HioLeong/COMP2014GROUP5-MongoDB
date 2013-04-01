package com.comp2013group5.form.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Form {

	private String name;
	private List<FormWidget> formWidgets = new ArrayList<FormWidget>();

	public Form() {

	}

	public Form(JSONObject jsonObject) {
		try {
			name = jsonObject.getString("name");
			JSONArray formWidgetJSONArray = jsonObject.getJSONArray("form");
			for (int i = 0; i < formWidgetJSONArray.length(); i++) {
				JSONObject formWidgetJSONObj = formWidgetJSONArray
						.getJSONObject(i);
				formWidgets.add(getWidgetFromJSONObject(formWidgetJSONObj));
			}
		} catch (JSONException e) {

		}
	}

	private FormWidget getWidgetFromJSONObject(JSONObject jsonObject) {
		String type = (String) jsonObject.keys().next();
		if (type.equals("text-field")) {
			return new TextField(jsonObject);
		}
		if (type.equals("radio-group")) {
			return new RadioGroup(jsonObject);
		}
		if (type.equals("check-group")) {
			return new CheckGroup(jsonObject);
		}
		if (type.equals("drop-down")) {
			return new DropDown(jsonObject);
		}
		if (type.equals("date-picker")) {
			return new DatePicker(jsonObject);
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FormWidget> getFormWidgets() {
		return formWidgets;
	}

	public void addFormWidget(FormWidget formWidget) {
		formWidgets.add(formWidget);
	}

	public List<JSONObject> getFormWidgetJSONObjects() throws JSONException {
		List<JSONObject> formWidgetJSONObjects = new ArrayList<JSONObject>();
		for (FormWidget formWidget : formWidgets) {
			formWidgetJSONObjects.add(formWidget.toJSONObject());
		}
		return formWidgetJSONObjects;
	}

	public JSONObject toJSONObject() throws JSONException {

		JSONObject formJSONObject = new JSONObject();
		formJSONObject.put("name", getName());
		formJSONObject.put("form", getFormWidgetJSONObjects());

		return formJSONObject;
	}

}
