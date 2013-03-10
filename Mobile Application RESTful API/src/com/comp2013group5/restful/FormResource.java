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
	}

	@Get
	public String getForm() {
		formAccessor = new FormAccessor("localhost");
		return formAccessor.getFormNames().get(0);
		
	}

}
