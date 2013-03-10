package com.comp2013group5.restful;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class MobileServersApplication extends Application {

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

}
