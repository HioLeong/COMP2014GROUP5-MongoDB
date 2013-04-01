package com.comp2013group5.form.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DropDown extends FormWidget {

	private List<String> options;

	public DropDown() {

	}

	public DropDown(JSONObject jsonWrapperObj) {

		try {
			JSONObject jsonObj = jsonWrapperObj.getJSONObject("drop-down");
			setId((String) jsonObj.get("id"));
			setName((String) jsonObj.get("name"));

			JSONArray optionsArray = jsonObj.getJSONArray("options");
			options = new ArrayList<String>();
			for (int i = 0; i < optionsArray.length(); i++) {
				options.add(optionsArray.getString(i));
			}

		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	@Override
	public JSONObject toJSONObject() throws JSONException {
		JSONObject wrapperObject = new JSONObject();
		wrapperObject.put("drop-down", getJSONContent());
		return wrapperObject;

	}

	public JSONObject getJSONContent() throws JSONException {
		JSONObject content = new JSONObject();
		content.put("id", getId());
		content.put("name", getName());
		content.put("options", getOptions());
		return content;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

}
