package com.comp2013group5.form.model;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CheckGroup extends FormWidget {

	private List<String> options;

	public CheckGroup() {

	}

	public CheckGroup(JSONObject jsonWrapperObj) {
		try {

			JSONObject jsonObj = jsonWrapperObj.getJSONObject("check-group");

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

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	@Override
	public JSONObject toJSONObject() throws JSONException {

		JSONObject out = new JSONObject();

		out.put("check-group", getJSONContent());

		return out;
	}

	private JSONObject getJSONContent() throws JSONException {

		JSONObject content = new JSONObject();

		content.put("id", getId());
		content.put("name", getName());
		content.put("options", options);

		return content;
	}

}
