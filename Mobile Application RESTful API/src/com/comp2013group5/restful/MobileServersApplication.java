package com.comp2013group5.restful;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.json.JSONObject;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import com.comp2014.group5.form_database.FormAccessor;

public class MobileServersApplication extends Application {

	private ConcurrentMap<String, JSONObject> items = new ConcurrentHashMap<String, JSONObject>();

	public MobileServersApplication() {
		this.setName("Mobile Server Application");
	}

	@Override
	public synchronized Restlet createInboundRoot() {

		Router router = new Router(getContext());

		router.attach("/form/", FormsResource.class);
		router.attach("/forms/{formName}/", FormResource.class);

		return router;
	}

	public ConcurrentMap<String, JSONObject> getItems() {
		return items;
	}
}
