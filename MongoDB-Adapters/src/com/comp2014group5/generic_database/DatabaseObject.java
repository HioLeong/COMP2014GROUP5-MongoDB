package com.comp2014group5.generic_database;

import java.util.HashMap;
import java.util.Map;

public abstract class DatabaseObject {

	private Map<String, Object> fields = new HashMap<String, Object>();

	public void put(String key, Object value) {
		fields.put(key, value);
	}

	public Object get(String key) {
		return fields.get(key);
	}

}
