package com.comp2014group5.generic_database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.comp2014group5.generic_database.exception.InvalidKeyException;

public class Record {

	private Map<String, Object> fields = new HashMap<String, Object>();
	private List<String> validKeys;
	
	public Record() {
		this(new ArrayList<String>());
	}

	public Record(List<String> validKeys) {
		this.validKeys = validKeys;
	}

	public void put(String key, Object value) throws InvalidKeyException {
		if (validKeys.contains(key)) {
			fields.put(key, value);
		} else {
			throw new InvalidKeyException();
		}
	}
	
	public void putAll(Map<String, Object> values) {
		fields.putAll(values);
	}

	public Object get(String key) {
		return fields.get(key);
	}

	public Map<String, Object> getFields() {
		return fields;
	}

}
