package com.comp2013group5.form.dao;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.comp2013group5.form.model.FormWidget;

public interface FormWidgetDao {

	public List<FormWidget> getAll();
	
	public JSONObject getAllAsJSON() throws JSONException;

}
