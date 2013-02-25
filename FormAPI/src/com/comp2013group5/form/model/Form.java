package com.comp2013group5.form.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class Form {

	private String name;
	private List<FormWidget> formWidgets = new ArrayList<FormWidget>();

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
