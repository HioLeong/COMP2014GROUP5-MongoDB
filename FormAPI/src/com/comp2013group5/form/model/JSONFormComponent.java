package com.comp2013group5.form.model;

import org.json.JSONException;
import org.json.JSONObject;

public interface JSONFormComponent {

	public JSONObject toJSONObject() throws JSONException;

}
