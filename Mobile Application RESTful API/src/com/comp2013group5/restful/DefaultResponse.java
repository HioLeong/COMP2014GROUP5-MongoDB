package com.comp2013group5.restful;

import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Restlet;
import org.restlet.data.MediaType;

public class DefaultResponse extends Restlet {

	public DefaultResponse(Context context) {
		super(context);
	}

	@Override
	public void handle(Request request, Response response) {
		response.setEntity("Default", MediaType.TEXT_PLAIN);
	}

}
