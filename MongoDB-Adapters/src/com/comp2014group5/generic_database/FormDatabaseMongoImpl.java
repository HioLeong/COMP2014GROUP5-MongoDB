package com.comp2014group5.generic_database;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class FormDatabaseMongoImpl {

	private List<String> fieldName = new ArrayList<String>();
	private MongoClient mongoClient;
	private DB database;
	private Collection collection;

	public FormDatabaseMongoImpl() throws UnknownHostException {
		this(new MongoClient("localhost"));
	}

	public FormDatabaseMongoImpl(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
		this.database = mongoClient
				.getDB(mongoClient.getDatabaseNames().get(0));
	}

	public void addField(String field) {
		fieldName.add(field);
	}

	public void addRecord(String collectionName, Record record) {

	}

	public void addCollection(String collectionName) {
		database.createCollection(collectionName, null);
	}

	public List<String> getCollectionField(String collection) {
		return null;
	}

	public void quit() {
		mongoClient.close();
	}

	private class Collection {

		private DBCollection collection;

		public Collection(DBCollection collection) {
			this.collection = collection;
		}

		public List<String> getFieldNames() {
			List<String> fieldNames = new ArrayList<String>();

			if (collection.count() > 0) {
				fieldName.addAll(collection.findOne().keySet());
			}

			return fieldNames;
		}
		
		

	}

	
	//TODO: Sort out this mess
	private class Record {

		private Map<String, Object> fields = new HashMap<String, Object>();

		public void put(String key, Object value) {
			fields.put(key, value);
		}

		public Object get(String key) {
			return fields.get(key);
		}

		public Map<String, Object> getFields() {
			return fields;
		}

	}

}
