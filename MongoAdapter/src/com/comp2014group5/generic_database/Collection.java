package com.comp2014group5.generic_database;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class Collection {

	private DBCollection collection;

	public Collection(DBCollection collection) {
		this.collection = collection;
	}

	public List<String> getFieldNames() {
		List<String> fieldNames = new ArrayList<String>();

		if (collection.count() > 0) {
			fieldNames.addAll(collection.findOne().keySet());
		}

		return fieldNames;
	}

	public Record getNewRecord() {
		return new Record(getFieldNames());
	}

	/**
	 * Gets a list of the record from the current {@link Collection}
	 * 
	 * @return a list of {@link Record}
	 */
	public List<Record> getAllRecords() {
		List<Record> records = new ArrayList<Record>();
		for (DBObject dbObject : collection.find()) {
			Record record = new Record(getFieldNames());
			record.putAll(dbObject.toMap());
			records.add(record);
		}
		return records;
	}

	public void saveRecord(Record record) {
		DBObject saveObject = new BasicDBObject();
		saveObject.putAll(record.getFields());
		collection.save(saveObject);
	}

	public void saveRecordFromJSONObject(JSONObject jsonObject) {
		DBObject dbObject = (DBObject) JSON.parse(jsonObject.toString());
		collection.save(dbObject);
	}

	public DBCollection getDBCollection() {
		return collection;
	}

	public int recordCount() {
		return collection.find().length();
	}

}
