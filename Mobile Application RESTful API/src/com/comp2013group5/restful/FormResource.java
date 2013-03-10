package com.comp2013group5.restful;

import org.json.JSONObject;
import org.restlet.resource.Get;

import com.comp2014.group5.form_database.FormAccessor;

public class FormResource extends BaseResource {

	private static final String IP_STRING = "localhost";

	private String formName;
	private JSONObject formJSONObject;
	private FormAccessor formAccessor;

	@Override
	public void doInit() {
		formName = (String) getRequestAttributes().get("formName");
		formAccessor = new FormAccessor(IP_STRING);
		
	}

	@Get
	public String getForm() {
		return formAccessor.getFormString(formName);
	}

}
