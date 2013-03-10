package com.comp2013group5.restful;

import java.util.concurrent.ConcurrentMap;

import org.json.JSONObject;
import org.restlet.resource.ServerResource;

public abstract class BaseResource extends ServerResource{

	public ConcurrentMap<String, JSONObject> getItems() {
		return ((MobileServersApplication) getApplication()).getItems();
	}
	
}
