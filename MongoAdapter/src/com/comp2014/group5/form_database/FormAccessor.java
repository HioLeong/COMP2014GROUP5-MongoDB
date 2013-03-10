package com.comp2014.group5.form_database;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.comp2013group5.form.model.Form;
import com.comp2014group5.generic_database.Collection;
import com.comp2014group5.generic_database.FormDatabaseMongoImpl;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class FormAccessor {

	private final static String FORM_COLLECTION = "forms";

	private Collection formCollection;

	public FormAccessor(String ip) {

		MongoClient mongoClient;
		try {
			mongoClient = new MongoClient(ip);
			FormDatabaseMongoImpl fDb = new FormDatabaseMongoImpl(mongoClient);
			fDb.setDatabase("nhs_db");
			formCollection = fDb.getCollection(FORM_COLLECTION);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public void saveForm(Form form) {
		try {
			JSONObject formJSONObject = form.toJSONObject();
			formCollection.saveRecordFromJSONObject(formJSONObject);
		} catch (JSONException e) {

		}
	}

	public List<String> getFormNames() {
		List<String> formNames = new ArrayList<String>();

		DBCursor formCursor = formCollection.getDBCollection().find();
		while (formCursor.hasNext()) {
			DBObject formDBObject = formCursor.next();
			String formName = (String) formDBObject.get("name");
			formNames.add(formName);
		}

		return formNames;
	}

	public String getFormString(String formName) {
		DBObject query = new BasicDBObject();
		query.put("name", formName);
		return formCollection.getDBCollection().find(query).next().toString();
	}

}