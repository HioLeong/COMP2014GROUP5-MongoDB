package com.comp2013group5.restful;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class MobileServersApplication extends Application {
	
	public final static String IP_STRING = "localhost";

	public MobileServersApplication() {
		this.setName("Mobile Server Application");
	}

	@Override
	public synchronized Restlet createInboundRoot() {

		Router router = new Router(getContext());

		router.attach("/forms", FormsResource.class);
		router.attach("/forms/{formName}", FormResource.class);
		router.attach("/patients/",PatientsResource.class);
		router.attach("/patients/{patientId}/week/{weekNum}/",PatientResource.class);
		
		return router;
	}

}
