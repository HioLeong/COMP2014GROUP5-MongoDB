package com.comp2013group5.form.model;

import org.json.JSONException;
import org.json.JSONObject;

public class DatePicker extends FormWidget {

	private String startDate;
	
	public DatePicker() {
		
	}

	public DatePicker(JSONObject jsonWrapperObj) {
		try {
			JSONObject jsonObj = jsonWrapperObj.getJSONObject("date-picker");
			setId((String) jsonObj.get("id"));
			setName((String) jsonObj.get("name"));
			setStartDate((String) jsonObj.get("start-date"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	@Override
	public JSONObject toJSONObject() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("date-picker", getJSONContent());
		return jsonObject;
	}

	private JSONObject getJSONContent() throws JSONException {

		JSONObject content = new JSONObject();

		content.put("id", getId());
		content.put("name", getName());
		content.put("start-date", getStartDate());

		return content;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
