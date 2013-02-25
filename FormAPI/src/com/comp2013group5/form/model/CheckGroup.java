package com.comp2013group5.form.model;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class CheckGroup extends FormWidget  {

	private List<String> options;

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
