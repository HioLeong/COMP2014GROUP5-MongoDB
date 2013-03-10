package com.comp2014group5.generic_database;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class FormDatabaseMongoImpl {

	private MongoClient mongoClient;
	private DB database;

	public FormDatabaseMongoImpl() throws UnknownHostException {
		this(new MongoClient("localhost"));
	}

	public FormDatabaseMongoImpl(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
		this.database = mongoClient
				.getDB(mongoClient.getDatabaseNames().get(0));
	}

	public List<String> getDatabaseNames() {
		return mongoClient.getDatabaseNames();
	}

	public void setDatabase(String dbName) {
		database = mongoClient.getDB(dbName);
	}

	public void addCollection(String collectionName) {
		database.createCollection(collectionName, null);
	}

	public Collection getCollection(String collectionName)
			throws MongoException {
		DBCollection collection = database.getCollection(collectionName);
		return new Collection(collection);
	}

	public List<String> getCollectionNames() {
		return new ArrayList<String>(database.getCollectionNames());
	}

	public void quit() {
		mongoClient.close();
	}

}