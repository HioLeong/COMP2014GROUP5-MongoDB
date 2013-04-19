package com.comp2014group5.results;

import android.widget.EditText;

public class EditTextResultHandler implements ResultHandler {

	private String key;
	private EditText et;

	public EditTextResultHandler(EditText et) {
		this("", et);
	}

	public EditTextResultHandler(String key, EditText et) {
		this.key = key;
		this.et = et;
	}

	@Override
	public ResultEntry getResult() {

		ResultEntry result = new ResultEntry();
		result.setKey(key);
		result.setValue(et.getText().toString());

		return result;
	}

}
