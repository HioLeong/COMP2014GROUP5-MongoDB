package com.comp2013group5.restful;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import com.comp2014.group5.form_database.FormAccessor;

public class FormsResource extends ServerResource {

	@Post("json")
	public String acceptItem(String formJSONString) {
		try {
			JSONObject formJSONObject = new JSONObject(formJSONString);
			return formJSONObject.toString();
		} catch (JSONException e) {
			return generateErrorString();
		}
	}

	@Get
	public String getFormsList() {
		String IP = MobileServersApplication.IP_STRING;
		FormAccessor formAccessor = new FormAccessor(IP);
		return formAccessor.getFormNames().toString();
	}

	private String generateErrorString() {
		return "Error";
	}

}
