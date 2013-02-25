package com.comp2013group5.form.model;

import org.json.JSONException;
import org.json.JSONObject;

public class DatePicker extends FormWidget {

	private String startDate;
	
	@Override
	public JSONObject toJSONObject() throws JSONException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
}
