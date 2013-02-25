package com.comp2013group5.restful;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

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

	private String generateErrorString() {
		return "Error";
	}

}
