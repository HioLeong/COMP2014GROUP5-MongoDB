package com.comp2013group5.restful;

import org.restlet.resource.Get;

import com.comp2014.group5.form_database.FormAccessor;

public class ValidKeyResource extends BaseResource {

	private String formName;
	
	public void doInit() {
		formName = (String) getRequestAttributes().get("formName");
		FormAccessor formAccessor = new FormAccessor("localhost");
	}
	
	@Get 
	public String getValidKeys() {
		return "To be implemented";
	}
	
}
