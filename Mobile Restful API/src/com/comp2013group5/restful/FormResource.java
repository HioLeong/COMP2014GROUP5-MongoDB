package com.comp2013group5.restful;

import org.json.JSONObject;
import org.restlet.resource.Get;

public class FormResource extends BaseResource {

	private String formName;
	private JSONObject formJSONObject;

	@Override
	public void doInit() {
		formName = (String) getRequest().getAttributes().get("formName");
		formJSONObject = getItems().get(formName);
		setExisting(formJSONObject != null);
	}
	
	@Get 
	public String getForm() {
		return formJSONObject.toString();
	}
	
}
