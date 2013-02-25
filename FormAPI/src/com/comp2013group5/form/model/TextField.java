package com.comp2013group5.form.model;

import org.json.JSONException;
import org.json.JSONObject;

public class TextField extends FormWidget {

	public final static String TYPE_TEXT = "text";
	public final static String TYPE_NUM = "number";
	public final static String TYPE_EMAIL = "email";
	public final static String TYPE_PHONE = "phone";

	private String inputType;
	private String defaultText;

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	@Override
	public JSONObject toJSONObject() throws JSONException {

		JSONObject formWidget = new JSONObject();

		formWidget.put("text-field", getJSONContent());

		return formWidget;
	}

	private JSONObject getJSONContent() throws JSONException {

		JSONObject content = new JSONObject();

		content.put("id", getId());
		content.put("name", getName());
		content.put("input-type", inputType);
		content.put("default-text", getDefaultText());

		return content;
	}

	public String getDefaultText() {
		return defaultText;
	}

	public void setDefaultText(String defaultText) {
		this.defaultText = defaultText;
	}

}
